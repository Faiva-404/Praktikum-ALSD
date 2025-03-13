package Minggu5Jbsht4;

import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat09[] png = new Pangkat09[elemen];
        for (int i=0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis element ke-"+(i + 1)+": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat element ke-"+(i + 1)+": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat09(basis, pangkat);
        }
        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat09 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat09 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }  
    }
}
