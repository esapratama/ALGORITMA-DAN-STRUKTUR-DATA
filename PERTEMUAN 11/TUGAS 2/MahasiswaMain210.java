public class MahasiswaMain210 {
    public static void main(String[] args) {
        Queue210 queue = new Queue210();
        queue.enqueue(111, "Anton");
        queue.enqueue(112, "Prita");
        queue.enqueue(113, "Yusuf");
        queue.enqueue(114, "Doni");
        queue.enqueue(115, "Sari");

        queue.printQueue();

        System.out.println("\nDequeue: " + queue.dequeue().nama);
        queue.printQueue();
    }
}