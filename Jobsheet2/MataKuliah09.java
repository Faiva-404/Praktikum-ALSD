public class MataKuliah09 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

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
        System.out.println("Jumlah jam setelah ditambah : " + jumlahJam);
    }

    void kurangiJam (int jam) {
        if (this.jumlahJam < jam) {
            System.out.println("Pengurangan tidak valid");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam setelah dikurangi : " + jumlahJam);
        }
    }

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
}