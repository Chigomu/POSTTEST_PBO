// Catatan: File ini telah direfaktor dari Mobil.java ke KendaraanKursus.java...
// ...untuk mengakomodasi poin tambahan posttest.

class KendaraanKursus {
    protected String platNomor;
    protected String merk;
    protected String kategoriSIM;

    public KendaraanKursus(String platNomor, String merk, String kategoriSIM) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.kategoriSIM = kategoriSIM;
    }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public String getKategoriSIM() { return kategoriSIM; }
    public void setKategoriSIM(String kategoriSIM) { this.kategoriSIM = kategoriSIM; }

    public String getInfo() {
        return "Plat: " + platNomor + " | Merk: " + merk + " | Kategori: " + kategoriSIM;
    }

    public String cekKondisi() {
        return "Pengecekan standar kendaraan selesai.";
    }
}

class MobilManual extends KendaraanKursus {
    private String kondisiKopling;

    public MobilManual(String platNomor, String merk, String kondisiKopling) {
        super(platNomor, merk, "SIM A");
        this.kondisiKopling = kondisiKopling;
    }

    public String getKondisiKopling() { return kondisiKopling; }
    public void setKondisiKopling(String kondisiKopling) { this.kondisiKopling = kondisiKopling; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | [MANUAL] Kopling: " + kondisiKopling;
    }

    @Override
    public String cekKondisi() {
        return "Fokus Pengecekan: Kampas kopling (" + kondisiKopling + ") responsif.";
    }
}

class MobilMatic extends KendaraanKursus {
    private String statusCVT;

    public MobilMatic(String platNomor, String merk, String statusCVT) {
        super(platNomor, merk, "SIM A Matic");
        this.statusCVT = statusCVT;
    }

    public String getStatusCVT() { return statusCVT; }
    public void setStatusCVT(String statusCVT) { this.statusCVT = statusCVT; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | [MATIC] CVT: " + statusCVT;
    }

    @Override
    public String cekKondisi() {
        return "Fokus Pengecekan: Transmisi matic CVT (" + statusCVT + ") normal.";
    }
}

class TrukInstruksi extends KendaraanKursus {
    private int kapasitasMuatanTon;

    public TrukInstruksi(String platNomor, String merk, int kapasitasMuatanTon) {
        super(platNomor, merk, "SIM B1");
        this.kapasitasMuatanTon = kapasitasMuatanTon;
    }

    public int getKapasitasMuatanTon() { return kapasitasMuatanTon; }
    public void setKapasitasMuatanTon(int kapasitasMuatanTon) { this.kapasitasMuatanTon = kapasitasMuatanTon; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | [TRUK] Muatan: " + kapasitasMuatanTon + " Ton";
    }

    @Override
    public String cekKondisi() {
        return "Fokus Pengecekan: Rem angin dan sasis truk menahan " + kapasitasMuatanTon + " Ton.";
    }
}