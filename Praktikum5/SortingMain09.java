package Praktikum5;

public class SortingMain09 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40, 10, 4, 9, 3};
        Sorting09 dataurut1 = new Sorting09(a, a.length);
        Sorting09 dataurut2 = new Sorting09(b, b.length);
        Sorting09 dataurut3 = new Sorting09(c, c.length);

        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.bubbleSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }   
} 
