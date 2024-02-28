public class SegitigaArray10 {
    public int alas;
    public int tinggi;

    public SegitigaArray10(int a, int t) {
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

        SegitigaArray10[] sgArray = new SegitigaArray10[4];
        sgArray[0] = new SegitigaArray10(10, 4);
        sgArray[1] = new SegitigaArray10(20, 10);
        sgArray[2] = new SegitigaArray10(15, 6);
        sgArray[3] = new SegitigaArray10(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("sgArray ke-" + i + " alas: " + sgArray[i].alas + ", tinggi: " + sgArray[i].tinggi);
            System.out.println("Luas: " + sgArray[i].hitungLuas());
            System.out.println("Keliling: " + sgArray[i].hitungKeliling());
            System.out.println();
        }
    }
}
