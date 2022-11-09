package praktikum4.soal2;

/**
 *
 * @author BISMILLAH
 */

public class Komik extends Buku {
    private Integer volume;
    private String sinopsis;

    public Komik(String j, String p, String t, Integer v, String s){
        super.judul = j;
        super.penulis = p;
        super.tahun = Integer.valueOf(t);
        this.volume = v;
        this.sinopsis = s;
    }

    public String getKomikDetail() {
        return "Data yang baru diinputkan adalah \n"
                + "Sebuah komik dengan judul \"" + judul + "\".\n"
                + "Komik tersebut dibuat oleh " + penulis + " dan diterbitkan pada tahun " + tahun + ".\n"
                + "Sampai saat ini komik tersebut memiliki jumlah volume sebanyak " + volume + " buah.\n"
                + "Sinopsis : " + sinopsis.substring(0, 64) + "....";
    }
}
