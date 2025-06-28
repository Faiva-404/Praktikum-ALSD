package Jobsheet14;

import java.util.Scanner;
public class BinaryTreeArrayMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTreeArray09 bta = new BinaryTreeArray09();
        Mahasiswa09 mhs1 = new Mahasiswa09("244160121", "Ali", "A", 3.57);
        Mahasiswa09 mhs3 = new Mahasiswa09("244160185", "Candra", "C", 3.21);
        Mahasiswa09 mhs2 = new Mahasiswa09("244160221", "Badar", "B", 3.85);
        Mahasiswa09 mhs4 = new Mahasiswa09("244160220", "Dewi", "B", 3.54);

        Mahasiswa09 mhs5 = new Mahasiswa09("244160131", "Devi", "A", 3.72);
        Mahasiswa09 mhs6 = new Mahasiswa09("244160205", "Ehsan", "D", 3.37);
        Mahasiswa09 mhs7 = new Mahasiswa09("244160170", "Fizi", "B", 3.46);

        Mahasiswa09[] dataMahasiswa09 = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7};
        int idxLast = 6;
        bta.populateData(dataMahasiswa09, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
