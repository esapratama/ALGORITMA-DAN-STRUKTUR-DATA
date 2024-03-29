# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>
# <p align ="center"> JOBSHEET 4 BRUTE FORCE DAN DIVIDE CONQUER </p>
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama       : ESA PRATAMA PUTRI </p>
<p align = "center"> NIM        : 2341720061 </p>
<p align = "center"> Kelas / no : TI-1B / 10 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
![alt text](<img/5. FAKTORIAL.png>) <br>
![alt text](<img/5. MAIN FAKTORIAL.png>)
## 4.2.3 Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan 
perbedaan bagian kode pada penggunaan if dan else! <br>
- Penggunaan if tanpa else: Hanya melakukan sesuatu jika kondisi terpenuhi, tidak ada rencana alternatif jika kondisi tidak terpenuhi. <br>
- Penggunaan if dengan else: Melakukan sesuatu jika kondisi terpenuhi, dan melakukan sesuatu yang berbeda jika tidak terpenuhi. <br>
2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan 
for?Buktikan! <br>
![alt text](<img/PC 5 12.jpg>) <br>
3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); ! <br>
- fakto *= i;: untuk menghitung faktorial dengan cara mengalikan semua angka dari 1 hingga n secara berturut-turut. <br>
- int fakto = n * faktorialDC(n-1);: untuk menghitung faktorial dengan cara berulang menggunakan pemecahan masalah menjadi bagian-bagian kecil. Dan Kemudian hasilnya digabungkan untuk mendapatkan faktorial dari n. <br>

## 4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
![alt text](<img/5. PANGKAT.png>) <br>
![alt text](<img/5. MAIN PANGKAT.png>)
## 4.3.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()! <br>
- PangkatBF() : <br>
   A. menggunakan pendekatan langsung dengan melakukan iterasi sebanyak n kali, di mana n merupakan eksponen pangkat <br>
   B. Pada setiap iterasi, hasil pangkat dihitung dengan mengalikan bilangan asli dengan dirinya sendiri sebanyak kali sesuai dengan eksponen <br>
- PangkatDc() : <br>
   A. menggunakan pendekatan rekursif dengan membagi permasalahan menjadi submasalah yang lebih kecil <br>
   B. setiap langkah rekursif, pangkat dari setengah eksponen dihitung dan hasilnya dikuadratkan <br>
2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! <br>
![alt text](<img/PC 5 22.jpg>) <br>
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan 
konstruktor. <br>
![alt text](<img/PC 23A.jpg>) <br>
![alt text](<img/PC 23B.jpg>) <br>
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan 
switch-case! <br>
![alt text](<img/PC 24.png>) <br>

## Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
![alt text](<img/5. P SUM.png>) <br>
![alt text](<img/5. MAIN SUM.png>)
## 4.4.3 Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan! <br>
return lsum+rsum+arr[mid]; <br>
- digunakan dalam metode Divide and Conquer untuk menghitung hasil pangkat dari setiap submasalah. Memungkinkan untuk menggabungkan hasil dari kedua submasalah dan menghitung hasil pangkat secara rekursif. Hasil pangkat dari kedua submasalah termasuk dalam perhitungan akhir, memastikan bahwa hasil pangkat akhir yang benar diperoleh. <br>
2. Kenapa dibutuhkan variable mid pada method TotalDC()? <br>
- untuk menentukan elemen tengah dari array saat membagi masalah menjadi submasalah yang lebih kecil <br>
3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan 
dengan program! <br>
![alt text](<img/PC 5 33.png>) <br>

## 4.5 Latihan Praktikum
Tentukan:
a. top_acceleration tertinggi menggunakan Divide and Conquer! <br>
b. top_acceleration terendah menggunakan Divide and Conquer! <br>
c. Rata-rata top_power dari seluruh mobil menggunakan Brute Force! <br>

![alt text](<img/LT 5.png>) <br>
![alt text](<img/LT 5 MAIN.png>)
