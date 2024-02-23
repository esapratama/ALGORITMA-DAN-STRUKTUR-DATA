public class BukuMain10 {

    public static void main(String[] args) {
        Buku10 bk1 = new Buku10();

        bk1.nama = "Malioboro at midnight";
        bk1.pengarang = "Skysphire";
        bk1.penerbit = "Bukune";
        bk1.hargaSatuan = 99000;
        bk1.jumlah = 50;

        int hargaTotal = bk1.hitungHargaTotal();
        int diskon = bk1.hitungDiskon();
        int hargaBayar = bk1.hitungHargaBayar();

        System.out.println("Nama Buku : " + bk1.nama);
        System.out.println("Pengarang : " + bk1.pengarang);
        System.out.println("Pernebit : " + bk1.penerbit);
        System.out.println("Harga Satuan : " + bk1.hargaSatuan);
        System.out.println("Jumlah : " + bk1.jumlah);
        System.out.println("Harga Total : " + hargaTotal);
        System.out.println("Diskon : " + diskon);
        System.out.println("Harga Bayar : " + hargaBayar);
    }
}