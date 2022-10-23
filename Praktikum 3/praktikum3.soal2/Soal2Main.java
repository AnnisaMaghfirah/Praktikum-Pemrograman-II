/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal2;

/**
 *
 * @author BISMILLAH
 */

import java.util.LinkedList;
import java.util.Scanner;

public class Soal2Main {
    public static void main(String[] args){
        String nama = " ";
        String jenisKepemimpinan = " ";
        String namaPemimpin = " ";
        int tanggalKemerdekaan = 0;
        int bulanKemerdekaan = 0;
        int tahunKemerdekaan = 0;
        
    Scanner input = new Scanner(System.in);
    
    LinkedList<Negara> ObjekNegara = new LinkedList<Negara>();
    
    int ulang;
    ulang = input.nextInt();
    
    for (int i = 0; i < ulang; i++){
        Negara inputNegara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
        inputNegara.getData();
        ObjekNegara.add(inputNegara);
        }
    
    for (int i = 0; i < ObjekNegara.size(); i++){
        Negara printNegara = ObjekNegara.get(i);
        printNegara.tampilkan();
        }
    }
}
