package praktikum4.soal1;

/**
 *
 * @author BISMILLAH
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Deklarasikan Variabel Sementara
        String judul = "";
        String penulis = "";
        Integer tahun = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Judul: ");
        judul = input.nextLine();
        
        System.out.print("Penulis: ");
        penulis = input.nextLine();
        
        System.out.print("Tahun Terbit: ");
        tahun = input.nextInt();
        
        //Instansiasi Objek Buku
        Buku buku = new Buku(judul, penulis, tahun);
        
        buku.display();   
    }
}
