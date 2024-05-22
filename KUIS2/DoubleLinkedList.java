package KUIS2;

public class DoubleLinkedList {
    class Node {
        String name;
        int points;
        int podiums;
        Node prev;
        Node next;

        public Node(String name, int points, int podiums) {
            this.name = name;
            this.points = points;
            this.podiums = podiums;
        }

        @Override
        public String toString() {
            return name + " - Points: " + points + ", Podiums: " + podiums;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(String name, int points, int podiums) {
        Node newNode = new Node(name, points, podiums);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public void printList() {
        System.out.println("=====================================");
        System.out.println("           DAFTAR PEMBALAP          ");
        System.out.println("=====================================");
        Node current = head;
        int position = 1;
        while (current != null) {
            System.out.println("| " + position++ + ". " + current);
            current = current.next;
        }
        System.out.println("=====================================");
    }
}