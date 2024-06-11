package TUGAS2;

public class DoubleLinkedListFilm10 {

    Film10 head;
    int size;

    public DoubleLinkedListFilm10() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rate) {
        if (isEmpty()) {
            head = new Film10(null, id, judul, rate, null);
        } else {
            Film10 newNode = new Film10(null, id, judul, rate, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rate) {
        if (isEmpty()) {
            addFirst(id, judul, rate);
        } else {
            Film10 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Film10 newNode = new Film10(current, id, judul, rate, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int id, String judul, double rate, int index) throws Exception {
        if (isEmpty()) {
            addFirst(id, judul, rate);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else {
            Film10 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Film10 newNode = new Film10(null, id, judul, rate, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Film10 newNode = new Film10(current.prev, id, judul, rate, current);
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

    public void print() {
        if (!isEmpty()) {
            Film10 tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id);
                System.out.println(" Judul Film: " + tmp.judul);
                System.out.println(" Rating Film: " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Daftar Film masih kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Daftar Film masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Film10 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Film10 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public Film10 findFilm(int key) {
        Film10 temp = head;
        while (temp != null) {
            if (temp.id == key) {
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    public int findIdx(int key) {
        Film10 temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.id == key) {
                break;
            }
            temp = temp.next;
            i++;
        }
        return i;
    }

    public void sortDesc() {
        if (!isEmpty()) {
            boolean swapped;
            do {
                swapped = false;
                Film10 current = head;
                while (current.next != null) {
                    if (current.rating < current.next.rating) {
                        double tempRate = current.rating;
                        current.rating = current.next.rating;
                        current.next.rating = tempRate;

                        int tempId = current.id;
                        current.id = current.next.id;
                        current.next.id = tempId;

                        String tempJudul = current.judul;
                        current.judul = current.next.judul;
                        current.next.judul = tempJudul;

                        swapped = true;
                    }
                    current = current.next;
                }
            } while (swapped);
        }
    }
}
