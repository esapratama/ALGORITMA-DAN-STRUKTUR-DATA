public class Main10 {
    public static void main(String[] args) {
        DaftarMahasiswaBerprestasi list = new DaftarMahasiswaBerprestasi();
        Mahasiswa10 m1 = new Mahasiswa10("Nusa", 2017, 25, 3);
        Mahasiswa10 m2 = new Mahasiswa10("Rara", 2012, 19, 4);
        Mahasiswa10 m3 = new Mahasiswa10("Dompu", 2018, 19, 3.5);
        Mahasiswa10 m4 = new Mahasiswa10("Abdul", 2017, 23, 2);
        Mahasiswa10 m5 = new Mahasiswa10("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting selection asc berdasarkan ipk");
        list.selectionSort();
        list.tampil();

        System.out.println("Data mahasiswa setelah sorting insertion asc berdasarkan ipk");
        list.insertionSort();
        list.tampil();

    }
}
