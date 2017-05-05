/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  su
 * Created: May 4, 2017
 */

create table pelanggan(
    id_pelanggan varchar(8) constraint pk_pelanggan primary key,
    nama varchar(15) not null,
    telpon varchar(14) not null,
    alamat varchar(60)
)engine=innodb;

create table karyawan(
    nik varchar(7) constraint pk_karyawan primary key,
    nama varchar(20) not null,
    telpon varchar(14) not null,
    alamat varchar(60) not null,
    jabatan varchar(15)
)engine=innodb;

create table login_karyawan(
    nik varchar(7) constraint fk_karyawan not null,
    akses varchar(10) not null,
    password varchar(15) not null,
    foreign key (nik) references karyawan(nik)
)engine=innodb;

create table supplier(
    id_supplier varchar(6) constraint pk_supplier primary key,
    nama varchar(20) not null,
    telpon varchar(14) not null,
    alamat varchar(60)
)engine=innodb;

create table jenis_obat(
    id_jenis varchar(5) constraint pk_jenis_obat primary key,
    jenis varchar(15) not null,
    keterangan varchar(100)
)engine=innodb;

create table obat(
    id_obat varchar(6) constraint pk_obat primary key,
    nama_obat varchar(20) not null,
    id_jenis varchar(5) constraint fk_jenis_obat not null,
    id_supplier varchar(6) constraint fk_supplier not null,
    harga_beli int not null,
    harga_jual int not null,
    stok int not null,
    foreign key (id_jenis) references jenis_obat(id_jenis),
    foreign key (id_supplier) references supplier(id_supplier)
)engine=innodb;

create table transaksi(
    id_transaksi varchar(9) constraint pk_transaksi primary key,
    id_pelanggan constraint fk_pelanggan,
    tanggan date not null,
    total_bayar int not null,
    foreign key (id_pelanggan) references pelanggan(id_pelanggan)
)engine=innodb;

create table det_transaksi(
    id_transaksi varchar(9) constraint fk_transaksi,
    id_obat varchar(6) constraint fk_obat,
    jumlah int not null,
    total_harga int not null,
    foreign key (id_transaksi) references transaksi(id_transaksi),
    foreign key (id_obat) references obat(id_obat),
)engine=innodb;
