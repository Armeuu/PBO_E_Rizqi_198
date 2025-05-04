import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Admin admin = new Admin();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("=== Sistem Login ===");
        System.out.print("Pilih login sebagai (1 = Admin, 2 = Mahasiswa): ");
        String pilihan = input.nextLine();

        switch (pilihan) {
            case "1":
                System.out.print("Masukkan username: ");
                String username = input.nextLine();
                System.out.print("Masukkan password: ");
                String password = input.nextLine();

                if (admin.login(username, password)) {
                    System.out.println("Login Admin berhasil!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
                break;

            case "2":
                System.out.print("Masukkan nama: ");
                String nama = input.nextLine();
                System.out.print("Masukkan NIM: ");
                String nim = input.nextLine();

                if (mahasiswa.login(nama, nim)) {
                    mahasiswa.displayInfo();
                } else {
                    System.out.println("Login gagal! Nama atau NIM salah.");
                }
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        input.close();
    }
}
