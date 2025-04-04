package Jobsheet7;

import java.util.Scanner;
public class dosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen09 datadsn = new dataDosen09();
        int pilihan;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Masukkan data dosen ke-" + (i+1) + ":");
                        System.out.print("Masukkan kode dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan jenis Kelamin (Perempuan / Laki-laki) : ");
                        char jk = sc.next().charAt(0);
                        boolean jenisKelamin = (jk == '1' || jk == 'p');
                        System.out.print("Masukkan usia dosen: ");
                        int usia = sc.nextInt();
                        sc.nextLine();
                        System.out.println("-------------------------------------------------------------");

                        dosen09 dsn = new dosen09(kode, nama, jenisKelamin, usia);
                        datadsn.tambah(dsn);
                    }
                    break;
                case 2:
                    datadsn.tampil();
                    break;
                case 3:
                    datadsn.sortingASC();
                    System.out.println("Data Dosen Telah Diurutkan Secara Ascending");
                    datadsn.tampil();
                    break;
                case 4:
                    datadsn.sortingDSC();
                    System.out.println("Data Dosen Telah Diurutkan Secara Descending");
                    datadsn.tampil();
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Coba Lagi");
            }
        }while (pilihan != 5);
    }
}
