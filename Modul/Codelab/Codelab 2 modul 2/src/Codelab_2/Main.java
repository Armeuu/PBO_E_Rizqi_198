package src.Codelab_2;

public class Main {
    public static void main(String[]args) {
        src.Codelab_2.RekeningBank rekening1 = new src.Codelab_2.RekeningBank();
        src.Codelab_2.RekeningBank rekening2 = new src.Codelab_2.RekeningBank();

        rekening1.nomorRekening = "202410370110198";
        rekening2.nomorRekening = "202410370110205";

        rekening1.namaPemilik = "Rizqi Maul";
        rekening2.namaPemilik = "Axell";

        rekening1.saldo = 300000.0;
        rekening2.saldo = 500000.0;

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();

        rekening1.setorUang(200000.0);
        rekening2.setorUang(500000.0);

        rekening1.tarikUang(800000.0);
        rekening2.tarikUang(300000.0);

        rekening1.tampilkaninfo();
        rekening2.tampilkaninfo();
    }
}
