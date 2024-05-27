public class Queue210 {
    MahasiswaQueue210 front, rear;

    Queue210() {
        this.front = this.rear = null;
    }

    void enqueue(int NIM, String nama) {
        MahasiswaQueue210 newNode = new MahasiswaQueue210(NIM, nama);
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }
        this.rear.next = newNode;
        this.rear = newNode;
    }

    MahasiswaQueue210 dequeue() {
        if (this.front == null)
            return null;
        MahasiswaQueue210 temp = this.front;
        this.front = this.front.next;
        if (this.front == null)
            this.rear = null;
        return temp;
    }

    void printQueue() {
        MahasiswaQueue210 current = front;
        while (current != null) {
            System.out.println("NIM: " + current.NIM + ", Nama: " + current.nama);
            current = current.next;
        }
    }
}
