package Jobsheet9;

public class Surat09 {
    String idSurat;
    String namaMahasiswa;
    String cariNama;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat09() {
        
    }

    public Surat09(String idSurat, String namaMahasiswa, String kelas, char jenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }
}
