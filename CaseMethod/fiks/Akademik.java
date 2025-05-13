public class Akademik {
    public static void bubbleSortByNilaiAkhir(NilaiMahasiswa[] mhs) {
        for (int i = 0; i < mhs.length - 1; i++) {
            for (int j = 0; j < mhs.length - i - 1; j++) {
                if (mhs[j].nilaiAkhir < mhs[j + 1].nilaiAkhir) {
                    NilaiMahasiswa temp = mhs[j];
                    mhs[j] = mhs[j + 1];
                    mhs[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortByNIM(Mahasiswa[] mhs) {
        for (int i = 0; i < mhs.length - 1; i++) {
            for (int j = 0; j < mhs.length - i - 1; j++) {
                if (mhs[j].nim.compareTo(mhs[j + 1].nim) > 0) {
                    Mahasiswa temp = mhs[j];
                    mhs[j] = mhs[j + 1];
                    mhs[j + 1] = temp;
                }
            }
        }
    }

    public static int binarySearchByNIM(Mahasiswa[] mhs, String nim) {
        int low = 0, high = mhs.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = mhs[mid].nim.compareTo(nim);
            if (cmp == 0) return mid;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static double totalNilaiAkhir(Mahasiswa mhs) {
        double total = 0;
        for (double[] nilai : mhs.nilai) {
            total += nilai[3];
        }
        return total;
    }
}
