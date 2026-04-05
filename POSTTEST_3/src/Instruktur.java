class Instruktur {
    private String idInstruktur;
    private String nama;
    private String lisensi;

    protected int totalSiswaDiajar;
    String statusTersedia;

    public Instruktur(String idInstruktur, String nama, String lisensi) {
        this.idInstruktur = idInstruktur;
        this.nama = nama;
        this.lisensi = lisensi;
        this.statusTersedia = "Tersedia";
        this.totalSiswaDiajar = 0;
    }

    public String getIdInstruktur() { return idInstruktur; }
    public void setIdInstruktur(String idInstruktur) { this.idInstruktur = idInstruktur; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getLisensi() { return lisensi; }
    public void setLisensi(String lisensi) { this.lisensi = lisensi; }

    protected void tambahSiswa() { this.totalSiswaDiajar++; }
    void ubahStatus(String status) { this.statusTersedia = status; }
}