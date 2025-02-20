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

        MataKuliah09 mk2 = new MataKuliah09("BD02TIE", "Basis Data", 3, 4 );
        mk2.tampilkanInformasi();

        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(2);
        mk2.tampilkanInformasi();
    }
}