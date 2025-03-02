package Jobsheet3;

import java.util.Scanner;
public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dosen09[] arrayOfDosen09 = new Dosen09[3];
        String kode, nama;
        Boolean jenisKelamin;
        int usia;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            kode = sc.nextLine();
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria = true, wanita = false) : ");
            jenisKelamin = sc.nextBoolean();
            System.out.print("Usia          : ");
            usia = sc.nextInt();
            System.out.println("---------------------------");

            arrayOfDosen09[i] = new Dosen09(kode, nama, jenisKelamin, usia);
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Dosen ke-" + (i + 1));
            System.out.println("Kode          : " + arrayOfDosen09[i].kode);
            System.out.println("Nama          : " + arrayOfDosen09[i].nama);
            System.out.println("Jenis Kelamin : " + arrayOfDosen09[i].jenisKelamin);
            System.out.println("Usia          : " + arrayOfDosen09[i].usia);
            System.out.println("---------------------------");
        }
    }
}
