/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak201_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */

public class Mangga {
    //Deklarasi Tipe Data dan Atribut
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
    public Mangga(String nM, String wM, String tM, String rM, double bM, int hM, int jBM, double tBM, int tHM){
        //Masukkan Nilai ke Dalam Atribut Mangga
        namaMangga = nM;
        warnaMangga = wM;
        teksturMangga = tM;
        rasaMangga = rM;
        beratMangga = bM;
        hargaMangga = hM;
        jumlahBeliMangga = jBM;
        totalBeratMangga = bM * jBM;
        totalHargaMangga = hM * jBM;
        }
    
    //Menampilkan Display dari Atribut Mangga
    public void display(){
        System.out.println("Nama Mangga : " + namaMangga);
        System.out.println("Berat : " + beratMangga + " kg");
        System.out.println("Jumlah Beli : " + jumlahBeliMangga);
        System.out.println("Total berat : " + totalBeratMangga + " kg");
        System.out.println("Total harga : Rp. " + totalHargaMangga);
        System.out.println(" ");
    }
}
