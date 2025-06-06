package Jobsheet12;

import java.util.Scanner;
public class DLLMain09 {
    public static void main(String[] args) {
        DoubleLinkedList09 list = new DoubleLinkedList09();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do { 
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Hapus di Awal");
            System.out.println("4. Hapus di Akhir");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah Setelah NIM Tertentu"); // Tambahan menu insertAfter
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa09 mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa09 mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                }
                case 3 -> list.removeFirst();
                case 4 -> list.removeLast();
                case 5 -> list.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = sc.nextLine();
                    Node09 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");  
                    }
                }
                case 7 -> { // Implementasi insertAfter
                    System.out.print("Masukkan NIM yang akan disisipkan setelahnya: ");
                    String nim = sc.nextLine();
                    Mahasiswa09 mhs = inputMahasiswa(sc);
                    list.insertAfter(nim, mhs);
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!"); 
            }
        } while (pilihan != 0);
        sc.close();
    }

    public static Mahasiswa09 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK  : ");
        Double ipk = sc.nextDouble();
        sc.nextLine();
        return new Mahasiswa09(nim, nama, kelas, ipk);
    }
}
