public class SLLMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 singLL10 = new SingleLinkedList10();

        singLL10.print();
        singLL10.addFirst(890);
        singLL10.print();
        singLL10.addLast(760);
        singLL10.print();
        singLL10.addFirst(700);
        singLL10.print();
        singLL10.insertAfter(700, 999);
        singLL10.print();
        singLL10.insertAt(3, 833);
        singLL10.print();
    }
}