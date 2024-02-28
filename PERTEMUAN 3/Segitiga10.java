public class Segitiga10 {
    public int alas;
    public int tinggi;

    public Segitiga10(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    public static void main(String[] args) {

        Segitiga10 segitiga1 = new Segitiga10(5, 7);
        Segitiga10 segitiga2 = new Segitiga10(3, 4);

        System.out.println("Segitiga 1: Alas = " + segitiga1.alas + ", Tinggi = " + segitiga1.tinggi);
        System.out.println("Segitiga 2: Alas = " + segitiga2.alas + ", Tinggi = " + segitiga2.tinggi);
    }
}