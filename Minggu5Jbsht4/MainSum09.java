package Minggu5Jbsht4;

import java.util.Scanner;
public class MainSum09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum09 sum = new Sum09(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sum.keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: "+sum.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sum.totalDC(sum.keuntungan,0,elemen-1));
    }
}
