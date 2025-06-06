package Jobsheet12;

import java.util.Scanner;
public class TugasDLLMain09 {
    public static void main(String[] args) {
        TugasDLL09 list = new TugasDLL09();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di Awal");
            System.out.println("2. Tambah di Akhir");
            System.out.println("3. Tambah di Indeks Tertentu");
            System.out.println("4. Hapus di Awal");
            System.out.println("5. Hapus di Akhir");
            System.out.println("6. Hapus di Indeks Tertentu");
            System.out.println("7. Hapus Setelah NIM Tertentu");
            System.out.println("8. Tampilkan Data");
            System.out.println("9. Tampilkan Data Head");
            System.out.println("10. Tampilkan Data Tail");
            System.out.println("11. Tampilkan Data pada Indeks Tertentu");
            System.out.println("12. Tampilkan Jumlah Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> {
                    TugasMahasiswa09 mhs = inputMahasiswa(sc);
                    list.addFirst(mhs);
                }
                case 2 -> {
                    TugasMahasiswa09 mhs = inputMahasiswa(sc);
                    list.addLast(mhs);
                }
                case 3 -> {
                    try {
                        System.out.print("Masukkan indeks: ");
                        int idx = sc.nextInt();
                        sc.nextLine();
                        TugasMahasiswa09 mhs = inputMahasiswa(sc);
                        list.add(mhs, idx);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 4 -> list.removeFirst();
                case 5 -> list.removeLast();
                case 6 -> {
                    try {
                        System.out.print("Masukkan indeks: ");
                        int idx = sc.nextInt();
                        sc.nextLine();
                        list.remove(idx);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang akan dihapus setelahnya: ");
                    String nim = sc.nextLine();
                    list.removeAfter(nim);
                }
                case 8 -> list.print();
                case 9 -> {
                    TugasMahasiswa09 mhs = list.getFirst();
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Linked list masih kosong.");
                }
                case 10 -> {
                    TugasMahasiswa09 mhs = list.getLast();
                    if (mhs != null) mhs.tampil();
                    else System.out.println("Linked list masih kosong.");
                }
                case 11 -> {
                    try {
                        System.out.print("Masukkan indeks: ");
                        int idx = sc.nextInt();
                        sc.nextLine();
                        TugasMahasiswa09 mhs = list.getAtIndex(idx);
                        if (mhs != null) mhs.tampil();
                        else System.out.println("Data tidak ditemukan.");
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 12 -> System.out.println("Jumlah data: " + list.getSize());
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);
        sc.close();
    }

    public static TugasMahasiswa09 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM  : ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama : ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK  : ");
        Double ipk = sc.nextDouble();
        sc.nextLine();
        return new TugasMahasiswa09(nim, nama, kelas, ipk);
    }
}
