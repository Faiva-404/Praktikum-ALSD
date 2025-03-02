package Jobsheet3;

public class MataKuliah09 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah09(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah09(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public MataKuliah09(String kode) {
        this.kode = kode;
        this.nama = "Unknown";
        this.sks = 0;
        this.jumlahJam = 0;
    }

    public void tambahData(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
}
