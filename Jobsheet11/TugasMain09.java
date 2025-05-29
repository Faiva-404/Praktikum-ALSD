package Jobsheet11;

import java.util.Scanner;
public class TugasMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TugasSingleLinkedList09 queue  = new TugasSingleLinkedList09();
        int pilihan;

        do {
            System.out.println("\n==== Menu Antrian Layanan =====");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Lihat Antrian Depan");
            System.out.println("4. Lihat Antrian Belakang");
            System.out.println("5. Lihat Semua Antrian");
            System.out.println("6. Lihat Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Urusan: ");
                    String urusan = sc.nextLine();
                    TugasMhs09 mhs = new TugasMhs09();
                    mhs.nim = nim;
                    mhs.nama = nama;
                    mhs.urusan = urusan;
                    queue.enqueue(mhs);
                    System.out.println("Antrian ditambahkan.");
                    break;
                case 2:
                    TugasMhs09 keluar = queue.dequeue();
                    if (keluar != null) {
                        System.out.println("Mahasiswa yang dipanggil: " + keluar.nim + " - " + keluar.nama);
                    }
                    break;
                case 3:
                    TugasMhs09 depan = queue.peekFront();
                    if (depan != null) {
                        System.out.println("Antrian depan: " + depan.nim + " - " + depan.nama);
                    }
                    break;
                case 4:
                    TugasMhs09 belakang = queue.peekRear();
                    if (belakang != null) {
                        System.out.println("Antrian belakang: " + belakang.nim + " - " + belakang.nama);
                    }
                    break;
                case 5:
                    queue.tampilAntrian();
                    break;
                case 6:
                    System.out.println("Jumlah Antrian: " + queue.getSize());
                    break;
                case 7:
                    queue.clear();
                    System.out.println("Antrian telah dikosongkan.");
                    break;
                case 8:
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 8);
    }
}
