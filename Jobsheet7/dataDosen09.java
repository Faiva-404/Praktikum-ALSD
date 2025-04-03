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
