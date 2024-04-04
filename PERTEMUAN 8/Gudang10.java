public class Gudang10 {

    Barang10[] tumpukan;
    int size;
    int top;

    public Gudang10(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang10[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang10 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang10 ambilBarang() {
        if (!cekKosong()) {
            Barang10 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang.");
            System.out.println("Kode unik dalam biner: " + konversiDesimanlkeBiner(delete.kode)); // baris kode program
                                                                                                  // // tambahan
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public Barang10 lihatBarangTeratas() {
        if (!cekKosong()) { // is empty
            Barang10 barangTeratas = tumpukan[10];
            System.out.println("Barang teratas: " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang kosong.");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rician Tumpukan barang di Gudang:"); // rincian tumpukan barang di gudang
            for (int i = top; i >= 0; i--) {
                System.out.println(tumpukan[i].nama); // Mengakses properti 'nama' dari objek Barang10
            }
        } else {
            System.out.println("Tumpukan barang kosong.");
        }
    }

    // kode baru, tambahan StackKonversial
    public String konversiDesimanlkeBiner(int kode) {
        StackKonversi10 stack = new StackKonversi10();
        while (kode != 0) { // mengubah kondisi perulangan
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
