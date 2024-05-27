public class Mahasiswa10 {

    public static final int NIM = 0;
    String nama, gender;
    int nim;
    double ipk;
    public Mahasiswa10 next;
    public String Nama;

    public Mahasiswa10(int nIM2, String nama2) {
        // TODO Auto-generated constructor stub
    }

    static double rataIPK(Mahasiswa10[] arrayMahasiswa) {
        double totalIPK = 0;
        for (Mahasiswa10 mhs : arrayMahasiswa) {
            totalIPK += mhs.ipk;
        }
        return totalIPK / arrayMahasiswa.length;
    }
}
