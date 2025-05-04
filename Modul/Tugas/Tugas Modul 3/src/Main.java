import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Admin admin = new Admin("Ahmad Rizqi Maulana", "202410370110198", "Admin198", "Password198");
        Mahasiswa mahasiswa = new Mahasiswa("Ahmad Rizqi Maulana", "202410370110198");

        System.out.println("=== Sistem Login ===");
        System.out.print("Pilih login sebagai (1 = Admin, 2 = Mahasiswa): ");
        String pilihan = input.nextLine();

        if (pilihan.equals("1")) {
            System.out.print("Masukkan Username: ");
            String username = input.nextLine();
            System.out.print("Masukkan Password: ");
            String password = input.nextLine();

            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Login Admin gagal! Username atau password salah.");
            }

        } else if (pilihan.equals("2")) {
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login Mahasiswa gagal! Nama atau NIM salah.");
            }

        } else {
            System.out.println("Pilihan tidak valid!");
        }

        input.close();
    }
}
