# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p>
# <p align ="center">  PRAKTIKUM 13 </p>
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>

<p align = "center"> Nama       : ESA PRATAMA PUTRI </p>
<p align = "center"> NIM        : 2341720061 </p>
<p align = "center"> Kelas / no : TI-1B / 10 </p>
<p align = "center"> Jurusan    : TEKNOLOGI INFORMASI </p>

## 13.2.1 Percobaan 1
- Input <br>
- Output <br>
## 13.2.2 Pertanyaan Percobaan
1. Mengapa dalam binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa? <br>
2. Untuk apakah di class Node, kegunaan dari atribut left dan right? <br>
3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? <br>
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root? <br>
4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? <br>
5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris programn tersebut? <br>
```
if(data<current.data){
 if(current.left!=null){
 current = current.left;
 }else{
 current.left = new Node(data);
 break;
 }
}
```

## 13.3 Kegiatan Praktikum 2
- Input <br>
- Output <br>
## 13.3.2 Pertanyaan Percobaan
1. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray? <br>
2. Apakah kegunaan dari method populateData()? <br>
3. Apakah kegunaan dari method traverseInOrder()? <br>
4. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left child dan rigth child masin-masing? <br>
5. Apa kegunaan statement int idxLast = 6 pada praktikum 2 percobaan nomor 4? <br>

## 13.4 Tugas Praktikum
1. Buat method di dalam class BinaryTree yang akan menambahkan node dengan cara rekursif. <br>
2. Buat method di dalam class BinaryTree untuk menampilkan nilai paling kecil dan yang paling besar yang ada di dalam tree. <br>
3. Buat method di dalam class BinaryTree untuk menampilkan data yang ada di leaf. <br>
4. Buat method di dalam class BinaryTree untuk menampilkan berapa jumlah leaf yang ada di dalam tree. <br>
5. Modifikasi class BinaryTreeArray, dan tambahkan : <br>
• method add(int data) untuk memasukan data ke dalam tree <br>
• method traversePreOrder() dan traversePostOrder() <br>