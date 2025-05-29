package Jobsheet11;

public class Mahasiswa09 {
    String nim, nama, kelas;
    Double ipk;

    public Mahasiswa09() {

    }
    
    public Mahasiswa09(String nim, String nama, String kelas, Double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}
