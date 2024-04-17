package UTS;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array yang akan diurutkan
        int[] numbers = { 40, 30, 9, 41, 13, 21, 30, 15, 44, 43, 0, 20, 48, 38, 32, 34, 38 };

        // menampilkan nilai sebelum diurutkan
        System.out.println("Data yang akan diurutkan");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Indeks " + i + ": " + numbers[i]);
        }
        System.out.println();

        System.out.print("Masukkan data yang akan dicari: ");
        int cari = sc.nextInt();

        System.out.println("Nilai sebelum pengurutan: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Indeks " + i + ": " + numbers[i]);
        }

        // nilai yang ditemukan
        System.out.println("Hasil setelah Ascending");
        UTS10 listUTS = new UTS10(numbers);
        listUTS.selectionSortAscending();
        listUTS.tampil();
        int posisiAscending = listUTS.findBinarySearchAscending(cari, 0, listUTS.getListUTS().length - 1);
        if (posisiAscending != -1) {
            System.out.println("Berada di index ke " + (posisiAscending));
        } else {
            System.out.println("Data tidak ditemukan setelah diurutkan secara ascending.");
        }

        // Menampilkan nilai yang tidak ditemukan
        System.out.println("Hasil setelah Descending");
        listUTS.selectionSortDescending();
        listUTS.tampil();
        int posisiDescending = listUTS.findBinarySearchDescending(cari, 0, listUTS.getListUTS().length - 1);
        if (posisiDescending != -1) {
            System.out.println("Berada di index ke " + (posisiDescending));
        } else {
            System.out.println("Data tidak ditemukan setelah diurutkan secara descending.");
        }

    }
}
