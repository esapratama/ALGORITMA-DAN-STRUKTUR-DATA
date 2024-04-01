public class MergeSortMain10 {
    public static void main(String[] args) {
        int data[] = { 10, 40, 30, 50, 70, 20, 100, 90 };
        System.out.println("sorting dengan merge sort");
        MergeSorting10 mSort10 = new MergeSorting10();
        System.out.println("data awal");
        mSort10.printArray(data);
        mSort10.MergeSort10(data);
        System.out.println("setelah diurutkan");
        mSort10.printArray(data);
    }
}
