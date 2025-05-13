package Jobsheet9;

public class StackKonversi09 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi09() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan data lagi.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            System.out.println("Stack kosong! Tidak ada data untuk diambil.");
            return -1; 
        }
    }
}
