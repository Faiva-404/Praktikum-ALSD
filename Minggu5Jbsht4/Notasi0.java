package Minggu5Jbsht4;

public class Notasi0 {
    public static void main(String[] args) {
        int b = 1;
        while (b < 10) {
            System.out.println(b);
            b++;
            if (b==4) {
                System.out.println("4");
            }else if (b != 3) {
                System.out.println("bukan 3");
                for (int n = 1; n < 7; n = n * 2) {
                    System.out.println(n);
                }
            }
        }
    }
}
