package praktikum4.soal2;

/**
 *
 * @author BISMILLAH
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer inputUser;
        
        Scanner input = new Scanner(System.in);
        
        //Input User
        System.out.println("Pilih buku yang ingin diinputkan:");
        System.out.println("1 = Novel");
        System.out.println("2 = Komik");
        System.out.print("Masukkan pilihan: ");
        inputUser = input.nextInt();
        input.nextLine();

        //Pengkondisian Novel atau Komik
        if( inputUser == 1 ) {
            String judul;
            String penulis;
            String genre;
            String sinopsis;
            String tahun;
            
            System.out.print("Judul: ");
            judul = input.nextLine();

            System.out.print("Penulis : ");
            penulis = input.nextLine();

            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();

            System.out.print("Genre : ");
            genre = input.nextLine();

            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();

        //Instansiasi Objek Novel
        Novel novel = new Novel(judul, penulis, tahun, genre, sinopsis);
        System.out.println(novel.getNovelDetail());
        }
        
        else if ( inputUser == 2 ) {
            String judul;
            String penulis;
            String sinopsis;
            String tahun;
            Integer volume;
            
            System.out.print("Judul: ");
            judul = input.nextLine();

            System.out.print("Penulis : ");
            penulis = input.nextLine();
 
            System.out.print("Tahun Terbit : ");
            tahun = input.nextLine();

            System.out.print("Volume : ");
            volume = input.nextInt();
            input.nextLine();

            System.out.print("Sinopsis : ");
            sinopsis = input.nextLine();

        //Instansiasi Objek Komik
        Komik komik = new Komik(judul, penulis, tahun, volume, sinopsis);
        System.out.println(komik.getKomikDetail());
        }   
    }
}
