// Superclass KarakterGame
class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor untuk memberikan nilai di variable nama dan kesehatan
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // memberikan getter untuk mengembalikan nilai
    public String getNama() {
        return nama;
    }

    public int getKesehatan() {
        return kesehatan;
    }
    // memberikan setter untuk memberi nilai
    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method serang untuk di gunakan pada override
    public void serang(KarakterGame target) {
        System.out.println(nama + " menyerang " + target.getNama() + "!");
    }
}

// Subclass Pahlawan
class Pahlawan extends KarakterGame {
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }
    // override di gunakan untuk memungkinkan subclass memiliki perilaku khusus tanpa mengganti superclass
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan pedang!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Subclass Musuh
class Musuh extends KarakterGame {
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan sihir!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " sekarang memiliki kesehatan " + target.getKesehatan());
    }
}

// Kelas Main untuk menjalankan simulasi
public class Game {
    public static void main(String[] args) {
        // Membuat objek
        KarakterGame umum = new KarakterGame("Karakter Umum", 100);
        Pahlawan brimstone = new Pahlawan("Brimstone", 150);
        Musuh viper = new Musuh("Viper", 200);

        // Menampilkan status awal
        System.out.println("Status awal:");
        System.out.println(brimstone.getNama() + " memiliki kesehatan: " + brimstone.getKesehatan());
        System.out.println(viper.getNama() + " memiliki kesehatan: " + viper.getKesehatan());

        // Simulasi serangan
        brimstone.serang(viper); // Brimstone menyerang Viper
        viper.serang(brimstone); // Viper menyerang Brimstone
    }
}
