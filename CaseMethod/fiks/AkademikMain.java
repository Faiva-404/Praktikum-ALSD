import java.util.ArrayList;
import java.util.Scanner;

public class AkademikMain {
    static Scanner input = new Scanner(System.in);

    static Mahasiswa[] mahasiswa = {
        new Mahasiswa("22001", "Ali Rahman", "Informatika"),
        new Mahasiswa("22002", "Budi Santoso", "Informatika"),
        new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis")
    };

    static MataKuliah[] mataKuliah = {
        new MataKuliah("MK001", "Struktur Data", 3),
        new MataKuliah("MK002", "Basis Data", 3),
        new MataKuliah("MK003", "Desain Web", 3)
    };

    public static void main(String[] args) {
        for (Mahasiswa m : mahasiswa) {
            m.inisialisasiMataKuliah(mataKuliah.length);
            m.mataKuliah = mataKuliah;
            
            if (m.nim.equals("22001")) { 
                m.setNilai(0, 80, 85, 90); 
                m.setNilai(1, 60, 75, 70); 
            } else if (m.nim.equals("22002")) { 
                m.setNilai(0, 75, 70, 80); 
            } else if (m.nim.equals("22003")) { 
                m.setNilai(1, 85, 90, 95); 
                m.setNilai(2, 80, 90, 65); 
        }

        }
    
        int pilihan;
        do {
            System.out.println("=== MENU SISTEM AKADEMIK ===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Input Nilai Mahasiswa");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1 -> tampilkanMahasiswa();
                case 2 -> tampilkanMataKuliah();
                case 3 -> tampilDataPenilaian();
                case 4 -> urutkanMahasiswa();
                case 5 -> cariMahasiswa();
                case 0 -> System.out.println("Terimakasih!");
                default -> System.out.println("Pilihan tidak valid. Silahkan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 0);
    }

    static void tampilkanMahasiswa() {
        System.out.println("Daftar Mahasiswa:");
        for (Mahasiswa m : mahasiswa) {
            System.out.println("NIM: " + m.nim + " | Nama: " + m.nama +"   | Prodi: " + m.prodi);
        }
    }
    
    static void tampilkanMataKuliah() {
        System.out.println("Daftar Mata Kuliah:");
        for (MataKuliah mk : mataKuliah) {
            System.out.println("Kode MK: " + mk.kode + " | Nama: " + mk.nama +   " | SKS: " + mk.sks);
        }
    }

    static void tampilDataPenilaian() {
        System.out.println("Daftar Penilaian:");
        for (Mahasiswa m : mahasiswa) {
            for (int i = 0; i < m.mataKuliah.length; i++) {
                if (m.nilai[i][3] > 0) {
                    System.out.println(m.nama + " | " + m.mataKuliah[i].nama + " | Nilai Akhir: " + m.nilai[i][3]);
                }
            }
        }
    }

    static void urutkanMahasiswa() {
        System.out.println("urutkan Mahasiswa Berdasarkan Nilai Akhir:");
        ArrayList<NilaiMahasiswa> daftarNilai = new ArrayList<>();

    for (Mahasiswa m : mahasiswa) {
        for (int i = 0; i < m.mataKuliah.length; i++) {
            double nilaiAkhir = m.nilai[i][3];
            if (nilaiAkhir > 0) {
                daftarNilai.add(new NilaiMahasiswa(m.nama, m.mataKuliah[i].nama, nilaiAkhir));
            }
        }
    }

    // Convert ke array dan urutkan
    NilaiMahasiswa[] arr = daftarNilai.toArray(new NilaiMahasiswa[0]);
    Akademik.bubbleSortByNilaiAkhir(arr);

    for (NilaiMahasiswa n : arr) {
            System.out.println(n.nama + " | " + n.mataKuliah + " | Nilai Akhir: " + n.nilaiAkhir);
        }
    }

    static void cariMahasiswa() {
        System.out.print("Masukkan NIM yang dicari: ");
        String nimCari = input.next();
        Akademik.bubbleSortByNIM(mahasiswa);
        int hasil = Akademik.binarySearchByNIM(mahasiswa, nimCari);
        if (hasil != -1) {
            Mahasiswa m = mahasiswa[hasil];
            System.out.println("Data Mahasiswa Ditemukan: " + m.nim + " | Nama: " + m.nama + " | Prodi: " + m.prodi);
        } else {
            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
        }
    }
}
