/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum2.soal3;

/**
 *
 * @author BISMILLAH
 */

public class Soal3Main {
    public static void main(String[] args){
        Pegawai p1 = new Pegawai();
        //Pada baris ke-16 mengalami error. Karena kurangnya titik koma (;) pada akhir katanya.
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Menambahkan umur dan valuenya yang sudah ditentukan oleh output.
        p1.umur = 17;
        
        //Pada baris ke-24 ini, tidak sesuai dengan output. Karena pada output cuman menampilkan Nama saja, sehingga kata "Pegawai" di sini akan kita hapus.
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada baris ke-31 mengalami error. Karena umur belum kita tambahkan dan belum memiliki value.
        //Sehingga, langkah yang kita lakukan adalah dengan cara menambahkan umur dan valuenya (sesuai dengan output) pada baris ke-21.
        //Pada baris ke-31 juga masih ada kekurangan dalam hal penulisan, yaitu kurangnya kata untuk mencetak kata "tahun".
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
