package Jobsheet12;

public class TugasDLL09 {
    TugasNode09 head;
    TugasNode09 tail;
    int size = 0;

    public TugasDLL09() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(TugasMahasiswa09 data) {
        TugasNode09 newNode = new TugasNode09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(TugasMahasiswa09 data) {
        TugasNode09 newNode = new TugasNode09(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // 1. Tambahkan fungsi add() untuk menambah node pada indeks tertentu
    public void add(TugasMahasiswa09 data, int index) throws Exception {
        if (index < 0 || index > size) throw new Exception("Indeks di luar batas!");
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            TugasNode09 newNode = new TugasNode09(data);
            TugasNode09 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            newNode.prev = current.prev;
            newNode.next = current;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    // 2. Tambahkan removeAfter() untuk menghapus node setelah key
    public void removeAfter(String key) {
        TugasNode09 current = head;
        while (current != null && !current.data.nim.equals(key)) {
            current = current.next;
        }
        if (current != null && current.next != null) {
            TugasNode09 toDelete = current.next;
            if (toDelete.next != null) {
                current.next = toDelete.next;
                toDelete.next.prev = current;
            } else {
                current.next = null;
                tail = current;
            }
            size--;
        }
    }

    // 3. Tambahkan fungsi remove() untuk menghapus node pada indeks tertentu
    public void remove(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) throw new Exception("Indeks di luar batas!");
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            TugasNode09 current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // 4. Fungsi getFirst(), getLast(), getAtIndex()
    public TugasMahasiswa09 getFirst() {
        if (isEmpty()) return null;
        return head.data;
    }

    public TugasMahasiswa09 getLast() {
        if (isEmpty()) return null;
        return tail.data;
    }

    public TugasMahasiswa09 getAtIndex(int index) throws Exception {
        if (isEmpty() || index < 0 || index >= size) throw new Exception("Indeks di luar batas!");
        TugasNode09 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // 5. Fungsi untuk membaca jumlah data (size)
    public int getSize() {
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong.");
            return;
        }
        TugasNode09 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
        System.out.println("Jumlah data: " + size);
    } 

    public TugasNode09 search(String nim) {
        TugasNode09 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}

