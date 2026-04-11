# Laporan Posttest 4 - Praktikum Pemrograman Berorientasi Objek

## Identitas
**Nama:** Febrian Pratama Saputra  
**NIM:** 2409106033  
**Program Studi:** Informatika, Universitas Mulawarman

---

## Deskripsi Pembaruan (Posttest 4)
Pada Posttest 4 ini, sistem menerapkan konsep dasar **Polymorphism**. Modul program dipisah ke dalam beberapa file mandiri agar terstruktur, dan fitur-fitur Java modern (Java 21/23) seperti *instance main methods* dan *pattern matching for switch* tetap dipertahankan.

---

## Pemenuhan Instruksi & Poin Plus

### 1. Penerapan Method Overloading
* **Pada Class `SiswaMengemudi` (Metode `aturJadwal`):** Terdapat parameter `String hari` dan versi lain dengan `String hari, String jam` untuk mengakomodasi jadwal yang spesifik maupun yang masih fleksibel.
* **Pada Class `Instruktur` (Metode `tambahSiswa`):** Terdapat versi tanpa argumen (tambah 1 siswa) dan versi integer `(int jumlah)` jika beban ajar bertambah dalam bentuk rombongan.

### 2. Penerapan Method Overriding 
Fungsi `getInfo()` dan `cekKondisi()` diinisiasi di kelas induk `KendaraanKursus`. Kelas anak (`MobilManual`, `MobilMatic`, `TrukInstruksi`) melakukan override untuk menambahkan informasi teknis spesifik (seperti CVT atau Kopling).
Keuntungan Overriding sangat terlihat pada `Main.java` bagian **Read Kendaraan**, dimana kode pembacaan *ArrayList* tidak lagi membutuhkan blok *switch case / instanceof* yang panjang untuk menentukan jenis mobil yang akan diprint datanya.