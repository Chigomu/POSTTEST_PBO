# Laporan Posttest 3 - Praktikum Pemrograman Berorientasi Objek

## Identitas
**Nama:** Febrian Pratama Saputra  
**NIM:** 2409106033  
**Program Studi:** Informatika, Universitas Mulawarman

---

## Deskripsi Pembaruan (Posttest 3)
Pada Posttest 3 ini, proyek **Sistem Informasi Pengelolaan Kursus Mengemudi** diperbarui dengan mengimplementasikan konsep dasar **Inheritance (Pewarisan)**. Pembaruan utama dilakukan pada modul pengelolaan "Mobil" yang kini direfaktor menjadi struktur kendaraan yang lebih kompleks dan relevan dengan dunia nyata (sebuah tempat kursus biasanya memiliki berbagai jenis armada untuk tipe SIM yang berbeda).

---

## Pemenuhan Instruksi & Poin Plus

### 1. Penerapan Jenis Inheritance
Tipe *Inheritance* yang digunakan dalam program ini adalah **Hierarchical Inheritance** (Pewarisan Hierarkis). Satu kelas induk (*Superclass*) menurunkan sifatnya ke beberapa kelas anak (*Subclass*) yang berbeda-beda.

### 2. Superclass dan Subclass (Poin Plus)
Syarat minimal untuk poin dasar adalah 2 *subclass*. Namun, **program ini mengimplementasikan 3 Subclass untuk mendapatkan Poin Plus**.

* **Superclass:** `KendaraanKursus` (Menyimpan atribut umum seperti `platNomor`, `merk`, dan `kategoriSIM`).
* **Subclass 1:** `MobilManual` (Mewarisi `KendaraanKursus` dengan tambahan atribut unik `kondisiKopling` untuk kursus SIM A).
* **Subclass 2:** `MobilMatic` (Mewarisi `KendaraanKursus` dengan tambahan atribut unik `statusCVT` untuk kursus SIM A Matic).
* **Subclass 3:** `TrukInstruksi` (Mewarisi `KendaraanKursus` dengan tambahan atribut unik `kapasitasMuatanTon` untuk kursus SIM B1/Kendaraan Berat).

### 3. Logika Penerapan (Real-World Application)
Penerapan *inheritance* ini sangat logis dan tidak mengada-ada. Dalam bisnis kursus mengemudi, meskipun mobil manual, mobil matic, dan truk sama-sama sebuah armada kendaraan bermotor (*Parent*), masing-masing memiliki indikator *maintenance* dan fungsi latihan yang spesifik (*Child*). Hal ini diimplementasikan menggunakan pemanggilan `super()` pada *constructor* dan keyword `instanceof` saat proses *Read* maupun *Update* di dalam *ArrayList*.

---
