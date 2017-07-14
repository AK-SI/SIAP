/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  su
 * Created: May 11, 2017
 */

select id_transaksi, nama, tanggal, total_bayar from transaksi inner join pelanggan
    on transaksi.id_pelanggan = pelanggan.id_pelanggan limit 50