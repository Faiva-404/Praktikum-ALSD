package Jobsheet9;

public class StackSurat09 {
    Surat09[] stack;
    int size;
    int top;

    public StackSurat09(int size) {
        this.size = size;
        stack = new Surat09[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat09 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat09 pop() {
        if (!isEmpty()) {
            Surat09 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diambil.");
            return null;
        }
    }

    public Surat09 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }

    public boolean search(String namaMahasiswa) {
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equals(namaMahasiswa)) {
                return true;
            }
        }
        return false;
    }
}
