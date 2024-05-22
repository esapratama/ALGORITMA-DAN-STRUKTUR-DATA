package KUIS2;

public class Node {
    String name;
    int points;
    int podiums;
    Node prev;
    Node next;

    public Node(String name, int points, int podiums) {
        this.name = name;
        this.points = points;
        this.podiums = podiums;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return name + " - Points: " + points + ", Podiums: " + podiums;
    }
}