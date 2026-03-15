# Laporan Posttest 2 - Praktikum Pemrograman Berorientasi Objek

## Identitas
**Nama:** Febrian Pratama Saputra  
**NIM:** 2409106033  
**Program Studi:** Informatika, Universitas Mulawarman

---

## Deskripsi Program
Program ini merupakan kelanjutan dari Posttest 1 (Sistem Informasi Pengelolaan Kursus Mengemudi). Pada versi ini, program telah dimodifikasi untuk menerapkan konsep **Encapsulation** menggunakan keempat jenis *Access Modifier* dan pemanfaatan metode *Getter* serta *Setter*.

---

## Pemenuhan Instruksi

### 1. Penerapan 4 Jenis Access Modifier (Poin Plus)
Seluruh kelas entitas (`SiswaMengemudi`, `Instruktur`, dan `Mobil`) mengimplementasikan 4 jenis *modifier*:
* **Private:** Mengamankan atribut utama seperti `idSiswa`, `nama`, dan `paketKursus` agar tidak bisa diubah langsung dari luar *class*.
* **Public:** Digunakan pada deklarasi *class*, *constructor*, serta metode *Getter* dan *Setter* agar bisa diakses bebas dari `Main`.
* **Protected:** Digunakan pada atribut spesifik (contoh: `protected String catatanInternal;` pada class `SiswaMengemudi`) yang konsepnya hanya dapat diakses oleh kelas turunan atau kelas dalam struktur direktori yang sama.
* **Default (Package-Private):** Digunakan tanpa penulisan *modifier* (contoh: `String statusAktif;`) yang mana secara bawaan membatasi akses hanya di ruang lingkup *package* yang sama.

### 2. Penerapan Getter dan Setter
Atribut yang bersifat `private` dimodifikasi dan dibaca sepenuhnya menggunakan perantara metode `setNama()`, `getNama()`, dsb.

---
