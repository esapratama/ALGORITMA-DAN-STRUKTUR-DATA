import java.util.Scanner;

public class BukuMain10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku10 data = new PencarianBuku10();
        int jumBuku = 5;

        System.out.println("------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku terkecil :");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("----------------");
            System.out.print("Kode Buku \t: ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul Buku \t: ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t: ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t: ");
            String pengarang = s1.nextLine();
            System.out.print("Stock \t\t: ");
            int stock = s.nextInt();

            Buku10 m = new Buku10(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }
        System.out.println("----------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        System.out.println("----------------------------");
        System.out.println("Data keseluruhan Buku : ");
        data.tampil();

        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("======================");
        System.out.println("menggunakan binary Search");
        posisi = data.FindSeqSearch(cari, 0, jumBuku - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}
