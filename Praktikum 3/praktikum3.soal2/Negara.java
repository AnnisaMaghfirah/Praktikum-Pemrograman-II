/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal2;

/**
 *
 * @author BISMILLAH
 */

import java.util.HashMap;
import java.util.Scanner;

public class Negara {
    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggalKemerdekaan;
    private int bulanKemerdekaan;
    private int tahunKemerdekaan;
    
    public Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan){
        this.nama = nama;
        this.jenisKepemimpinan = jenisKepemimpinan;
        this.namaPemimpin = namaPemimpin;
        this.tanggalKemerdekaan = tanggalKemerdekaan;
        this.bulanKemerdekaan = bulanKemerdekaan;
        this.tahunKemerdekaan = tahunKemerdekaan;
    }

    //Encapsulation
    public int getBulan(){
        return bulanKemerdekaan;
    }
    
    void getData(){
        Scanner scn = new Scanner(System.in);
        nama = scn.nextLine();
        jenisKepemimpinan = scn.nextLine();
        namaPemimpin = scn.nextLine();
        
        if (jenisKepemimpinan.equalsIgnoreCase("presiden")||jenisKepemimpinan.equalsIgnoreCase("perdana menteri")){
            tanggalKemerdekaan = scn.nextInt();
            bulanKemerdekaan = scn.nextInt();
            tahunKemerdekaan = scn.nextInt();
        }
    }

    void tampilkan(){
        HashMap<Integer, String> bulanKemerdekaan = new HashMap<Integer, String>();
        bulanKemerdekaan.put(1, "Januari");
        bulanKemerdekaan.put(2, "Februari");
        bulanKemerdekaan.put(3, "Maret");
        bulanKemerdekaan.put(4, "April");
        bulanKemerdekaan.put(5, "Mei");
        bulanKemerdekaan.put(6, "Juni");
        bulanKemerdekaan.put(7, "Juli");
        bulanKemerdekaan.put(8, "Agustus");
        bulanKemerdekaan.put(9, "September");
        bulanKemerdekaan.put(10, "Oktober");
        bulanKemerdekaan.put(11, "November");
        bulanKemerdekaan.put(12, "Desember");
        
        System.out.println(" ");
        
        if (jenisKepemimpinan.equalsIgnoreCase("presiden")){
            System.out.println("Negara " + nama + " mempunyai Presiden bernama " + namaPemimpin);
        }
        
        else if (jenisKepemimpinan.equalsIgnoreCase("perdana menteri")){
            System.out.println("Negara " + nama + " mempunyai Perdana Menteri bernama " + namaPemimpin);
        }
        
        else if (jenisKepemimpinan.equalsIgnoreCase("monarki")){
            System.out.println("Negara " + nama + " mempunyai Raja bernama " + namaPemimpin);
        }
                
        if (jenisKepemimpinan.equalsIgnoreCase("presiden")||jenisKepemimpinan.equalsIgnoreCase("perdana menteri")){
            System.out.println("Deklarasi Kemerdekaan pada Tanggal " + tanggalKemerdekaan + " " + bulanKemerdekaan.get(getBulan()) + " " + tahunKemerdekaan);
        }
    }
}
