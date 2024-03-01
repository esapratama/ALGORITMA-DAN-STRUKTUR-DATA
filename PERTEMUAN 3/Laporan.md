# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>
# <p align ="center"> JOBSHEET 3 ARRAY OF OBJEK </p>
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama       : ESA PRATAMA PUTRI </p>
<p align = "center"> NIM        : 2341720061 </p>
<p align = "center"> Kelas / no : TI-1B / 10 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 3.2 Percobaan 1: Membuat Array dari Object, Mengisi dan Menampilkan
- INPUT <br>
![alt text](<img/3. PB 1.png>) <br>
- OUTPUT <br>


## 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method?Jelaskan! <br>
- Tidak, class yang akan digunakan sebagai elemen dalam array objek tidak harus memiliki atribut dan method secara wajib. Dalam array objek dapat digunakan untuk menyimpan objek dari berbagai class yang berbeda <br>

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut : ppArray[1] = new PersegiPanjang10(); <br>
- iya, class PersegiPanjang10 memiliki konstruktor, Ketika tidak ada konstruktor yang didefinisikan dalam sebuah class, Java secara otomatis menyediakan konstruktor default, yaitu konstruktor tanpa parameter.<br>

3. Apa yang dimaksud dengan kode berikut ini: PersegiPanjang10[] ppArray = new PersegiPanjang10[3]; <br>
- pendeklarasian dan inisialisasi sebuah array yang dapat menyimpan objek-objek dari class PersegiPanjang10 <br>

4. Apa yang dimaksud dengan kode berikut ini: <br>
        ppArray[1] = new PersegiPanjang10(); <br>
        ppArray[1].panjang = 80; <br>
        ppArray[1].lebar = 40; <br>
- baris-baris kode tersebut menginisialisasi objek PersegiPanjang10 pada posisi kedua dalam array ppArray, kemudian mengatur nilai atribut panjang dan lebar dari objek tersebut menjadi 80 dan 40, secara berturut-turut. <br>

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2? <br>
- Pemisahan class main dan class PersegiPanjang10 adalah bagian dari praktik yang disebut pemisahan kelas <br>

## 3.3 Percobaan 2: Menerima Input Isian Array Menggunakan Looping
- INPUT <br>
![alt text](<img/3. PB 2.png>) <br>
- OUTPUT <br>


## 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi? <br>
- iya, array of object dapat diimplementasikan dalam array 2 dimensi. Dengan array 2 dimensi, dapat menyimpan objek-objek dari suatu class <br>
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan! <br>
![alt text](<img/3. PB 2.2.png>) <br>
3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa? <br>
Persegi[] pgArray = new Persegi[100]; <br>
pgArray[5].sisi = 20; <br>
- hanya dideklarasikan, tetapi elemennya tidak diinisialisasi <br>
4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner! <br>
![alt text](<img/3. PB 2.3.png>) <br>
5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan ! <br>
tidak, akan menghasilkan kesalahan kompilasi <br>

## 3.4 Percobaan 3: Penambahan Operasi Matematika di Dalam Method
- INPUT <br>
![alt text](<img/3. PB 3.png>) <br>
![alt text](<img/3. PB 3.0.png>) <br>
- OUTPUT <br>
![alt text](<img/P3 OUTPUT.jpg>)

## 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh! <br>
konstruktor sendiri bisa lebih dari dua, karena konstruktor sendiri merupakan nama yang sama dengan nama kelas, konstruktor pertama merupakan konstruktor default dengan tidak ada parameter, lalu konstruktor kedua ada parameter <br>
2. Jika diketahui terdapat class Segitiga seperti berikut ini: <br>
public class Segitiga10 { <br>
        public int alas; <br>
        public int tinggi; <br>
} <br>
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi. <br>
- INPUT <br>
![alt text](<img/3. PT 2.png>) <br>
- OUTPUT <br>
 <br>
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut. Asumsi segitiga adalah segitiga siku-siku. (Hint: Anda dapat menggunakan bantuan 
library Math pada Java untuk mengkalkulasi sisi miring) <br>
- INPUT <br>
![alt text](<img/3. PT 3.png>) <br>
- OUTPUT <br>
 <br>
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing atributnya sebagai berikut: <br>
sgArray ke-0 alas: 10, tinggi: 4 <br>
sgArray ke-1 alas: 20, tinggi: 10 <br>
sgArray ke-2 alas: 15, tinggi: 6 <br>
sgArray ke-3 alas: 25, tinggi: 10 <br>
- INPUT <br>
![alt text](<img/3. PT 4.png>) <br>
- OUPUT <br>
 <br>
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method hitungLuas() dan hitungKelilin() <br>
- INPUT <br>
![alt text](<img/3. PT 5.png>) <br>
- OUTPUT <br>
 <br>

## 3.5 Latihan Praktikum
1. Buatlah program yang dapat menghitung luas permukaan dan volume bangun ruang kerucut, 
limas segi empat sama sisi, dan bola. Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun 
ruang. Buatlah satu main class untuk membuat array of objects yang menginputkan atribut, atribut yang ada menggunakan konstruktor semua bangun ruang tersebut. Dengan ketentuan, <br>
a. Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan 
luas permukaan dan volume dari tiap jenis bangun ruang tersebut. <br>
b. Pada kerucut, inputan untuk atribut hanya jari-jari dan sisi miring <br>
c. Pada limas segi empat sama sisi, inputan untuk atribut hanya panjang sisi alas dan 
tinggi limas <br>
d. Pada bola, inpuntan untuk atribut hanya jari-jari <br>

2. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, 
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika 
dimisalkan terdapat 3 data mahasiswa yang tersedia. <br>
![alt text](<img/3. LP 2.png>) <br>

3. Modifikasi program Latihan no.2 di atas, sehingga bisa digunakan untuk menghitung rata-rata IPK, 
serta menampilkan data mahasiswa dengan IPK terbesar! (gunakan method untuk masing-masing 
proses tersebut) <br>
![alt text](<img/3. LP 3.png>) <br>