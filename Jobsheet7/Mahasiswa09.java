package Jobsheet7;

public class Mahasiswa09 {
    String nim;
    String nama;
    String kelas;
    double ipk;
    double x;
    double cari;
    double posisi;
    int pos;
    int pss;

    //Konstruktor default
    public Mahasiswa09() {
    }

    //Konstruktor berparameter
    public Mahasiswa09(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("IPK   : " + ipk);
    }
}