import java.util.Scanner;
public class Tugas3b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMataKuliah[i] = sc.nextLine();

            System.out.print("Masukkan SKS mata kuliah ke-" + (i + 1) + ": ");
            sks[i] = sc.nextInt();

            System.out.print("Masukkan semester mata kuliah ke-" + (i + 1) + ": ");
            semester[i] = sc.nextInt();
            sc.nextLine();  // Mengonsumsi newline

            System.out.print("Masukkan hari kuliah mata kuliah ke-" + (i + 1) + " (misalnya, Senin, Selasa, dst.): ");
            hariKuliah[i] = sc.nextLine();
        }

        System.out.print("\nMasukkan nama mata kuliah yang ingin dicari: ");
        String cariNama = sc.nextLine();

        boolean ditemukan = false;
        for (int i = 0; i < n; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(cariNama)) {
                System.out.println("Informasi Mata Kuliah:");
                System.out.println("Nama Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari Kuliah: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama '" + cariNama + "' tidak ditemukan.");
        }
    }
}