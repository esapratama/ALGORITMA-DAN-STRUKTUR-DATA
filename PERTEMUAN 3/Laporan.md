# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>
# <p align ="center"> JOBSHEET 1 KONSEP DASAR PEMROGRAMAN </p>
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama       : ESA PRATAMA PUTRI </p>
<p align = "center"> NIM        : 2341720061 </p>
<p align = "center"> Kelas / no : TI-1B / 10 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
![alt text](<img/CODE 1 PP.png>)

## 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method?Jelaskan! <br>
Tidak, class yang akan digunakan sebagai elemen dalam array objek tidak harus memiliki atribut dan method secara wajib. Dalam array objek dapat digunakan untuk menyimpan objek dari berbagai class yang berbeda, bahkan class yang tidak memiliki atribut atau method sama sekali. <br>

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut : ppArray[1] = new PersegiPanjang10(); <br>
iya, class PersegiPanjang10 memiliki konstruktor, meskipun tidak didefinisikan secara eksplisit dalam kode yang Anda berikan. Ketika tidak ada konstruktor yang didefinisikan dalam sebuah class, Java secara otomatis menyediakan konstruktor default, yaitu konstruktor tanpa parameter.<br>

3. Apa yang dimaksud dengan kode berikut ini: PersegiPanjang10[] ppArray = new PersegiPanjang10[3]; <br>
pendeklarasian dan inisialisasi sebuah array yang dapat menyimpan objek-objek dari class PersegiPanjang10 <br>

4. Apa yang dimaksud dengan kode berikut ini: <br>
        ppArray[1] = new PersegiPanjang10(); <br>
        ppArray[1].panjang = 80; <br>
        ppArray[1].lebar = 40; <br>
baris-baris kode tersebut menginisialisasi objek PersegiPanjang10 pada posisi kedua dalam array ppArray, kemudian mengatur nilai atribut panjang dan lebar dari objek tersebut menjadi 80 dan 40, secara berturut-turut. <br>

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2? <br>
Pemisahan class main (yang berisi method main) dan class PersegiPanjang10 adalah bagian dari praktik yang disebut pemisahan kelas yang baik dalam pemrograman berorientasi objek. <br>

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping

## 3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method
![alt text](<img/CODE 2 BK.png>)

## 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! <br>

2. Jika diketahui terdapat class Segitiga seperti berikut ini: <br>

Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.