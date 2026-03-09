class Instruktur {
    private String idInstruktur;
    private String nama;
    private String lisensi;

    public Instruktur(String idInstruktur, String nama, String lisensi) {
        this.idInstruktur = idInstruktur;
        this.nama = nama;
        this.lisensi = lisensi;
    }

    public String getIdInstruktur() { return idInstruktur; }
    public void setIdInstruktur(String idInstruktur) { this.idInstruktur = idInstruktur; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getLisensi() { return lisensi; }
    public void setLisensi(String lisensi) { this.lisensi = lisensi; }
}