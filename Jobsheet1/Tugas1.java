import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {{"BANTEN"},{"JAKARTA"},{"BANDUNG"},{"CIREBON"},{"BOGOR"},{"PEKALONGAN"},{"SEMARANG"},{"SURABAYA"},{"MALANG"},{"TEGAL"}};

        System.out.print("Masukkan kode plat nomor: ");
        char inputKode = sc.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                System.out.println("Nama kota: " + KOTA[i][0]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}