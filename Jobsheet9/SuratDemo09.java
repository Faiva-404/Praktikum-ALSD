package Jobsheet9;

import java.util.Scanner;
public class SuratDemo09 {
    public static void main(String[] args) {
        StackSurat09 stack = new StackSurat09(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do { 
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1 :
                    if (stack.isFull()) {
                        System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
                    } else {
                        System.out.print("ID Surat        : ");
                        String idSurat = sc.nextLine();
                        System.out.print("Nama Mahasiswa  : ");
                        String namaMahasiswa = sc.nextLine();
                        System.out.print("Kelas           : ");
                        String kelas = sc.nextLine();
                        System.out.print("Jenis Izin (S/I): ");
                        char jenisIzin = sc.next().charAt(0);
                        System.out.print("Durasi Izin     : ");
                        int durasi = sc.nextInt();
                        Surat09 surat = new Surat09(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                        stack.push(surat);
                        System.out.println("Surat izin dari " + surat.namaMahasiswa + " berhasil diterima.");
                    }
                    break;
                case 2 :
                    Surat09 surat = stack.pop();
                    if (surat != null) {
                        System.out.println("Surat izin dari " + surat.namaMahasiswa + " berhasil diproses.");
                    }
                    break;
                case 3 :
                    Surat09 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("Surat izin terakhir: ");
                        System.out.println("ID Surat      : " + suratTerakhir.idSurat);
                        System.out.println("Nama Mahasiswa: " + suratTerakhir.namaMahasiswa);
                        System.out.println("Jenis Izin    : " + suratTerakhir.jenisIzin + " (S/I)");
                        System.out.println("Durasi Izin   : " + suratTerakhir.durasi + " hari");
                    }
                    break;
                case 4 :
                    System.out.print("Nama Mahasiswa yang dicari: ");
                    String cariNama = sc.nextLine();
                    boolean ditemukan = stack.search(cariNama);
                    if (ditemukan) {
                        System.out.println("Surat izin untuk " + cariNama + " ditemukan.");
                    } else {
                        System.out.println("Surat izin untuk " + cariNama + " tidak ditemukan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
