public class MataKuliah09 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    //Konstruktor default
    public MataKuliah09() {

    }

    //konstruktor parameter
    public MataKuliah09(String kodeMk, String nama, int sks, int jumlahJam) {
        kodeMk = kodeMk;
        nama = nama;
        sks = sks;
        jumlahJam = jumlahJam;
    }
    
    void tampilkanInformasi () {
        System.out.println("Kode Mata Kuliah : " + kodeMk);
        System.out.println("Nama Mata Kuliah : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jam : " + jumlahJam);
    }

    void ubahSKS (int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS diubah menjadi : " + sksBaru);
    }

    void tambahJam (int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah jam ditambahkan. Jumlah jam baru : " + jumlahJam);
    }

    void kurangiJam (int jam) {
        if (jumlahJam < jam) {
            System.out.println("Pengurangan tidak valid");
        } else {
            jumlahJam -= jam;
            System.out.println("Jumlah jam dikurangi. Jumlah jam baru : " + jumlahJam);
        }
    }
}