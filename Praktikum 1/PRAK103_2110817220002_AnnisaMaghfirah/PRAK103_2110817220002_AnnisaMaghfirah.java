/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak103_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */
import java.util.Scanner;

public class PRAK103_2110817220002_AnnisaMaghfirah {

    public static void main(String[] args) {
        
        //deklarasi program
        int angka, i = 5;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan: ");
        angka = keyboard.nextInt();
        
        System.out.println("Output");
        do {            
            if (angka % 7 != 0){
                if (i == 5){
                   System.out.print(angka);
                } else {
                   System.out.print(", " + angka + " ");
                }
            }
            
            angka--;
            i--;
        } while (i > 0);
    }
}
