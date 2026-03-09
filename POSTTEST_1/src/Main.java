import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<SiswaMengemudi> daftarSiswa = new ArrayList<>();
    ArrayList<Instruktur> daftarInstruktur = new ArrayList<>();
    ArrayList<Mobil> daftarMobil = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean programUtamaJalan = true;

    while (programUtamaJalan) {
        IO.println("\n=================================================");
        IO.println("   SISTEM INFORMASI PENGELOLAAN KURSUS MENGEMUDI ");
        IO.println("   Praktikum Informatika Universitas Mulawarman  ");
        IO.println("   Oleh: Febrian Pratama Saputra (2409106033)    ");
        IO.println("=================================================");
        IO.println("1. Kelola Data Siswa");
        IO.println("2. Kelola Data Instruktur");
        IO.println("3. Kelola Data Mobil");
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
                                    IO.println(s.getIdSiswa() + " - " + s.getNama() + " - " + s.getPaketKursus());
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
                                    IO.println(inst.getIdInstruktur() + " - " + inst.getNama() + " - " + inst.getLisensi());
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
                boolean menuMobilJalan = true;
                while (menuMobilJalan) {
                    IO.println("\n--- Menu Data Mobil ---");
                    IO.println("1. Tambah Mobil\n2. Lihat Mobil\n3. Ubah Mobil\n4. Hapus Mobil\n5. Kembali");
                    IO.print("Pilih: ");
                    int pilMobil = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilMobil) {
                        case 1:
                            IO.print("Plat Nomor: ");
                            String plat = scanner.nextLine();
                            IO.print("Merk Mobil: ");
                            String merk = scanner.nextLine();
                            IO.print("Transmisi (Manual/Matic): ");
                            String transmisi = scanner.nextLine();
                            daftarMobil.add(new Mobil(plat, merk, transmisi));
                            IO.println("Data tersimpan.");
                            break;
                        case 2:
                            if (daftarMobil.isEmpty()) {
                                IO.println("Data kosong.");
                            } else {
                                for (Mobil m : daftarMobil) {
                                    IO.println(m.getPlatNomor() + " - " + m.getMerk() + " - " + m.getTransmisi());
                                }
                            }
                            break;
                        case 3:
                            IO.print("Masukkan Plat Nomor yang diubah: ");
                            String platEdit = scanner.nextLine();
                            boolean foundMobil = false;
                            for (Mobil m : daftarMobil) {
                                if (m.getPlatNomor().equals(platEdit)) {
                                    IO.print("Merk Baru: ");
                                    m.setMerk(scanner.nextLine());
                                    IO.print("Transmisi Baru: ");
                                    m.setTransmisi(scanner.nextLine());
                                    IO.println("Data diperbarui.");
                                    foundMobil = true;
                                    break;
                                }
                            }
                            if (!foundMobil) IO.println("Plat nomor tidak ditemukan.");
                            break;
                        case 4:
                            IO.print("Masukkan Plat Nomor yang dihapus: ");
                            String platDel = scanner.nextLine();
                            boolean delMobil = false;
                            for (int i = 0; i < daftarMobil.size(); i++) {
                                if (daftarMobil.get(i).getPlatNomor().equals(platDel)) {
                                    daftarMobil.remove(i);
                                    IO.println("Data dihapus.");
                                    delMobil = true;
                                    break;
                                }
                            }
                            if (!delMobil) IO.println("Plat nomor tidak ditemukan.");
                            break;
                        case 5:
                            menuMobilJalan = false;
                            break;
                    }
                }
                break;

            case 4:
                programUtamaJalan = false;
                IO.println("Menutup program...");
                break;

            default:
                IO.println("Pilihan tidak valid.");
        }
    }
    scanner.close();
}