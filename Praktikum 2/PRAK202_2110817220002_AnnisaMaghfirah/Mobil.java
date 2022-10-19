/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prak202_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */

import java.text.DecimalFormat;
public class Mobil {
    //Deklarasi Tipe Data dan Atribut
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    String pemilik;

    DecimalFormat formatter = new DecimalFormat("#,###,###");
    DecimalFormat formatter1 = new DecimalFormat("###,###,###");
    
    String getPemilik() {
        //Mengembalikan Nilai Pemilik
        return this.pemilik;
    }
    
    String getPajak() {
        int harga = this.harga * 2 / 100;
        //Mengembalikan Nilai dari Harga
        return formatter.format(harga);    
    }
    
    void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    void info() {
        System.out.println("Merek Mobil: " + merek);
        System.out.println("Harga: Rp. " + formatter1.format(harga));
        System.out.println("Tahun keluaran: " + tahun_keluaran);
        System.out.println("Kapasitas: " + kapasitas + "cc");
    }
}
