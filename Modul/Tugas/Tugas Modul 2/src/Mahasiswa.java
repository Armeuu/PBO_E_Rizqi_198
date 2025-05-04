public class Mahasiswa {
    private String nama = "Ahmad Rizqi Maulana";
    private String nim = "202410370110198";

    public boolean login(String inputNama, String inputNim) {
        return inputNama.equalsIgnoreCase(nama) && inputNim.equals(nim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil!");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM: " + nim);
    }
}
