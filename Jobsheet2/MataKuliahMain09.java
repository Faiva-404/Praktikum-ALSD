import java.util.Scanner;
public class MataKuliahMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kodeMk;
        String nama;
        int sks;
        int jumlahJam;

        MataKuliah09 mk1 = new MataKuliah09();
        mk1.kodeMk = "AL02TIE";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.tampilkanInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilkanInformasi();
    }
}