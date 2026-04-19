# Laporan Posttest 5 - Praktikum Pemrograman Berorientasi Objek

## Identitas
**Nama:** Febrian Pratama Saputra  
**NIM:** 2409106033  
**Program Studi:** Informatika, Universitas Mulawarman

---

## Deskripsi Pembaruan (Posttest 5)
Sistem Informasi Pengelolaan Kursus Mengemudi kembali direstrukturisasi dengan menerapkan konsep tingkat lanjut OOP: **Abstract Class** dan **Interface**. Pembaruan difokuskan pada manajemen armada kendaraan karena sifatnya yang mewajibkan spesialisasi fungsional di dunia nyata.

---

## Pemenuhan Instruksi

### 1. Penerapan Abstract Class & Abstract Method
* **Abstract Class:** `KendaraanKursus` diubah dari kelas induk standar (Superclass) menjadi kelas abstrak (`public abstract class KendaraanKursus`). Hal ini dilakukan agar objek "Kendaraan" generik tidak dapat diinstansiasi secara langsung; sistem wajib menspesifikasikan apakah itu Manual, Matic, atau Truk.
* **Abstract Method:** Terdapat metode `public abstract String cekKondisi();` di dalam kelas abstrak tersebut. Setiap tipe kendaraan (*subclass*) dipaksa secara kode untuk membuat cara/laporan pengecekan kondisinya masing-masing.

### 2. Penerapan Interface
* **Class Interface:** `PerawatanKendaraan` (Berisi kontrak standarisasi manajemen pemeliharaan inventaris armada).
* **Minimal 2 Method dalam Interface:**
    1. `void jadwalkanServis(String tanggal);`
    2. `String cekJadwalServis();`
* **Implementasi Interface:** Diimplementasikan oleh kelas abstrak `KendaraanKursus` sehingga semua *subclass* (Mobil Manual, Matic, Truk) otomatis dapat menggunakan metode *getter/setter* untuk mendaftarkan armada mereka ke jadwal perbaikan bengkel terdekat (dapat dilihat melalui Menu "Lihat Kendaraan" dan "Jadwalkan Servis").