package Jobsheet14;

public class Mahasiswa09 {
    String nim;
    String nama;
    String kelas;
    Double ipk;

    public Mahasiswa09() {

    }

    Mahasiswa09(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + this.nim + " " + 
        "Nama: " + this.nama + " " + 
        "Kelas: " + this.kelas + " " + 
        "IPK: " + this.ipk);
    }
}
