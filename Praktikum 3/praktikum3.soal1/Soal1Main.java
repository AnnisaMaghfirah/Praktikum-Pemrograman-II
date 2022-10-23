/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum3.soal1;

/**
 *
 * @author BISMILLAH
 */

//Import Scanner
import java.util.Scanner;

public class Soal1Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //User Menginputkan Banyak Dadu
        int inputUser = input.nextInt();
        
        //Membuat Objek
        Dadu dadu = new Dadu();
        
        dadu.setInput(inputUser);
        dadu.acakNilai();
        dadu.cetakDadu();
    }    
}
