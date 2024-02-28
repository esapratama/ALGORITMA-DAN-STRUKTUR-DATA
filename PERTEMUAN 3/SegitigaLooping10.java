public class SegitigaLooping10 {
    public int alas;
    public int tinggi;

    public SegitigaLooping10(int a, int t) {
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

        SegitigaLooping10[] sgArray = new SegitigaLooping10[4];
        sgArray[0] = new SegitigaLooping10(10, 4);
        sgArray[1] = new SegitigaLooping10(20, 10);
        sgArray[2] = new SegitigaLooping10(15, 6);
        sgArray[3] = new SegitigaLooping10(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            double luas = sgArray[i].hitungLuas();
            double keliling = sgArray[i].hitungKeliling();

            System.out.println("Segitiga ke-" + i);
            System.out.println("Luas: " + luas);
            System.out.println("Keliling: " + keliling);
            System.out.println();
        }
    }
}
