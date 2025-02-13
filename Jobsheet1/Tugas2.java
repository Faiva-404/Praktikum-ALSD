import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("=====================================");
            System.out.println("Pilih Perhitungan Yang Akan Dilakukan");
            System.out.println("=====================================");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan : ");
            int pilihan = sc.nextInt();

            if (pilihan == 4) {
                System.out.println("Terimakasih! Program selesai.");
                break;
            }
            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = sc.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume Kubus: " + hitungVolumeKubus(sisi));
                    break;
                case 2:
                    System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaanKubus(sisi));
                    break;
                case 3:
                    System.out.println("Keliling Kubus: " + hitungKelilingKubus(sisi));
                    break;
                default:
                System.out.println("Pilihan tidak valid! Silahkan coba lagi.");
            }
        }
    }

    // Fungsi untuk menghitung volume kubus
    public static double hitungVolumeKubus(double sisi) {
        return Math.pow(sisi, 3);
    }

    // Fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaanKubus(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    // Fungsi untuk menghitung keliling kubus (total panjang rusuk kubus)
    public static double hitungKelilingKubus(double sisi) {
        return 12 * sisi;
    }
}