package TUGAS;

import java.util.Scanner;
public class mainKRS09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS09 antrian = new AntrianKRS09(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Kartu Rencana Studi (KRS) ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan Dua Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cetak Jumlah Antrian");
            System.out.println("8. Cetak Jumlah Proses KRS");
            System.out.println("9. Cetak Mahasiswa Belum Proses KRS");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data mahasiswa");
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa09 mhs = new Mahasiswa09(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanAntrianTerakhir();
                    break;
                case 6:
                    antrian.kosongkanAntrian();
                    break;
                case 7:
                    antrian.cetakJumlahAntrian();
                    break;
                case 8:
                    antrian.cetakJumlahProsesKRS();
                    break;
                case 9:
                    antrian.cetakMahasiswaBelumProsesKRS();
                    break;
                case 10:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 10);
    }
}
