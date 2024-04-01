# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>
# <p align ="center"> JOBSHEET 6 SEARCHING </p>
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama       : ESA PRATAMA PUTRI </p>
<p align = "center"> NIM        : 2341720061 </p>
<p align = "center"> Kelas / no : TI-1B / 10 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 6.2 Searching / Pencarian Menggunakan Agoritma Sequential Search
![alt text](<img/7 B.png>) <br>
![alt text](<img/7 BM.png>) <br>
![alt text](<img/7 PB.png>) <br>
## 6.2.3 Pertanyaan
1. Jelaskan fungsi break yang ada pada method FindSeqSearch! <br>
- digunakan untuk menghentikan iterasi loop for saat elemen yang dicari ditemukan <br>
2. Jika Data Kode Buku yang dimasukkan tidak terurut dari kecil ke besar. Apakah program masih dapat berjalan? Apakah hasil yang dikeluarkan benar? Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? <br>
- Program yang diberikan akan tetap berjalan meskipun data kode buku yang dimasukkan tidak terurut dari kecil ke besar. 
![alt text](img/OP1.1A.jpg) <br>
![alt text](img/OP1.1B.jpg) <br>
![alt text](img/OP1.1C.jpg) <br>
3. Buat method baru dengan nama FindBuku menggunakan konsep sequential search dengan tipe method dari FindBuku adalah BukuNoAbsen. Sehingga Anda bisa memanggil method tersebut pada class BukuMain seperti gambar berikut : <br>
Buku dataBuku = data.FindBuku(cari); <br>
dataBuku.tampilDataBuku(); <br>
![alt text](<img/NO1.13 P7.jpg>) <br>

## 6.3 Searching / Pencarian Menggunakan Binary Search
![alt text](<img/7 PB1.png>) <br>
![alt text](<img/7 MB1.png>) <br>
## 6.3.3 Pertanyaan
1. Tunjukkan pada kode program yang mana proses divide dijalankan! <br>
![alt text](<img/NO1.2 P7.png>) <br>
2. Tunjukkan pada kode program yang mana proses conquer dijalankan! <br>
![alt text](<img/NO2.2 P7.png>) <br>
3. Jika data Kode Buku yang dimasukkan tidak urut. Apakah program masih dapat berjalan? Mengapa
demikian! Tunjukkan hasil screenshoot untuk bukti dengan kode Buku yang acak. Jelaskan Mengapa hal tersebut bisa terjadi? <br>
- Program masih akan berjalan meskipun data Kode Buku yang dimasukkan tidak urut. karena pencarian dilakukan baik dengan pencarian berurutan (sequential search) maupun pencarian biner (binary search) <br>

4. Jika Kode Buku yang dimasukkan dari Kode Buku terbesar ke terkecil (missal : 20215, 20214, 20212, 20211, 20210) dan elemen yang dicari adalah 20210. Bagaimana hasil dari binary search? Apakah sesuai? Jika tidak sesuai maka ubahlah kode program binary seach agar hasilnya sesuai! <br>
![alt text](<img/NO4.2 P7.png>) <br>

## 6.4 Percobaan Pengayaan Divide and Conquer
![alt text](<img/7 MS.png>) <br>
![alt text](<img/7 MSM.png>) <br>

## 6.5. Latihan Praktikum
1. Modifikasi percobaan searching diatas dengan ketentuan berikut ini <br>
- Ubah tipe data dari kode Buku yang awalnya int menjadi String <br>
- Tambahkan method untuk pencarian kode Buku (bertipe data String) dengan menggunakan sequential search dan binary search. <br>
![alt text](img/LP7.1A.png) <br>
![alt text](img/LP7.1B.png) <br>
![alt text](img/LP7.1C.png) <br>

2. Modifikasi percobaan searching diatas dengan ketentuan berikut ini <br>
- Tambahkan method pencarian judul buku menggunakan sequential search dan binary 
search. Sebelum dilakukan searching dengan binary search data harus dilakukan pengurutan dengan menggunakan algoritma Sorting (bebas pilih algoritma sorting apapun)! Sehingga ketika input data acak, maka algoritma searching akan tetap berjalan <br>
- Buat aturan untuk mendeteksi hasil pencarian judul buku yang lebih dari 1 hasil dalam bentuk kalimat peringatan! Pastikan algoritma yang diterapkan sesuai dengan kasus yang diberikan ! <br>