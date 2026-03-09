class Mobil {
    private String platNomor;
    private String merk;
    private String transmisi;

    public Mobil(String platNomor, String merk, String transmisi) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.transmisi = transmisi;
    }

    public String getPlatNomor() { return platNomor; }
    public void setPlatNomor(String platNomor) { this.platNomor = platNomor; }
    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }
    public String getTransmisi() { return transmisi; }
    public void setTransmisi(String transmisi) { this.transmisi = transmisi; }
}