create table pelanggan(
    id_pelanggan varchar(8) primary key,
    nama varchar(15) not null,
    telpon varchar(14) not null,
    alamat varchar(60)
)engine=innodb;

create table karyawan(
    nik varchar(7) primary key,
    nama varchar(20) not null,
    telpon varchar(14) not null,
    alamat varchar(60) not null,
    jabatan varchar(15)
)engine=innodb;

create table login_karyawan(
    nik varchar(7) not null,
    akses varchar(10) not null,
    password varchar(15) not null,
    foreign key (nik) references karyawan(nik)
)engine=innodb;

create table supplier(
    id_supplier varchar(6) primary key,
    nama varchar(20) not null,
    telpon varchar(14) not null,
    alamat varchar(60)
)engine=innodb;

create table jenis_obat(
    id_jenis varchar(5) primary key,
    jenis varchar(15) not null,
    keterangan text
)engine=innodb;

create table obat(
    id_obat varchar(6) primary key,
    nama_obat varchar(20) not null,
    id_jenis varchar(5) not null,
    id_supplier varchar(6) not null,
    harga_beli int not null,
    harga_jual int not null,
    stok int not null,
    foreign key (id_jenis) references jenis_obat(id_jenis),
    foreign key (id_supplier) references supplier(id_supplier)
)engine=innodb;

create table transaksi(
    id_transaksi varchar(9) primary key,
    id_pelanggan varchar(8),
    tanggan date not null,
    total_bayar int not null,
    foreign key (id_pelanggan) references pelanggan(id_pelanggan)
)engine=innodb;

create table det_transaksi(
    id_transaksi varchar(9),
    id_obat varchar(6),
    jumlah int not null,
    total_harga int not null,
    foreign key (id_transaksi) references transaksi(id_transaksi),
    foreign key (id_obat) references obat(id_obat)
)engine=innodb;