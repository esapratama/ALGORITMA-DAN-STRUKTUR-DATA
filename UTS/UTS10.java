package UTS;

public class UTS10 {

    // variabel
    static int jumlahNilai = 0;
    int nilai, indeks;

    UTS10(int nilai) {
        this.nilai = nilai;
        this.indeks = jumlahNilai++;
    }

    void tampilData() {
        System.out.println("Nilai : " + nilai);
        System.out.println("Indeks: " + indeks);
    }

    UTS10[] listUTS;
    int idx = 0;

    UTS10(int[] numbers) { // Mengubah konstruktor untuk menerima array int[]
        listUTS = new UTS10[numbers.length];
        for (int nilai : numbers) {
            tambah(new UTS10(nilai));
        }
    }

    void tambah(UTS10 ujian) {
        if (idx < listUTS.length) {
            listUTS[idx] = ujian;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (UTS10 ujian : listUTS) {
            if (ujian != null) {
                ujian.tampilData(); // Memanggil metode tampilData()
            }
        }
    }

    // method ascending
    public int findBinarySearchAscending(int cari, int left, int right) { // Mengubah nama metode
        int mid;
        mid = left + (right - left) / 2;
        if (right >= left) {
            if (cari == listUTS[mid].nilai) {
                return mid;
            }
            if (cari < listUTS[mid].nilai) {
                return findBinarySearchAscending(cari, left, right - 1);
            }
            return findBinarySearchAscending(cari, mid + 1, right); // Memperbaiki rekursi
        }
        return -1;
    }

    // method descending
    public int findBinarySearchDescending(int cari, int left, int right) { // Mengubah nama metode
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (listUTS[mid].nilai == cari) {
                return mid;
            }
            if (listUTS[mid].nilai < cari) {
                return findBinarySearchDescending(cari, left, mid - 1);
            }
            return findBinarySearchDescending(cari, mid + 1, right);
        }
        return -1;
    }

    void selectionSortAscending() { // Mengubah nama metode
        for (int i = 0; i < idx - 1; i++) { // Menggunakan idx untuk batas iterasi
            int idxMin = i;
            for (int j = i + 1; j < idx; j++) { // Menggunakan idx untuk batas iterasi
                if (listUTS[j].nilai < listUTS[idxMin].nilai) {
                    idxMin = j;
                }
            }

            UTS10 tmp = listUTS[idxMin];
            listUTS[idxMin] = listUTS[i];
            listUTS[i] = tmp;
        }
    }

    void selectionSortDescending() { // Mengubah nama metode
        for (int i = 0; i < idx - 1; i++) { // Menggunakan idx untuk batas iterasi
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) { // Menggunakan idx untuk batas iterasi
                if (listUTS[j].nilai > listUTS[idxMax].nilai) {
                    idxMax = j;
                }
            }

            UTS10 tmp = listUTS[idxMax];
            listUTS[idxMax] = listUTS[i];
            listUTS[i] = tmp;
        }
    }

    public UTS10[] getListUTS() { // Getter untuk listUTS
        return listUTS;
    }
}
