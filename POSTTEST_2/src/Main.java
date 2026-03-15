import java.util.ArrayList;
import java.util.Scanner;

void main() {
    ArrayList<SiswaMengemudi> daftarSiswa = new ArrayList<>();
    ArrayList<Instruktur> daftarInstruktur = new ArrayList<>();
    ArrayList<Mobil> daftarMobil = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    boolean programUtamaJalan = true;

    while (programUtamaJalan) {
        System.out.println("\n=================================================");
        System.out.println("   SISTEM INFORMASI PENGELOLAAN KURSUS MENGEMUDI ");
        System.out.println("            Posttest 2 - Encapsulation           ");
        System.out.println("   Oleh: Febrian Pratama Saputra (2409106033)    ");
        System.out.println("=================================================");
        System.out.println("1. Kelola Data Siswa");
        System.out.println("2. Kelola Data Instruktur");
        System.out.println("3. Kelola Data Mobil");
        System.out.println("4. Keluar Program");
        System.out.print("Pilih menu (1-4): ");

        int pilihanUtama = scanner.nextInt();
        scanner.nextLine();

        switch (pilihanUtama) {
            case 1:
                boolean menuSiswaJalan = true;
                while (menuSiswaJalan) {
                    System.out.println("\n--- Menu Data Siswa ---");
                    System.out.println("1. Tambah Siswa\n2. Lihat Siswa\n3. Ubah Siswa\n4. Hapus Siswa\n5. Kembali");
                    System.out.print("Pilih: ");
                    int pilSiswa = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilSiswa) {
                        case 1:
                            System.out.print("ID Siswa: ");
                            String id = scanner.nextLine();
                            System.out.print("Nama Siswa: ");
                            String nama = scanner.nextLine();
                            System.out.print("Paket (Manual/Matic): ");
                            String paket = scanner.nextLine();
                            daftarSiswa.add(new SiswaMengemudi(id, nama, paket));
                            System.out.println("Data tersimpan.");
                            break;
                        case 2:
                            if (daftarSiswa.isEmpty()) {
                                System.out.println("Data kosong.");
                            } else {
                                for (SiswaMengemudi s : daftarSiswa) {
                                    System.out.println(s.getIdSiswa() + " - " + s.getNama() + " - " + s.getPaketKursus() + " | Status: " + s.statusAktif + " | Catatan: " + s.catatanInternal);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Masukkan ID Siswa yang diubah: ");
                            String idEdit = scanner.nextLine();
                            boolean foundSiswa = false;
                            for (SiswaMengemudi s : daftarSiswa) {
                                if (s.getIdSiswa().equals(idEdit)) {
                                    System.out.print("Nama Baru: ");
                                    s.setNama(scanner.nextLine());
                                    System.out.print("Paket Baru: ");
                                    s.setPaketKursus(scanner.nextLine());
                                    System.out.println("Data diperbarui.");
                                    foundSiswa = true;
                                    break;
                                }
                            }
                            if (!foundSiswa) System.out.println("ID tidak ditemukan.");
                            break;
                        case 4:
                            System.out.print("Masukkan ID Siswa yang dihapus: ");
                            String idDel = scanner.nextLine();
                            boolean delSiswa = false;
                            for (int i = 0; i < daftarSiswa.size(); i++) {
                                if (daftarSiswa.get(i).getIdSiswa().equals(idDel)) {
                                    daftarSiswa.remove(i);
                                    System.out.println("Data dihapus.");
                                    delSiswa = true;
                                    break;
                                }
                            }
                            if (!delSiswa) System.out.println("ID tidak ditemukan.");
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
                    System.out.println("\n--- Menu Data Instruktur ---");
                    System.out.println("1. Tambah Instruktur\n2. Lihat Instruktur\n3. Ubah Instruktur\n4. Hapus Instruktur\n5. Kembali");
                    System.out.print("Pilih: ");
                    int pilInstruktur = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilInstruktur) {
                        case 1:
                            System.out.print("ID Instruktur: ");
                            String id = scanner.nextLine();
                            System.out.print("Nama Instruktur: ");
                            String nama = scanner.nextLine();
                            System.out.print("Lisensi (A/B/C): ");
                            String lisensi = scanner.nextLine();
                            daftarInstruktur.add(new Instruktur(id, nama, lisensi));
                            System.out.println("Data tersimpan.");
                            break;
                        case 2:
                            if (daftarInstruktur.isEmpty()) {
                                System.out.println("Data kosong.");
                            } else {
                                for (Instruktur inst : daftarInstruktur) {
                                    System.out.println(inst.getIdInstruktur() + " - " + inst.getNama() + " - " + inst.getLisensi() + " | Tersedia: " + inst.statusTersedia + " | Total Ajar: " + inst.totalSiswaDiajar);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Masukkan ID Instruktur yang diubah: ");
                            String idEdit = scanner.nextLine();
                            boolean foundInst = false;
                            for (Instruktur inst : daftarInstruktur) {
                                if (inst.getIdInstruktur().equals(idEdit)) {
                                    System.out.print("Nama Baru: ");
                                    inst.setNama(scanner.nextLine());
                                    System.out.print("Lisensi Baru: ");
                                    inst.setLisensi(scanner.nextLine());
                                    System.out.println("Data diperbarui.");
                                    foundInst = true;
                                    break;
                                }
                            }
                            if (!foundInst) System.out.println("ID tidak ditemukan.");
                            break;
                        case 4:
                            System.out.print("Masukkan ID Instruktur yang dihapus: ");
                            String idDel = scanner.nextLine();
                            boolean delInst = false;
                            for (int i = 0; i < daftarInstruktur.size(); i++) {
                                if (daftarInstruktur.get(i).getIdInstruktur().equals(idDel)) {
                                    daftarInstruktur.remove(i);
                                    System.out.println("Data dihapus.");
                                    delInst = true;
                                    break;
                                }
                            }
                            if (!delInst) System.out.println("ID tidak ditemukan.");
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
                    System.out.println("\n--- Menu Data Mobil ---");
                    System.out.println("1. Tambah Mobil\n2. Lihat Mobil\n3. Ubah Mobil\n4. Hapus Mobil\n5. Kembali");
                    System.out.print("Pilih: ");
                    int pilMobil = scanner.nextInt();
                    scanner.nextLine();

                    switch (pilMobil) {
                        case 1:
                            System.out.print("Plat Nomor: ");
                            String plat = scanner.nextLine();
                            System.out.print("Merk Mobil: ");
                            String merk = scanner.nextLine();
                            System.out.print("Transmisi (Manual/Matic): ");
                            String transmisi = scanner.nextLine();
                            daftarMobil.add(new Mobil(plat, merk, transmisi));
                            System.out.println("Data tersimpan.");
                            break;
                        case 2:
                            if (daftarMobil.isEmpty()) {
                                System.out.println("Data kosong.");
                            } else {
                                for (Mobil m : daftarMobil) {
                                    System.out.println(m.getPlatNomor() + " - " + m.getMerk() + " - " + m.getTransmisi() + " | Kondisi: " + m.kondisi + " | Servis: " + m.jadwalServis);
                                }
                            }
                            break;
                        case 3:
                            System.out.print("Masukkan Plat Nomor yang diubah: ");
                            String platEdit = scanner.nextLine();
                            boolean foundMobil = false;
                            for (Mobil m : daftarMobil) {
                                if (m.getPlatNomor().equals(platEdit)) {
                                    System.out.print("Merk Baru: ");
                                    m.setMerk(scanner.nextLine());
                                    System.out.print("Transmisi Baru: ");
                                    m.setTransmisi(scanner.nextLine());
                                    System.out.println("Data diperbarui.");
                                    foundMobil = true;
                                    break;
                                }
                            }
                            if (!foundMobil) System.out.println("Plat nomor tidak ditemukan.");
                            break;
                        case 4:
                            System.out.print("Masukkan Plat Nomor yang dihapus: ");
                            String platDel = scanner.nextLine();
                            boolean delMobil = false;
                            for (int i = 0; i < daftarMobil.size(); i++) {
                                if (daftarMobil.get(i).getPlatNomor().equals(platDel)) {
                                    daftarMobil.remove(i);
                                    System.out.println("Data dihapus.");
                                    delMobil = true;
                                    break;
                                }
                            }
                            if (!delMobil) System.out.println("Plat nomor tidak ditemukan.");
                            break;
                        case 5:
                            menuMobilJalan = false;
                            break;
                    }
                }
                break;

            case 4:
                programUtamaJalan = false;
                System.out.println("Menutup program...");
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
    scanner.close();
}
}