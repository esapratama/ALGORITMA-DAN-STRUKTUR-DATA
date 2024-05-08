public class SingleLinkedList10 {

    Node10 head, tail;

    boolean isEmpty() { // kondisi headnya harus berisis null
        return head != null;
    }

    void print() {
        if (isEmpty()) {
            Node10 tmp = head;
            System.out.println("Isi Linked List");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List kosong");
        }
    }

    void addFirst(int input) {
        Node10 ndInput = new Node10(input, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
            // ndInput.next = head;
            // head = ndInput;
        } else {
            // head = ndInput;
            // tail = ndInput;
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(int input) {
        Node10 ndInput = new Node10(input, null);
        if (isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(int key, int input) {
        Node10 ndInput = new Node10(input, null);
        Node10 temp = head;
        // do {
        // if (temp.data == key) {
        // ndInput.next = temp.next;
        // temp.next = ndInput;
        // // if (ndInput.next != null) {
        // tail = ndInput;
        // break;
        // }
        // }
        // temp = temp.next;
        // } while (temp == null);

        while (temp != null) {
            if (temp.data == key) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, int input) {
        Node10 ndInput = new Node10(input, null);
        if (index < 0) { // >
            System.out.println("perbaiki logikanya!" + "kalau indeksnya -1 bagaimana???");
        } else if (index == 0) {
            addFirst(input);
        } else {
            Node10 temp = head;
            // for (int i = 0; i < index; i++) {
            // temp = temp.next;
            // }
            // temp.next = new Node10(input, temp.next);
            // if (temp.next == null) {
            // tail = temp.next;

            // }
            // }
            // }

            for (int i = 0; i < index - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
            } else {
                System.out.println("Indeks melebihi ukuran linked list.");
            }
        }
    }
}
