package Praktikum5;

public class MahasiswaBerprestasi09 {
    Mahasiswa09[] listMhs = new Mahasiswa09[5];
    int idx;

    void tambah (Mahasiswa09 m) {
        if (idx<listMhs.length) {
            listMhs[idx]=m;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Mahasiswa09 m : listMhs) {
            m.tampilInformasi();
            System.out.println("--------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 0; j < listMhs.length; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa09 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
}
