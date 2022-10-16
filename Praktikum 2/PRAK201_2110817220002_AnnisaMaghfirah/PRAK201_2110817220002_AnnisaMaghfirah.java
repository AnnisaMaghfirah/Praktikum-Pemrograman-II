/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak201_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */

        //Membuat Class dengan nama class Mangga
        class Mangga{
            
        //Deklarasi Variabel dan Atribut
        String namaMangga;
        String warnaMangga;
        String teksturMangga;
        String rasaMangga;
        double beratMangga;
        int hargaMangga;
        int jumlahBeliMangga;
        double totalBeratMangga;
        int totalHargaMangga;
        
        //Constructor dengan Parameter
        Mangga(String namaMangga, String warnaMangga, String teksturMangga, String rasaMangga, double beratMangga, int hargaMangga, int jumlahBeliMangga) {
        
        //Masukkan Nilai Ke Dalam Objek
            this.namaMangga = namaMangga;
            this.warnaMangga = warnaMangga;
            this.teksturMangga = teksturMangga;
            this.rasaMangga = rasaMangga;
            this.beratMangga = beratMangga;
            this.hargaMangga = hargaMangga;
            this.jumlahBeliMangga = jumlahBeliMangga;
            this.totalBeratMangga = beratMangga * jumlahBeliMangga;
            this.totalHargaMangga = hargaMangga * jumlahBeliMangga;
            
        //Menampilkan Nilai yang Dimasukkan ke Dalam Objek
            System.out.println("Nama Mangga : " + this.namaMangga);
            System.out.println("Berat : " + this.beratMangga + " kg");
            System.out.println("Jumlah Beli : " + this.jumlahBeliMangga);
            System.out.println("Total berat : " + this.totalBeratMangga + " kg");
            System.out.println("Total harga : " + "Rp. " + this.totalHargaMangga);
            System.out.println(" ");
            } 
        }

public class PRAK201_2110817220002_AnnisaMaghfirah {

    public static void main(String[] args) {
               
        //Membuat Objek
        Mangga Arumanis = new Mangga("Arumanis", "hijau kekuning-kuningan", "lembut", "manis", 0.3, 5000, 13);
        Mangga Manalagi = new Mangga("Manalagi", "hijau", "kasar", "manis", 0.5, 7500, 17);
        Mangga Madu = new Mangga("Mangga Madu", "kuning", "lembut", "manis", 0.375, 6500, 12);
    }
}
