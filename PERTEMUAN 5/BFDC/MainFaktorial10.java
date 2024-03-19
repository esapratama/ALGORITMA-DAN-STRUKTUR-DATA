package BFDC;

import java.util.Scanner;

public class MainFaktorial10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = sc.nextInt();

        Faktorial10[] fk = new Faktorial10[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial10();
            System.out.println("masukkan nilai data ke-" + (i + 1) + ":");
            int iNilai = sc.nextInt();
            fk[i].nilai = iNilai;
        }
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah "
                    + fk[i].faktorialBF(fk[i].nilai));
            {
                System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah "
                        + fk[i].faktorialDc(fk[i].nilai));
            }
        }
    }
}
