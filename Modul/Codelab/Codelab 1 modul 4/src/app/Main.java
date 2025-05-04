package app;
import Perpustakaan.Buku;
import Perpustakaan.Fiksi;
import Perpustakaan.NonFiksi;
import Perpustakaan.Anggota;
import Perpustakaan.Peminjaman;

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new NonFiksi("Madilog", "Tan Malaka", "Sejarah");
        Buku buku2 = new Fiksi("Hainuwele", "Lilis Hu", "Dongeng");

        buku1.displayInfo();
        buku2.displayInfo();

        Anggota a1 = new Anggota("Rizqi Maul", "E198");
        Anggota a2 = new Anggota("Axell", "E205");

        a1.display();
        a2.display();

        a1.pinjamBuku("Madilog");
        a2.pinjamBuku("Hainuwele", 7);

        a1.kembalikanBuku("Madilog");
        a2.kembalikanBuku("Hainuwele");

    }
}

