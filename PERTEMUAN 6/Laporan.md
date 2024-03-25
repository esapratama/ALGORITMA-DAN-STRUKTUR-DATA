# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>
# <p align ="center"> JOBSHEET 5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT) </p>
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama       : ESA PRATAMA PUTRI </p>
<p align = "center"> NIM        : 2341720061 </p>
<p align = "center"> Kelas / no : TI-1B / 10 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort
![alt text](<img/JB6 MHS.png>) <br>
![alt text](<img/JB6 DFT.png>) <br>
![alt text](<img/JB6 MAIN.png>) <br>
## 5.2.3 Pertanyaan
1. Terdapat di method apakah proses bubble sort? <br>
![alt text](<img/PN 1.png>) <br>
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini: <br>
![alt text](img/image.png) <br>
Untuk apakah proses tersebut? <br>
- bertujuan untuk membandingkan nilai IPK (indeks prestasi kumulatif) dari dua elemen berturut-turut dalam array listMhs yang berisi objek Mahasiswa <br>
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini: <br>
![alt text](img/image2.jpg) <br>
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j? <br>
- Perulangan i digunakan sebagai pengontrol untuk iterasi melalui seluruh array listMhs, sedangkan perulangan j digunakan sebagai pengontrol untuk iterasi dalam setiap langkah pembubble-an (proses pertukaran elemen-elemen) <br>
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ? 
<br>
- karena setiap iterasi i mewakili satu langkah pembubble-an <br>
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ? 
<br>
- karena setiap iterasi j memperkecil jangkauan elemen yang perlu dipertimbangkan <br>
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh? <br>
akan berlangsung sebanyak 49 kali (karena listMhs.length - 1 = 50 - 1 = 49) <br>

## 5.3 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
![alt text](img/P62.png) <br>
![alt text](img/P62.2.png) <br>
## 5.3.3. Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini: <br>
![alt text](img/image3.jpg) <br>
Untuk apakah proses tersebut, jelaskan! <br>
- langkah pencarian elemen dengan nilai IPK terkecil dalam algoritma selection sort. Pada setiap iterasi, algoritma mencari elemen dengan nilai IPK terendah dari elemen-elemen yang belum diurutkan, dan menandai indeksnya untuk kemudian dipindahkan ke posisi yang sesuai dalam proses pertukaran <br>

## 5.4 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Insertion Sort
![alt text](img/P63.png) <br>
![alt text](img/P62.3.png) <br>
## 5.4.3 Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending <br>
![alt text](<img/PN 3.png>) <br>

## 5.5 Latihan Praktikum
Sebuah platform travel yang menyediakan layanan pemesanan kebutuhan travelling sedang mengembangkan backend untuk sistem pemesanan/reservasi akomodasi (penginapan), salah satu fiturnya adalah menampilkan daftar penginapan yang tersedia berdasarkan pilihan filter yang diinginkan user. Daftar penginapan ini harus dapat disorting berdasarkan <br>
1. Harga dimulai dari harga termurah ke harga tertinggi. <br>
2. Rating bintang penginapan dari bintang tertinggi (5) ke terendah (1) <br>
Buatlah proses sorting data untuk kedua filter tersebut dengan menggunakan algoritma bubble sort dan selection sort. <br>
![alt text](img/image4.jpg) <br>

![alt text](<img/P6 HOTEL.png>) <br>
![alt text](<img/P6 HOTEL SERVICE.png>) <br>
![alt text](<img/P6 MAIN HOTEL.png>) <br>