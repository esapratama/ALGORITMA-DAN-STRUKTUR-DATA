public class Node10 {

    public Node10 left = null;
    int data;
    Node10 prev, next;
    int jarak;
    public Node10 right;

    Node10(Node10 prev, int data, int jarak, Node10 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.jarak = jarak;
    }

    public Node10(Node10 prev2, int input, Object object) {

    }
}