/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3.soal1;

//Import LinkedList Class
import java.util.LinkedList;

/**
 *
 * @author BISMILLAH
 */

//Membuat Class dengan Nama Dadu
public class Dadu {
    int inputUser;
    int total;
    
    //Encapsulation
    void setInput(int input){
        this.inputUser = input;
    }
    
    //Instansiasi Objek dari LinkedList
        LinkedList<Integer> ObjekDadu = new LinkedList<Integer>();
    void acakNilai(){
        for (int i = 1; i <= this.inputUser; i++){
            int nilaiAcakDadu = (int)(Math.random()*6);
            //Collection Menyimpan Objek Dadu
            ObjekDadu.add(nilaiAcakDadu);
            //Jumlah Semua Objek Dadu
            this.total = this.total + nilaiAcakDadu;
        }
    }
    
    void cetakDadu(){
        for(int i = 1; i <= this.inputUser; i++){
            //Mencetak Output Setiap Objek Dadu
            System.out.println("Dadu ke-" + i + " bernilai "+ ObjekDadu.get(i-1));
        }
        //Mencetak Output Total Jumlah Objek Dadu
        System.out.println("Total nilai dadu keseluruhan " + this.total);
    }
}
