/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak105_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class PRAK105_2110817220002_AnnisaMaghfirah {

    public static void main(String[] args) {
        
        //deklarasi program
        float jari_jari, tinggi, volume;
        final float PHI = 3.14f;
        
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.###");
        
        System.out.print("Masukkan jari-jari: ");
        jari_jari = keyboard.nextFloat();
        
        System.out.print("Masukkan tinggi: ");
        tinggi = keyboard.nextFloat();
        
        //Rumus Volume Tabung
        volume = PHI * jari_jari * jari_jari * tinggi;
        
        //Output
        System.out.println("Volume tabung dengan jari-jari " + jari_jari + " cm" + " dan");
        System.out.println("tinggi " + tinggi + " cm" + " adalah " + df.format(volume) + " m3");
    }
}
