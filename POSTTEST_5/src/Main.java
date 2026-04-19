void main() {
    ArrayList<SiswaMengemudi> daftarSiswa = new ArrayList<>();
    ArrayList<Instruktur> daftarInstruktur = new ArrayList<>();
    ArrayList<KendaraanKursus> daftarKendaraan = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    boolean programUtamaJalan = true;

    while (programUtamaJalan) {
        IO.println("\n=================================================");
        IO.println("   SISTEM INFORMASI PENGELOLAAN KURSUS MENGEMUDI ");
        IO.println("   Posttest 5 - Abstract Class & Interface       ");
        IO.println("   Oleh: Febrian Pratama Saputra (2409106033)    ");
        IO.println("=================================================");
        IO.println("1. Kelola Data Siswa");
        IO.println("2. Kelola Data Instruktur");
        IO.println("3. Kelola Data Kendaraan (Test Abstract & Interface)");
        IO.println("4. Keluar Program");
        IO.print("Pilih menu (1-4): ");

        int pilihanUtama = scanner.nextInt();
        scanner.nextLine();

        switch (pilihanUtama) {
            case 1:
                boolean menuSiswaJalan = true;
                while (menuSiswaJalan) {
                    IO.println("\n--- Menu Data Siswa ---");
                    IO.println("1. Tambah Siswa\n2. Lihat Siswa\n3. Ubah Siswa\n4. Atur Jadwal\n5. Hapus Siswa\n6. Kembali");
                    IO.print("Pilih: ");
                    int pilSiswa = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilSiswa) {
                        case 1:
                            IO.print("ID Siswa: ");
                            String id = scanner.nextLine();
                            IO.print("Nama Siswa: ");
                            String nama = scanner.nextLine();
                            IO.print("Paket (Manual/Matic): ");
                            String paket = scanner.nextLine();
                            daftarSiswa.add(new SiswaMengemudi(id, nama, paket));
                            IO.println("Data tersimpan.");
                            break;
                        case 2:
                            if (daftarSiswa.isEmpty()) IO.println("Data kosong.");
                            else for (SiswaMengemudi s : daftarSiswa) {
                                IO.println(s.getIdSiswa() + " - " + s.getNama() + " - " + s.getPaketKursus() + " | Catatan: " + s.catatanInternal);
                            }
                            break;
                        case 3:
                            IO.print("Masukkan ID Siswa yang diubah: ");
                            String idEdit = scanner.nextLine();
                            boolean foundSiswa = false;
                            for (SiswaMengemudi s : daftarSiswa) {
                                if (s.getIdSiswa().equals(idEdit)) {
                                    IO.print("Nama Baru: ");
                                    s.setNama(scanner.nextLine());
                                    IO.print("Paket Baru: ");
                                    s.setPaketKursus(scanner.nextLine());
                                    IO.println("Data diperbarui.");
                                    foundSiswa = true;
                                    break;
                                }
                            }
                            if (!foundSiswa) IO.println("ID tidak ditemukan.");
                            break;
                        case 4:
                            IO.print("Masukkan ID Siswa: ");
                            String idJadwal = scanner.nextLine();
                            boolean foundJadwal = false;
                            for (SiswaMengemudi s : daftarSiswa) {
                                if (s.getIdSiswa().equals(idJadwal)) {
                                    IO.print("Masukkan Hari: ");
                                    String hari = scanner.nextLine();
                                    IO.print("Masukkan Jam (Kosongkan jika fleksibel): ");
                                    String jam = scanner.nextLine();
                                    if (jam.isEmpty()) s.aturJadwal(hari);
                                    else s.aturJadwal(hari, jam);
                                    IO.println("Jadwal diatur.");
                                    foundJadwal = true;
                                    break;
                                }
                            }
                            if (!foundJadwal) IO.println("ID tidak ditemukan.");
                            break;
                        case 5:
                            IO.print("Masukkan ID Siswa yang dihapus: ");
                            String idDel = scanner.nextLine();
                            daftarSiswa.removeIf(s -> s.getIdSiswa().equals(idDel));
                            IO.println("Hapus selesai.");
                            break;
                        case 6:
                            menuSiswaJalan = false;
                            break;
                    }
                }
                break;

            case 2:
                boolean menuInstrukturJalan = true;
                while (menuInstrukturJalan) {
                    IO.println("\n--- Menu Data Instruktur ---");
                    IO.println("1. Tambah Instruktur\n2. Lihat Instruktur\n3. Ubah Instruktur\n4. Tambah Beban Ajar\n5. Hapus Instruktur\n6. Kembali");
                    IO.print("Pilih: ");
                    int pilInstruktur = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilInstruktur) {
                        case 1:
                            IO.print("ID Instruktur: ");
                            String id = scanner.nextLine();
                            IO.print("Nama Instruktur: ");
                            String nama = scanner.nextLine();
                            IO.print("Lisensi (A/B/C): ");
                            String lisensi = scanner.nextLine();
                            daftarInstruktur.add(new Instruktur(id, nama, lisensi));
                            IO.println("Data tersimpan.");
                            break;
                        case 2:
                            if (daftarInstruktur.isEmpty()) IO.println("Data kosong.");
                            else for (Instruktur inst : daftarInstruktur) {
                                IO.println(inst.getIdInstruktur() + " - " + inst.getNama() + " - " + inst.getLisensi() + " | Total Ajar: " + inst.totalSiswaDiajar);
                            }
                            break;
                        case 3:
                            IO.print("Masukkan ID Instruktur yang diubah: ");
                            String idEdit = scanner.nextLine();
                            boolean foundInst = false;
                            for (Instruktur inst : daftarInstruktur) {
                                if (inst.getIdInstruktur().equals(idEdit)) {
                                    IO.print("Nama Baru: ");
                                    inst.setNama(scanner.nextLine());
                                    IO.print("Lisensi Baru: ");
                                    inst.setLisensi(scanner.nextLine());
                                    IO.println("Data diperbarui.");
                                    foundInst = true;
                                    break;
                                }
                            }
                            if (!foundInst) IO.println("ID tidak ditemukan.");
                            break;
                        case 4:
                            IO.print("Masukkan ID Instruktur: ");
                            String idAjar = scanner.nextLine();
                            boolean foundAjar = false;
                            for (Instruktur inst : daftarInstruktur) {
                                if (inst.getIdInstruktur().equals(idAjar)) {
                                    IO.print("Ketik jumlah siswa yang ditambahkan (Kosongkan untuk tambah 1): ");
                                    String inputTambahan = scanner.nextLine();
                                    if (inputTambahan.isEmpty()) inst.tambahSiswa();
                                    else inst.tambahSiswa(Integer.parseInt(inputTambahan));
                                    IO.println("Beban ajar diperbarui.");
                                    foundAjar = true;
                                    break;
                                }
                            }
                            if (!foundAjar) IO.println("ID tidak ditemukan.");
                            break;
                        case 5:
                            IO.print("Masukkan ID Instruktur yang dihapus: ");
                            String idDel = scanner.nextLine();
                            daftarInstruktur.removeIf(i -> i.getIdInstruktur().equals(idDel));
                            IO.println("Hapus selesai.");
                            break;
                        case 6:
                            menuInstrukturJalan = false;
                            break;
                    }
                }
                break;

            case 3:
                boolean menuKendaraanJalan = true;
                while (menuKendaraanJalan) {
                    IO.println("\n--- Menu Data Kendaraan Kursus ---");
                    IO.println("1. Tambah Kendaraan");
                    IO.println("2. Lihat Kendaraan & Jadwal Servis");
                    IO.println("3. Ubah Kendaraan");
                    IO.println("4. Jadwalkan Servis (Test Interface)");
                    IO.println("5. Hapus Kendaraan");
                    IO.println("6. Kembali");
                    IO.print("Pilih: ");
                    int pilKendaraan = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilKendaraan) {
                        case 1:
                            IO.println("Pilih Jenis Kendaraan (1. Manual, 2. Matic, 3. Truk): ");
                            IO.print("Pilihan (1-3): ");
                            int jenisKendaraan = scanner.nextInt();
                            scanner.nextLine();
                            IO.print("Plat Nomor: ");
                            String plat = scanner.nextLine();
                            IO.print("Merk Kendaraan: ");
                            String merk = scanner.nextLine();

                            if (jenisKendaraan == 1) {
                                IO.print("Kondisi Kopling (Baru/Aus): ");
                                daftarKendaraan.add(new MobilManual(plat, merk, scanner.nextLine()));
                            } else if (jenisKendaraan == 2) {
                                IO.print("Status CVT: ");
                                daftarKendaraan.add(new MobilMatic(plat, merk, scanner.nextLine()));
                            } else if (jenisKendaraan == 3) {
                                IO.print("Kapasitas (Ton): ");
                                daftarKendaraan.add(new TrukInstruksi(plat, merk, scanner.nextInt()));
                                scanner.nextLine();
                            } else IO.println("Jenis tidak valid.");
                            IO.println("Data kendaraan berhasil ditambahkan.");
                            break;

                        case 2:
                            if (daftarKendaraan.isEmpty()) {
                                IO.println("Data kendaraan kosong.");
                            } else {
                                for (KendaraanKursus k : daftarKendaraan) {
                                    IO.println(k.getInfo());
                                    IO.println("   -> " + k.cekKondisi());
                                    IO.println("   -> Jadwal Servis Terdekat: " + k.cekJadwalServis());
                                }
                            }
                            break;

                        case 3:
                            IO.print("Masukkan Plat Nomor yang diubah: ");
                            String platEdit = scanner.nextLine();
                            boolean foundKendaraan = false;

                            for (KendaraanKursus k : daftarKendaraan) {
                                if (k.getPlatNomor().equals(platEdit)) {
                                    IO.print("Merk Baru: ");
                                    k.setMerk(scanner.nextLine());
                                    switch (k) {
                                        case MobilManual mobilManual -> {
                                            IO.print("Kondisi Kopling Baru: ");
                                            mobilManual.setKondisiKopling(scanner.nextLine());
                                        }
                                        case MobilMatic mobilMatic -> {
                                            IO.print("Status CVT Baru: ");
                                            mobilMatic.setStatusCVT(scanner.nextLine());
                                        }
                                        case TrukInstruksi trukInstruksi -> {
                                            IO.print("Kapasitas Muatan Baru (Ton): ");
                                            trukInstruksi.setKapasitasMuatanTon(scanner.nextInt());
                                            scanner.nextLine();
                                        }
                                        default -> {
                                        }
                                    }
                                    IO.println("Data diperbarui.");
                                    foundKendaraan = true;
                                    break;
                                }
                            }
                            if (!foundKendaraan) IO.println("Plat nomor tidak ditemukan.");
                            break;

                        case 4:
                            IO.print("Masukkan Plat Nomor yang ingin diservis: ");
                            String platServis = scanner.nextLine();
                            boolean foundServis = false;
                            for (KendaraanKursus k : daftarKendaraan) {
                                if (k.getPlatNomor().equals(platServis)) {
                                    IO.print("Masukkan Tanggal Servis (misal: 25 April 2026): ");
                                    String jadwal = scanner.nextLine();
                                    k.jadwalkanServis(jadwal);
                                    IO.println("Jadwal servis berhasil dicatat.");
                                    foundServis = true;
                                    break;
                                }
                            }
                            if (!foundServis) IO.println("Plat nomor tidak ditemukan.");
                            break;

                        case 5:
                            IO.print("Masukkan Plat Nomor yang dihapus: ");
                            String platDel = scanner.nextLine();
                            daftarKendaraan.removeIf(k -> k.getPlatNomor().equals(platDel));
                            IO.println("Hapus selesai.");
                            break;

                        case 6:
                            menuKendaraanJalan = false;
                            break;
                    }
                }
                break;

            case 4:
                programUtamaJalan = false;
                IO.println("Menutup program...");
                break;
        }
    }
    scanner.close();
}