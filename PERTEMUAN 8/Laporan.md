# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>
# <p align ="center">  JOBSHEET VII STACK </p>
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama       : ESA PRATAMA PUTRI </p>
<p align = "center"> NIM        : 2341720061 </p>
<p align = "center"> Kelas / no : TI-1B / 10 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 2.1 Percobaan 1: Penyimpanan Tumpukan Barang dalam Gudang
- INPUT <br>
![alt text](<img/SC 1.png>) <br>
- OUTPUT <br>
![alt text](<img/SC 1 OU.jpg>) <br>
![alt text](<img/SC 1 OU2.jpg>) <br>
## 2.1.3 Pertanyaan
1. Lakukan perbaikan pada kode program, sehingga keluaran yang dihasilkan sama dengan verifikasi
hasil percobaan! Bagian mana saja yang perlu diperbaiki? <br>
![alt text](<img/PY 1A.png>) <br>
![alt text](<img/PY 1B.png>) <br>
![alt text](<img/PY 1C.png>) <br>
2. Berapa banyak data barang yang dapat ditampung di dalam tumpukan? Tunjukkan potongan kode programnya! <br>
tumpukan dalam gudang tersebut dapat menampung hingga 7 data barang. <br>
![alt text](<img/PY 2.png>) <br>
3. Mengapa perlu pengecekan kondisi !cekKosong() pada method tampilkanBarang Kalau kondisi tersebut dihapus, apa dampaknya? <br>
diperlukan untuk memastikan bahwa tumpukan barang tidak kosong sebelum mencoba menampilkan isinya. Jika kondisi ini dihapus, maka akan terjadi kesalahan saat mencoba mengakses elemen dari tumpukan barang yang kosong, yang dapat menyebabkan program berhenti secara paksa saat runtime. <br>
4. Modifikasi kode program pada class Utama sehingga pengguna juga dapat memilih operasi lihat barang teratas, serta dapat secara bebas menentukan kapasitas gudang! <br>
![alt text](<img/PY 4A.png>) <br>
![alt text](<img/PY 4B.png>) <br>

## 2.2 Percobaan 2: Konversi Kode Barang ke Biner 
- INPUT <br>
![alt text](<img/SC 2A.png>) <br>
![alt text](<img/SC 2B.png>) <br>
![alt text](<img/SC 2C.png>) <br>
- OUTPUT <br>
![alt text](<img/SC 2 OU.jpg>) <br>
## 2.2.3 Pertanyaan
1. Pada method konversiDesimalKeBiner, ubah kondisi perulangan menjadi while (kode != 0), bagaimana hasilnya Jelaskan alasannya! <br>
Hasilnya tetap sama dengan kondisi sebelumnya, dengan menghasilkan representasi bner dari bilangan desimal yang diberikan <br>
![alt text](<img/PY 5.png>) <br>
2. Jelaskan alur kerja dari method konversiDesimalKeBiner! <br>
mengonversi bilangan desimal menjadi biner menggunakan stack. Dilakukan dengan membagi bilangan desimal dengan 2 secara berulang, dan menyimpan sisa pembagian dalam stack, lalu mengeluarkan sisa-sisa tersebut dari stack dan membentuk string biner.

## 2.3 Percobaan 3: Konversi Notasi Infix ke Postfix
- INPUT <br>
- OUTPUT <br>
## 2.3.3 Pertanyaan

## 2.4 Latihan Praktikum