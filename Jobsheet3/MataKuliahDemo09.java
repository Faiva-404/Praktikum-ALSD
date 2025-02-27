package Jobsheet3;

import java.util.Scanner;
public class MataKuliahDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah09[] arrayOfMataKuliah09 = new MataKuliah09[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for(int i=0; i < 3; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode         : ");
            kode = sc.nextLine();
            System.out.print("Nama         : ");
            nama = sc.nextLine();
            System.out.print("Sks          : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam   : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("---------------------------");

            arrayOfMataKuliah09[i] = new MataKuliah09(kode, nama, sks, jumlahJam);
        }

        for(int i=0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode        :"+ arrayOfMataKuliah09[i].kode);
            System.out.println("Nama        :"+ arrayOfMataKuliah09[i].nama);
            System.out.println("SKS         :"+ arrayOfMataKuliah09[i].sks);
            System.out.println("Jumlah Jam  :"+ arrayOfMataKuliah09[i].jumlahJam);
            System.out.println("---------------------------");
        }
    }
}
