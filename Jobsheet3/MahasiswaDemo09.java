package Jobsheet3;

import java.util.Scanner;
public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa09[] arrayOfMahasiswa09 = new Mahasiswa09[3];
        String dummy;

        for(int i=0; i < 3; i++) {
            arrayOfMahasiswa09[i] = new Mahasiswa09();
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa09[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa09[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa09[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa09[i].ipk = Float.parseFloat(dummy);
            System.out.println("--------------------------------");
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.println("NIM     : " + arrayOfMahasiswa09[i].nim);
            System.out.println("Nama    : " + arrayOfMahasiswa09[i].nama);
            System.out.println("Kelas   : " + arrayOfMahasiswa09[i].kelas);
            System.out.println("IPK     : " + arrayOfMahasiswa09[i].ipk);
            System.out.println("--------------------------------------");
        }

        for(int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa09[i].cetakInfo();
            System.out.println("--------------------------------------");
        }
    }
}
