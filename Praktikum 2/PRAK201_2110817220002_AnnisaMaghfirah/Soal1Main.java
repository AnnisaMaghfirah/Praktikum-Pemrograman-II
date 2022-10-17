/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prak201_2110817220002_annisamaghfirah;

/**
 *
 * @author BISMILLAH
 */

public class Soal1Main {

    public static void main(String[] args) {
        //Membuat Objek
        Mangga Arumanis = new Mangga("Arumanis", "hijau kekuning-kuningan", "lembut", "manis", 0.3, 5000, 13, 3.9, 65000);
        Mangga Manalagi = new Mangga("Manalagi", "hijau", "kasar", "manis", 0.5, 7500, 17, 8.5, 127500);
        Mangga Madu = new Mangga("Mangga Madu", "kuning", "lembut", "manis", 0.375, 6500, 12, 4.5, 780000);
    
        //Memanggil Display dari Atribut Mangga
        Arumanis.display();
        Manalagi.display();
        Madu.display();
    }    
}
