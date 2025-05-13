public class Mahasiswa {
    public static int nilaiAkhir;
    String nim, nama, prodi;
    MataKuliah[] mataKuliah;
    double[][] nilai; //menyimpan nilai tugas, uts, uas, dan nilai akhir.

    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public void inisialisasiMataKuliah(int jumMataKuliah) {
        this.mataKuliah = new MataKuliah[jumMataKuliah];
        this.nilai = new double[jumMataKuliah][4]; //tugas, uts, uas, akhir
    }

    
    public void setNilai(int index, double tugas, double uts, double uas) {
        nilai[index][0] = tugas;
        nilai[index][1] = uts;
        nilai[index][2] = uas;
        nilai[index][3] = (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
    }
    
}
