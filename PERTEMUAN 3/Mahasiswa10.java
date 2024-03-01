public class Mahasiswa10 {

    String nama, gender;
    int nim;
    double ipk;

    static double rataIPK(Mahasiswa10[] arrayMahasiswa) {
        double totalIPK = 0;
        for (Mahasiswa10 mhs : arrayMahasiswa) {
            totalIPK += mhs.ipk;
        }
        return totalIPK / arrayMahasiswa.length;
    }
}
