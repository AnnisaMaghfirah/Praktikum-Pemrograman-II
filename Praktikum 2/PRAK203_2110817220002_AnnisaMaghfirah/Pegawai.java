/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2.soal3;

/**
 *
 * @author BISMILLAH
 */

//Pada baris ke-13 mengalami error. Karena pada public class nya tidak sesuai dengan nama file java nya. Seharusnya sesuaikan dengan nama file yang tertera pada soal, yaitu Pegawai.
//public class Employee {
public class Pegawai {
    public String nama;
    //Pada baris ke-17 akan mengalami error apabila kita tidak mengubah tipe data tersebut dari char menjadi String. Karena char hanya bisa merepresentasikan satu karakter saja, sedangkan String dapat digunakan untuk menyimpan sekumpulan karakter.
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    
    public String getNama() {
        return nama;
    }
    
    //Pada baris ke-28 mengalami error. Karena pada baris ke-17 tipe datanya tidak sesuai, yaitu char. Dan pada baris ke-28 tipe datanya tidak sesuai, yaitu String.
    //Maka dari itu, untuk menjalankannya kita harus mengubah tipe data pada baris ke-17 menjadi String.
    public String getAsal() {
        return asal;
    }
    
    //Pada baris ke-33 mengalami error. Karena tidak ada baris yang mendeklarasikan sebuah variabel j.
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
    