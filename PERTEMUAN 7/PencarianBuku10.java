public class PencarianBuku10 {

    // public Buku10 FindBuku(int cari) {
    // Buku10 buku = null;
    // for (int j = 0; j < listBk.length; j++) {
    // if (listBk[j].kodeBuku == cari) {
    // buku = listBk[j];
    // break;
    // }
    // }
    // return buku;
    // }

    Buku10 listBk[] = new Buku10[5];
    int idx;

    void tambah(Buku10 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku10 m : listBk) {
            m.tampilDataBuku();

        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + "ditemukan pada indeks " + pos);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t :" + x);
            System.out.println("Judul buku\t :" + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit\t :" + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t :" + listBk[pos].pengarang);
            System.out.println("Stock\t\t :" + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    // Deklarasi Isi Method dari FindSeqSearch
    public int FindSeqSearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = left + (right - left) / 2; // proses devide
            if (cari == listBk[mid].kodeBuku) {
                return (mid);
            } else if (listBk[mid].kodeBuku < cari) {
                return FindSeqSearch(cari, left, mid - 1); // Modifikasi di sini
            } else {
                return FindSeqSearch(cari, mid + 1, right); // Modifikasi di sini
            }
        }
        return -1;
    }

}
