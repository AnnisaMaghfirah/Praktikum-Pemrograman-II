/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak101_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */
import java.util.Scanner;

public class PRAK101_2110817220002_AnnisaMaghfirah {

    public static void main(String[] args) {
        
        // mendeklarasi variabel
        String namaLengkap, tempatLahir;
        int tanggalLahir, bulanLahir, tahunLahir, tinggiBadan;
        float beratBadan;
    
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Lengkap: ");
        namaLengkap = keyboard.nextLine();
        
        System.out.print("Masukkan Tempat Lahir: ");
        tempatLahir = keyboard.nextLine();
        
        System.out.print("Masukkan Tanggal Lahir: ");
        tanggalLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Bulan Lahir: ");
        bulanLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tahun Lahir: ");
        tahunLahir = keyboard.nextInt();
        
        System.out.print("Masukkan Tinggi Badan: ");
        tinggiBadan = keyboard.nextInt();
        
        System.out.print("Masukkan Berat Badan: ");
        beratBadan = keyboard.nextFloat();
        
        String bulan = "a";
        if ( bulanLahir == 1) {
        bulan = "Januari";
    }
        else if ( bulanLahir == 2) {
        bulan = "Februari";
    }
        else if ( bulanLahir == 3) {
        bulan = "Maret";
    }
        else if ( bulanLahir == 4) {
        bulan = "April";
    }
        else if ( bulanLahir == 5) {
        bulan = "Mei";
    }
        else if ( bulanLahir == 6) {
        bulan = "Juni";
    }
        else if ( bulanLahir == 7) {
        bulan = "Juli";
    }
        else if ( bulanLahir == 8) {
        bulan = "Agustus";
    }
        else if ( bulanLahir == 9) {
        bulan = "September";
    }
        else if ( bulanLahir == 10) {
        bulan = "Oktober";
    }
        else if ( bulanLahir == 11) {
        bulan = "November";
    }
        else if ( bulanLahir == 12) {
        bulan = "Desember";
    }
        else {
        bulan = "Pilihan Tidak Tersedia";
    }
        System.out.println("Output");
        System.out.println("Data Telah Ditambahkan,");
        System.out.print("Nama Lengkap " + namaLengkap);
        System.out.print(", Lahir di " + tempatLahir);
        System.out.print(" pada Tanggal " + tanggalLahir);
        System.out.print(" " + bulan);
        System.out.println(" " + tahunLahir);
        System.out.print("Tinggi Badan " + tinggiBadan + " cm");
        System.out.println(" dan Berat Badan " + beratBadan + " kilogram");
    }   
}
