package Kuis1;

import java.util.Scanner;
public class KuisMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idPegawai;
        String nama;
        Double gajiPokok;
        int hariKerja;

        Kuis09 karyawan1 = new Kuis09();
        karyawan1.idPegawai = "116";
        karyawan1.nama = "Irfan";
        karyawan1.gajiPokok = 2.500;
        karyawan1.hariKerja = 20;

        karyawan1.tampilkanInformasi();
        karyawan1.hitungGajiBulanan();
    }
}
