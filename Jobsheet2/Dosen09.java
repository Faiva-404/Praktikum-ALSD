public class Dosen09 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilinInformasi () {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif (boolean status) {
        statusAktif = status;
        System.out.println("Status Keaktifan : " + (status ? "Aktif" : "Tidak Aktif"));
    }

    int hitungMasaKerja(int tahunSaatini){
        return tahunSaatini - tahunBergabung;

    }

    void ubahKeahlian(String keahlian){
        bidangKeahlian = keahlian;
    }

    //konstruktor default
    public Dosen09() {

    }

    //konstruktor parameter
    public Dosen09(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
}