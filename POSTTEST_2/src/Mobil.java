class Mobil {
    private String platNomor;
    private String merk;
    private String transmisi;

    protected String jadwalServis;
    String kondisi;

    public Mobil(String platNomor, String merk, String transmisi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.transmisi = transmisi;
        this.kondisi = "Baik";
        this.jadwalServis = "Bulan Depan";
    }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public String getTransmisi() { return transmisi; }
    public void setTransmisi(String transmisi) { this.transmisi = transmisi; }

    protected void setJadwalServis(String jadwal) { this.jadwalServis = jadwal; }
    void perbaruiKondisi(String kondisi) { this.kondisi = kondisi; }
}