public class Buku10 {

    String nama, pengarang, penerbit;
    int hargaSatuan, jumlah, diskon;

    int hitungHargaTotal() {
        return hargaSatuan * jumlah;
    }

    int hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        if (hargaTotal > 100000) {
            diskon = (int) (hargaTotal * 0.1);
        } else if (hargaTotal >= 50000) {
            diskon = (int) (hargaTotal * 0.05);
        } else {
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar() {
        int hargaTotal = hitungHargaTotal();
        int totalDiskon = hitungDiskon();
        return hargaTotal - totalDiskon;
    }

}