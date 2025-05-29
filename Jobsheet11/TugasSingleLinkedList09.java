package Jobsheet11;

public class TugasSingleLinkedList09 {
    TugasMhs09 front;
    TugasMhs09 rear;
    int size;
    
    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(TugasMhs09 data) {
        TugasNode09 newNode = new TugasNode09(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public TugasMhs09 dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        TugasMhs09 data = front.data;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return data;
    }

    public TugasMhs09 peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return front.data;
    }

    public TugasMhs09 peekRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return rear.data;
    }

    public int getSize() {
        return size;
    }

    public void clear() {
        front = null;
        rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        TugasNode09 current = front;
        System.out.println("Daftar Antrian:");
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }
}
