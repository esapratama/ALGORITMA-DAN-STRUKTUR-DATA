public class DoubleLinkedList10 {
    Node10 head;
    int size;

    public DoubleLinkedList10() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item) {
        if (isEmpty()) {
            head = new Node10(null, item, null);
        } else {
            Node10 newNode = new Node10(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node10 current = head;
            while (current.next != null) {
                current = (Node10) current.next;
            }
            Node10 newNode = new Node10(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Node10 current = head;
            int i = 0;
            while (i < index) {
                current = (Node10) current.next;
                i++;
            }
            if (current.prev == null) {
                Node10 newNode = new Node10(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node10 newNode = new Node10(current.prev, item, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node10 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = (Node10) tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = (Node10) head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node10 current = head;
        while (current.next != null) { // next
            current = (Node10) current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node10 current = head;
            int i = 0;
            while (i < index) {
                current = (Node10) current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = (Node10) current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next = current.prev; // prev
            }
            size--;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("linked List kosong");
        }
        return head.data;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosng");
        }
        Node10 tmp = head;
        while (tmp.next != null) {
            tmp = (Node10) tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas.");
        }
        Node10 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = (Node10) tmp.next;
        }
        return tmp.data;
    }
}