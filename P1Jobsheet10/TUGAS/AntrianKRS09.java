package TUGAS;

public class AntrianKRS09 {
    Mahasiswa09[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianKRS09(int max) {
        this.max = max;
        this.data = new Mahasiswa09[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void kosongkanAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian sudah kosong.");
        } else {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Antrian telah dikosongkan.");
        }
    }

    public void tambahAntrian(Mahasiswa09 mhs) {
        if (IsFull()) {
            System.out.println("Antrian sudah penuh!");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println("Mahasiswa " + mhs.nama + " telah ditambahkan ke antrian.");
        }
    }

    public void panggilAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang bisa dipanggil.");
        } else {
            System.out.println("Memproses KRS untuk: ");
            for (int i = 0; i < 2; i++) {
                if (!IsEmpty()) {
                    Mahasiswa09 mhs = data[front];
                    front = (front + 1) % max;
                    size--;
                    mhs.tampilkanData();
                } else {
                    System.out.println("Antrian kurang dari 2 mahasiswa, tidak bisa diproses!");
                    break;
                }
            }
        }
    }

    public void tampilkanSemuaAntrian() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar mahasiswa dalam antrian: ");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanDuaTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Dua mahasiswa terdepan: ");
            for (int i = 0; i < 2; i++) {
                if (!IsEmpty()) {
                    Mahasiswa09 mhs = data[front];
                    mhs.tampilkanData();
                    front = (front + 1) % max;
                    size--;
                } else {
                    System.out.println("Antrian kurang dari 2 mahasiswa.");
                    break;
                }
            }
        }
    }

    public void tampilkanAntrianTerakhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir dalam antrian: ");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahProsesKRS() {
        System.out.println("Jumlah mahasiswa yang telah memproses KRS: " + (max - size));
    }

    public void cetakMahasiswaBelumProsesKRS() {
        System.out.println("Jumlah mahasiswa yang belum memproses KRS: " + size);
    }
}
