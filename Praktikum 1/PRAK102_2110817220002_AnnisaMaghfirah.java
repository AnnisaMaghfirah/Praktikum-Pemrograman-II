/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak102_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */
import java.util.Scanner;

public class PRAK102_2110817220002_AnnisaMaghfirah {
    
    public static void main(String[] args) {
        
        //deklarasi program
        int angka, bilangan, i = 6;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Masukkan Bilangan: ");
        angka = keyboard.nextInt();
        
        System.out.println("Output");
        
        i = 6;
        while (i >= 0) {            
            if (angka % 2 == 0){
                bilangan = (angka / 2) - 1;
            } else {
                bilangan = angka;
            }
            
            if (i == 6){
               System.out.print(bilangan);
            } else {
               System.out.print(", " + bilangan + " ");
            }
            
            angka++;
            i--;
        }
    }
}
