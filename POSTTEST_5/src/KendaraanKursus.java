public abstract class KendaraanKursus implements PerawatanKendaraan {
    protected String platNomor;
    protected String merk;
    protected String kategoriSIM;
    protected String jadwalServis;

    public KendaraanKursus(String platNomor, String merk, String kategoriSIM) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.kategoriSIM = kategoriSIM;
        this.jadwalServis = "Belum Terjadwal";
    }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public String getKategoriSIM() { return kategoriSIM; }
    public void setKategoriSIM(String kategoriSIM) { this.kategoriSIM = kategoriSIM; }

    public abstract String cekKondisi();

    public String getInfo() {
        return "Plat: " + platNomor + " | Merk: " + merk + " | Kategori: " + kategoriSIM;
    }

    @Override
    public void jadwalkanServis(String tanggal) {
        this.jadwalServis = tanggal;
    }

    @Override
    public String cekJadwalServis() {
        return this.jadwalServis;
    }
}