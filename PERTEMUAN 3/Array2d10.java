import java.util.Scanner;

public class Array2d10 {

    public int panjang;
    public int lebar;

    public static void main(String[] args) {
        PersegiPanjang10[][] ppArray = new PersegiPanjang10[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ppArray[i][j] = new PersegiPanjang10();
                System.out.println("Persegi panjang ke-" + i + ", " + j);
                System.out.print("Masukkan panjang: ");
                ppArray[i][j].panjang = sc.nextInt();
                System.out.print("Masukkan lebar: ");
                ppArray[i][j].lebar = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Persegi Panjang ke-" + i + ", " + j);
                System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
            }
        }
    }
}