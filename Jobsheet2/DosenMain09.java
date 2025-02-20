import java.util.Scanner;
public class DosenMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idDosen;
        String nama;
        boolean statusAktif;
        int tahunBergabung;
        String bidangKeahlian;

        Dosen09 dosen1 = new Dosen09();
        dosen1.idDosen = "244107020036";
        dosen1.nama = "Puspa Sahara";
        dosen1.tahunBergabung = 2006;
        dosen1.bidangKeahlian = "Farmasi";
        dosen1.setStatusAktif(true);

        dosen1.tampilinInformasi();
        dosen1.ubahKeahlian("Teknologi Informasi");
        dosen1.tampilinInformasi();

        int masaKerja = dosen1.hitungMasaKerja(2025); 
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
    }
}
