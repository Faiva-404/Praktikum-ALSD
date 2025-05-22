package P2Jobsheet10;

public class AntriLayanan09 {
    Mahasiswa09[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntriLayanan09(int max) {
        this.max = max;
        this.data = new Mahasiswa09[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean IsEmpty () {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull () {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan () {
        if (!IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua () {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i+1) + ".");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian () {
        return size;
    }

    public void clear () {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    //Method Enqueue
    public void tambahAntrian (Mahasiswa09 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasuswa.");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " Berhasil masuk ke antrian.");
        
    }

    //Method Dequeue
    public Mahasiswa09 layaniMahasiswa () {
        if (IsEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa09 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }  
}
