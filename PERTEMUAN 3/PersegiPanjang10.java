import java.util.Scanner;

public class PersegiPanjang10 {

    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang array: ");
        int panjangArray = sc.nextInt();
        System.out.print("Masukkan lebar array: ");
        int lebarArray = sc.nextInt();

        PersegiPanjang10[][] ppArray = new PersegiPanjang10[panjangArray][lebarArray];

        for (int i = 0; i < panjangArray; i++) {
            for (int j = 0; j < lebarArray; j++) {
                ppArray[i][j] = new PersegiPanjang10();
                System.out.println("Persegi panjang ke-" + i + ", " + j);
                System.out.print("Masukkan panjang: ");
                ppArray[i][j].panjang = sc.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray[i][j].lebar = sc.nextInt();
            }
        }

        for (int i = 0; i < panjangArray; i++) {
            for (int j = 0; j < lebarArray; j++) {
                System.out.println("Persegi Panjang ke-" + i + ", " + j);
                System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
            }
        }
    }
}
