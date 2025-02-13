import java.util.Scanner;
public class Tugas3 {
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
            sc.nextLine(); 

            System.out.print("Masukkan hari kuliah mata kuliah ke-" + (i + 1) + " (misalnya, Senin, Selasa, dst.): ");
            hariKuliah[i] = sc.nextLine();
        }

        while (true) {
            System.out.println("\nPilih opsi untuk menampilkan jadwal kuliah:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal kuliah berdasarkan hari tertentu");
            System.out.println("3. Tampilkan jadwal kuliah berdasarkan semester tertentu");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda (1/2/3/4): ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
                break;
            }

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = sc.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = sc.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        }
    }

    public static void tampilkanSeluruhJadwal(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\nSeluruh Jadwal Kuliah:");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.println(namaMataKuliah[i] + " - SKS: " + sks[i] + ", Semester: " + semester[i] + ", Hari: " + hariKuliah[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\nJadwal Kuliah Hari " + hari + ":");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMataKuliah[i] + " - SKS: " + sks[i] + ", Semester: " + semester[i]);
            }
        }
    }
    
    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMataKuliah, int[] sks, int[] semester, String[] hariKuliah, int sem) {
        System.out.println("\nJadwal Kuliah Semester " + sem + ":");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (semester[i] == sem) {
                System.out.println(namaMataKuliah[i] + " - SKS: " + sks[i] + ", Hari: " + hariKuliah[i]);
            }
        }
    }
}
