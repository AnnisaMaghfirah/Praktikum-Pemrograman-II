/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak104_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */
import java.util.Scanner;

public class PRAK104_2110817220002_AnnisaMaghfirah {

    public static void main(String[] args) {
        
        //deklarasi program
        int Andi, andiRonde1, andiRonde2, andiRonde3, Budi, budiRonde1, budiRonde2, budiRonde3;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Kartu Andi: ");
        andiRonde1 = keyboard.nextInt();
        andiRonde2 = keyboard.nextInt();
        andiRonde3 = keyboard.nextInt();
        
        System.out.print("Kartu Budi: ");
        budiRonde1 = keyboard.nextInt();
        budiRonde2 = keyboard.nextInt();
        budiRonde3 = keyboard.nextInt();
                
        Andi = andiRonde1 + andiRonde2 + andiRonde3;
        Budi = budiRonde1 + budiRonde2 + budiRonde3;
        
        if (Andi > Budi){
            System.out.println("Andi");
        } else if (Andi == Budi){
            System.out.println("Seri");
        }
        else {
            System.out.println("Budi");
        }
    }
}
