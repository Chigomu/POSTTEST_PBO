import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<SiswaMengemudi> daftarSiswa = new ArrayList<>();
    ArrayList<Instruktur> daftarInstruktur = new ArrayList<>();
    ArrayList<KendaraanKursus> daftarKendaraan = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    boolean programUtamaJalan = true;

    while (programUtamaJalan) {
        IO.println("\n=================================================");
        IO.println("   SISTEM INFORMASI PENGELOLAAN KURSUS MENGEMUDI ");
        IO.println("   Posttest 3 - Inheritance (Hierarchical)       ");
        IO.println("   Oleh: Febrian Pratama Saputra (2409106033)    ");
        IO.println("=================================================");
        IO.println("1. Kelola Data Siswa");
        IO.println("2. Kelola Data Instruktur");
        IO.println("3. Kelola Data Kendaraan (Mobil/Truk)");
        IO.println("4. Keluar Program");
        IO.print("Pilih menu (1-4): ");

        int pilihanUtama = scanner.nextInt();
        scanner.nextLine();

        switch (pilihanUtama) {
            case 1:
                boolean menuSiswaJalan = true;
                while (menuSiswaJalan) {
                    IO.println("\n--- Menu Data Siswa ---");
                    IO.println("1. Tambah Siswa\n2. Lihat Siswa\n3. Ubah Siswa\n4. Hapus Siswa\n5. Kembali");
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
                            if (daftarSiswa.isEmpty()) {
                                IO.println("Data kosong.");
                            } else {
                                for (SiswaMengemudi s : daftarSiswa) {
                                    IO.println(s.getIdSiswa() + " - " + s.getNama() + " - " + s.getPaketKursus() + " | Status: " + s.statusAktif + " | Catatan: " + s.catatanInternal);
                                }
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
                            IO.print("Masukkan ID Siswa yang dihapus: ");
                            String idDel = scanner.nextLine();
                            boolean delSiswa = false;
                            for (int i = 0; i < daftarSiswa.size(); i++) {
                                if (daftarSiswa.get(i).getIdSiswa().equals(idDel)) {
                                    daftarSiswa.remove(i);
                                    IO.println("Data dihapus.");
                                    delSiswa = true;
                                    break;
                                }
                            }
                            if (!delSiswa) IO.println("ID tidak ditemukan.");
                            break;
                        case 5:
                            menuSiswaJalan = false;
                            break;
                    }
                }
                break;

            case 2:
                boolean menuInstrukturJalan = true;
                while (menuInstrukturJalan) {
                    IO.println("\n--- Menu Data Instruktur ---");
                    IO.println("1. Tambah Instruktur\n2. Lihat Instruktur\n3. Ubah Instruktur\n4. Hapus Instruktur\n5. Kembali");
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
                            if (daftarInstruktur.isEmpty()) {
                                IO.println("Data kosong.");
                            } else {
                                for (Instruktur inst : daftarInstruktur) {
                                    IO.println(inst.getIdInstruktur() + " - " + inst.getNama() + " - " + inst.getLisensi() + " | Tersedia: " + inst.statusTersedia + " | Total Ajar: " + inst.totalSiswaDiajar);
                                }
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
                            IO.print("Masukkan ID Instruktur yang dihapus: ");
                            String idDel = scanner.nextLine();
                            boolean delInst = false;
                            for (int i = 0; i < daftarInstruktur.size(); i++) {
                                if (daftarInstruktur.get(i).getIdInstruktur().equals(idDel)) {
                                    daftarInstruktur.remove(i);
                                    IO.println("Data dihapus.");
                                    delInst = true;
                                    break;
                                }
                            }
                            if (!delInst) IO.println("ID tidak ditemukan.");
                            break;
                        case 5:
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
                    IO.println("2. Lihat Kendaraan");
                    IO.println("3. Ubah Kendaraan");
                    IO.println("4. Hapus Kendaraan");
                    IO.println("5. Kembali");
                    IO.print("Pilih: ");
                    int pilKendaraan = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilKendaraan) {
                        case 1:
                            IO.println("Pilih Jenis Kendaraan:");
                            IO.println("1. Mobil Manual (SIM A)");
                            IO.println("2. Mobil Matic (SIM A Matic)");
                            IO.println("3. Truk Instruksi (SIM B1)");
                            IO.print("Pilihan (1-3): ");
                            int jenisKendaraan = scanner.nextInt();
                            scanner.nextLine();

                            IO.print("Plat Nomor: ");
                            String plat = scanner.nextLine();
                            IO.print("Merk Kendaraan: ");
                            String merk = scanner.nextLine();

                            if (jenisKendaraan == 1) {
                                IO.print("Kondisi Kopling (Baru/Aus): ");
                                String kopling = scanner.nextLine();
                                daftarKendaraan.add(new MobilManual(plat, merk, kopling));

                            } else if (jenisKendaraan == 2) {
                                IO.print("Status CVT (Normal/Perlu Servis): ");
                                String cvt = scanner.nextLine();
                                daftarKendaraan.add(new MobilMatic(plat, merk, cvt));

                            } else if (jenisKendaraan == 3) {
                                IO.print("Kapasitas Muatan Maksimal (Ton): ");
                                int kapasitas = scanner.nextInt();
                                scanner.nextLine();
                                daftarKendaraan.add(new TrukInstruksi(plat, merk, kapasitas));
                            } else {
                                IO.println("Jenis tidak valid.");
                            }
                            IO.println("Data kendaraan berhasil ditambahkan.");
                            break;

                        case 2:
                            if (daftarKendaraan.isEmpty()) {
                                IO.println("Data kendaraan kosong.");
                            } else {
                                for (KendaraanKursus k : daftarKendaraan) {
                                    IO.print("Plat: " + k.getPlatNomor() + " | Merk: " + k.getMerk() + " | Kategori: " + k.getKategoriSIM());

                                    switch (k) {
                                        case MobilManual mobilManual ->
                                                IO.println(" | [MANUAL] Kopling: " + mobilManual.getKondisiKopling());
                                        case MobilMatic mobilMatic ->
                                                IO.println(" | [MATIC] CVT: " + mobilMatic.getStatusCVT());
                                        case TrukInstruksi trukInstruksi ->
                                                IO.println(" | [TRUK] Muatan: " + trukInstruksi.getKapasitasMuatanTon() + " Ton");
                                        default -> {
                                        }
                                    }
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
                            IO.print("Masukkan Plat Nomor yang dihapus: ");
                            String platDel = scanner.nextLine();
                            boolean delKendaraan = false;
                            for (int i = 0; i < daftarKendaraan.size(); i++) {
                                if (daftarKendaraan.get(i).getPlatNomor().equals(platDel)) {
                                    daftarKendaraan.remove(i);
                                    IO.println("Data dihapus.");
                                    delKendaraan = true;
                                    break;
                                }
                            }
                            if (!delKendaraan) IO.println("Plat nomor tidak ditemukan.");
                            break;

                        case 5:
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