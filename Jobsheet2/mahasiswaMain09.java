import java.util.Scanner;
public class mahasiswaMain09 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String nim;
        String kelas;
        double ipk;

        mahasiswa09 mhs1 = new mahasiswa09();
        mhs1.nama = "muhamad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa09 mhs2 = new mahasiswa09("Annisa Nabila","2141720160", 3.35, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        mahasiswa09 mhsFaiva = new mahasiswa09("Faiva Puspa", "244107020036", 3.75, "TI 1E");
        mhsFaiva.updateIpk(3.75);
        mhsFaiva.tampilkanInformasi();
   }
}