abstract class Staff {
    protected String nama;
    protected String alamat;
    protected double gajiPokok;
    protected double tunjangan;
    protected int level;

    public Staff(String nama, String alamat, double gajiPokok, double tunjangan, int level) {
        this.nama = nama;
        this.alamat = alamat;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public double bayarGaji() {
        return gajiPokok + tunjangan;
    }

    public abstract void cetakInfo();
}

class Manager extends Staff {
    public Manager(String nama, String alamat, double gajiPokok, double tunjangan, int level) {
        super(nama, alamat, gajiPokok, tunjangan, level);
    }

    public double bayarManager() {
        double bonus = switch (level) {
            case 1 -> 3000;
            case 2 -> 4000;
            case 3 -> 5000;
            default -> 0;
        };
        return bayarGaji() + bonus;
    }

    public void cetakInfo() {
        System.out.println("Manager " + nama + ", Alamat: " + alamat);
        System.out.println("Gaji diterima Rp " + bayarManager());
    }
}

class Direktur extends Staff {
    private char kodeDir;

    public Direktur(String nama, String alamat, double gajiPokok, double tunjangan, char kodeDir) {
        super(nama, alamat, gajiPokok, tunjangan, 0); // level tidak digunakan
        this.kodeDir = kodeDir;
    }

    public char getKodeDir() {
        return kodeDir;
    }

    public double bayarDirektur() {
        double bonus = switch (kodeDir) {
            case 'A' -> 1000000;
            case 'B' -> 2000000;
            case 'C' -> 3000000;
            default -> 0;
        };
        return bayarGaji() + bonus;
    }

    @Override
    public void cetakInfo() {
        System.out.println("Direktur " + nama + ", Alamat: " + alamat);
        System.out.println("Gaji diterima Rp " + bayarDirektur());
    }
}

public class interihance {
    public static void main(String[] args) {
        Manager manajer = new Manager("Prasetyo", "Jl. Kaliurang 31 Malang", 2500000, 250000, 1);
        manajer.cetakInfo();

        Direktur direktur = new Direktur("Prasetyo", "Jl. Bunga Merak 5 Malang", 2500000, 250000, 'A');
        direktur.cetakInfo();
    }
}