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
}

class MobilManual extends KendaraanKursus {
    private String kondisiKopling;

    public MobilManual(String platNomor, String merk, String kondisiKopling) {
        super(platNomor, merk, "SIM A");
        this.kondisiKopling = kondisiKopling;
    }

    public String getKondisiKopling() { return kondisiKopling; }
    public void setKondisiKopling(String kondisiKopling) { this.kondisiKopling = kondisiKopling; }
}

class MobilMatic extends KendaraanKursus {
    private String statusCVT;

    public MobilMatic(String platNomor, String merk, String statusCVT) {
        super(platNomor, merk, "SIM A Matic");
        this.statusCVT = statusCVT;
    }

    public String getStatusCVT() { return statusCVT; }
    public void setStatusCVT(String statusCVT) { this.statusCVT = statusCVT; }
}

class TrukInstruksi extends KendaraanKursus {
    private int kapasitasMuatanTon;

    public TrukInstruksi(String platNomor, String merk, int kapasitasMuatanTon) {
        super(platNomor, merk, "SIM B1");
        this.kapasitasMuatanTon = kapasitasMuatanTon;
    }

    public int getKapasitasMuatanTon() { return kapasitasMuatanTon; }
    public void setKapasitasMuatanTon(int kapasitasMuatanTon) { this.kapasitasMuatanTon = kapasitasMuatanTon; }
}