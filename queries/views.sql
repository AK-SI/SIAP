-- DATA PELANGGAN AKTIF
create view pelanggan_aktif as
SELECT
     pelanggan.`id_pelanggan` AS id_pelanggan,
     pelanggan.`nama` AS nama,
     count(transaksi.`id_pelanggan`) as total_transaksi,
     sum(transaksi.`total_bayar`) as total_pembayaran,
     sum(det_transaksi.`jumlah`) as total_pembelian
FROM
     `pelanggan` pelanggan INNER JOIN `transaksi` transaksi ON pelanggan.`id_pelanggan` = transaksi.`id_pelanggan`
     INNER JOIN `det_transaksi` det_transaksi ON transaksi.`id_transaksi` = det_transaksi.`id_transaksi`
where 
     month(transaksi.`tanggal`) = month(now()) 
group by 
     pelanggan.`id_pelanggan`, pelanggan.`nama`;

-- DATA TRANSAKSI
create view data_transaksi as
SELECT
     transaksi.`id_transaksi` AS transaksi_id_transaksi,
     pelanggan.`nama` AS pelanggan_nama,
     transaksi.`tanggal` AS transaksi_tanggal,
     sum(det_transaksi.`jumlah`) as jumlah,
     transaksi.`total_bayar` AS transaksi_total_bayar
FROM
     `pelanggan` pelanggan INNER JOIN `transaksi` transaksi ON pelanggan.`id_pelanggan` = transaksi.`id_pelanggan`
     INNER JOIN `det_transaksi` det_transaksi ON transaksi.`id_transaksi` = det_transaksi.`id_transaksi`
group by
     transaksi.`id_transaksi`, pelanggan.`nama`,transaksi.`tanggal`,transaksi.`total_bayar`;

-- DATA OBAT TERJUAL
create view obat_terjual as
SELECT
     obat.`id_obat` AS obat_id_obat,
     obat.`nama_obat` AS obat_nama_obat,
     sum(det_transaksi.`jumlah`) as terjual,
     sum(det_transaksi.`total_harga`) as haga_terjual,
     count(transaksi.`id_transaksi`) as dalam_transaksi
FROM
     `obat` obat INNER JOIN `det_transaksi` det_transaksi ON obat.`id_obat` = det_transaksi.`id_obat`
     INNER JOIN `transaksi` transaksi ON det_transaksi.`id_transaksi` = transaksi.`id_transaksi`
group by
     obat.`id_obat`, obat.`nama_obat`;

--DATA OBAT
create view data_obat as
SELECT
     obat.`id_obat` AS obat_id_obat,
     obat.`nama_obat` AS obat_nama_obat,
     jenis_obat.`jenis` AS jenis_obat_jenis,
     supplier.`nama` AS supplier_nama,
     obat.`stok` AS obat_stok
FROM
     `jenis_obat` jenis_obat INNER JOIN `obat` obat ON jenis_obat.`id_jenis` = obat.`id_jenis`
     INNER JOIN `supplier` supplier ON obat.`id_supplier` = supplier.`id_supplier`;

