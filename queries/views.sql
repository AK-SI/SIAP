/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  RahmatSubekti
 * Created: 24-May-2017
 */
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
     pelanggan.`id_pelanggan`, pelanggan.`nama`

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
     transaksi.`id_transaksi`, pelanggan.`nama`,transaksi.`tanggal`,transaksi.`total_bayar`