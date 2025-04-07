package Jobsheet7;

public class dataDosen09 {
    dosen09[] dataDosen09 = new dosen09[10];
    int idx;

    void tambah(dosen09 dsn) {
        if (idx < dataDosen09.length) {
            dataDosen09[idx] = dsn;
            idx++;
        }else {
            System.out.println("Data Dosen SUdah Banyak!");
        }
    }

    //menampilkan data dosen
    void tampil() {
        if (idx == 0) {
            System.out.println("Tidak Ada Data Dosen");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen09[i].tampil();
            System.out.println();
        }
    }

    //A.
    void pencarianDataSequential09(String nama) {
        int jumlahHasil = 0;
        for (int i = 0; i < idx; i++) {
            if (dataDosen09[i].nama.equalsIgnoreCase(nama)) {
                dataDosen09[i].tampil();
                jumlahHasil++;
            }
        }
        if (jumlahHasil > 1) {
            System.out.println("peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang diberikan!");
        } else if (jumlahHasil == 0) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    //B.
    void pencarianDataBinary09(int usia) {
        sortingASC();
        int kiri = 0, kanan = idx -1;
        boolean ditemukan = false;

        while (kiri <= kanan) {
            int tengah = (kiri + kanan) / 2;
            if (dataDosen09[tengah].usia == usia) {
                dataDosen09[tengah].tampil();
                ditemukan = true;
                break;
            } else if (dataDosen09[tengah].usia < usia) {
                kiri = tengah + 1;
            } else {
                kanan = tengah -1;
            }
        }
        if (!ditemukan) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    //mengurutkan data dosen secara ascending (asc)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen09[j].usia > dataDosen09[j+1].usia) {
                    dosen09 temp = dataDosen09[j];
                    dataDosen09[j] = dataDosen09[j+1];
                    dataDosen09[j+1] = temp;
                }
            }
        }
    }

    //mengurutkan data dosen secara descending (dsc)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1 - i; j++) {
                if (dataDosen09[j].usia < dataDosen09[j+1].usia) {
                    dosen09 temp = dataDosen09[j];
                    dataDosen09[j] = dataDosen09[j+1];
                    dataDosen09[j+1] = temp;
                }
            }
        }
    }
}
