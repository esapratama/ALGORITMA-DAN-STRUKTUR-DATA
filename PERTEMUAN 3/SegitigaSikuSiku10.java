public class SegitigaSikuSiku10 {
    public int alas;
    public int tinggi;

    public SegitigaSikuSiku10(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        double hipotenusa = Math.sqrt(alas * alas + tinggi * tinggi);
        return alas + tinggi + hipotenusa;
    }

    public static void main(String[] args) {

        SegitigaSikuSiku10 segitiga1 = new SegitigaSikuSiku10(3, 4);
        System.out.println("Segitiga 1: Alas = " + segitiga1.alas + ", Tinggi = " + segitiga1.tinggi);
        System.out.println("Luas Segitiga 1: " + segitiga1.hitungLuas());
        System.out.println("Keliling Segitiga 1: " + segitiga1.hitungKeliling());
    }
}
