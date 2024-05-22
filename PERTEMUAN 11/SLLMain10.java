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

        System.out.println("Data pada indeks le-1=" + singLL10.getData(1));
        System.out.println("Data 3 berada pada indeks ke-" + singLL10.indexOf(760));

        singLL10.remove(999);
        singLL10.print();
        singLL10.removeAt(0);
        singLL10.print();
        singLL10.removeFirst();
        singLL10.print();
        singLL10.removeLast();
        singLL10.print();
    }
}