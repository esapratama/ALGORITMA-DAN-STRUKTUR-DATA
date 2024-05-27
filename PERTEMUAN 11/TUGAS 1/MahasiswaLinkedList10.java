public class MahasiswaLinkedList10 {
    Mahasiswa10 head;

    public MahasiswaLinkedList10() {
        this.head = null;
    }

    void addFirst(int NIM, String Nama) {
        Mahasiswa10 input = new Mahasiswa10(NIM, Nama);
        input.next = head;
        head = input;
    }

    void addLast(int NIM, String Nama) {
        Mahasiswa10 input = new Mahasiswa10(NIM, Nama);
        if (head == null) {
            head = input;
            return;
        }
        Mahasiswa10 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = input;
    }

    public void insertAfter(int key, int NIM, String Nama) {
        Mahasiswa10 input = new Mahasiswa10(NIM, Nama);
        Mahasiswa10 temp = head;
        while (temp != null && temp.NIM != key) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data dengan NIM " + key + " tidak ditemukan.");
            return;
        }
        input.next = temp.next;
        temp.next = input;
    }

    public void insertAt(int posisi, int NIM, String Nama) {
        if (posisi < 0) {
            System.out.println("Posisi tidak boleh negatif!");
            return;
        }
        if (posisi == 0) {
            addFirst(NIM, Nama);
            return;
        }
        Mahasiswa10 input = new Mahasiswa10(NIM, Nama);
        Mahasiswa10 temp = head;
        for (int i = 0; i < posisi - 1; i++) {
            if (temp == null) {
                System.out.println("Posisi melebihi panjang linked list!");
                return;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Posisi melebihi panjang linked list!");
            return;
        }
        input.next = temp.next;
        temp.next = input;
    }

    public void print() {
        Mahasiswa10 temp = head;
        System.out.println("Isi Linked List:");
        while (temp != null) {
            System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
            temp = temp.next;
        }
        System.out.println();
    }
}
