import java.util.Scanner;
public class Pemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double nilaiAkhir;
        String nilaiHuruf;
        String statusKelulusan;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("======================");
        System.out.print("Masukkan Nilai Tugas: ");
        double nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUas = sc.nextDouble();

        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUts > 100 || nilaiUas > 100) {
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("nilai tidak valid");
            System.out.println("======================");
            System.out.println("======================");
        } else { 
            //nilai akhir
            nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUts) + (0.3 * nilaiUas);
            //nilai huruf
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            //hasil
            System.out.println("======================");
            System.out.println("======================");
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("======================");
            System.out.println("======================");

            //status kelulusan
            if (nilaiAkhir >= 39) {
                System.out.println("SELAMAT ANDA LULUS"); 
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
        }
    }
}