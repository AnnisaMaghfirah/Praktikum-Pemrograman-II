/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum2.soal2;

/**
 *
 * @author BISMILLAH
 */

//Awal Melengkapi Kode
//Membuat Class
class Mobil {
    String merek;
    String tahun_keluaran;
    int kapasitas;
    int harga;
    String pemilik;

    String getPemilik() {
        //Mengembalikan Nilai Pemilik
        return this.pemilik;
    }
    
    int getPajak() {
        this.harga = this.harga * 2/100;
        //Mengembalikan Nilai dari Pajak
        return this.harga;
    }
    
    void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }
    
    void info() {
        System.out.println("Merek Mobil: " + this.merek);
        System.out.println("Harga: Rp. " + this.harga);
        System.out.println("Tahun keluaran: " + this.tahun_keluaran);
        System.out.println("Kapasitas: " + this.kapasitas + "cc");
    }
}

public class Soal2Main {

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merek = "Toyota Raize";
        mobil1.tahun_keluaran = "2021";
        mobil1.kapasitas = 988;
        mobil1.harga = 202700000;
        
        mobil1.info();
        mobil1.setPemilik("Kasel");
        System.out.println("Pemilik Mobil: " + mobil1.getPemilik());
        System.out.println("Pajak Mobil: Rp. " + mobil1.getPajak());
    }
}
