// Interface Kucing
interface Kucing {
    void berjalan(boolean jalan);
}

// Interface Manusia
interface Manusia {
    void berbicara(Boolean suara);
}

// Class Doraemon
class Doraemon implements Kucing, Manusia {
    boolean suara;
    Boolean balingBaling;
    String warna;
    String ekor; // panjang atau pendek

    // Constructor
    public Doraemon(String warna, String ekor) {
        this.warna = warna;
        this.ekor = ekor;
    }

    // Method untuk mengisi balingBaling dan memanggil berjalan(false)
    void getTerbang() {
        balingBaling = true;
        berjalan(false);
    }

    // Method untuk menampilkan info warna, ekor, dan baling-baling
    void getInfo() {
        System.out.println("Warna: " + warna);
        System.out.println("Ekor: " + ekor);
        System.out.println("Baling-Baling: " + balingBaling);
    }

    // Implementasi method interface Kucing
    @Override
    public void berjalan(boolean jalan) {
        this.balingBaling = jalan;
    }

    // Implementasi method interface Manusia
    @Override
    public void berbicara(Boolean suara) {
        this.suara = suara;
    }
}

// Subclass Doramona
class Doramona extends Doraemon {

    // Constructor yang memanggil constructor superclass
    public Doramona(String warna, String ekor) {
        super(warna, ekor);
    }

    // Override getInfo untuk menambahkan info bulu
    @Override
    void getInfo() {
        super.getInfo(); // panggil info dari superclass
        System.out.println("Bulu: Bulu Pink");
    }
}

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Buat object Doraemon
        Doraemon doraemon = new Doraemon("Biru", "Pendek");
        doraemon.getInfo();
        doraemon.berjalan(true);
        doraemon.berbicara(true);
        doraemon.getTerbang();

        System.out.println("\n======");

        // Buat object Doramona
        Doramona doramona = new Doramona("Pink", "Panjang");
        doramona.getInfo();
        doramona.berjalan(false);
        doramona.berbicara(false);
        doramona.getTerbang();
    }
}
