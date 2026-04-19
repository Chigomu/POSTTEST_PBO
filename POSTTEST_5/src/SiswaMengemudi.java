class SiswaMengemudi {
    private String idSiswa;
    private String nama;
    private String paketKursus;
    protected String catatanInternal;
    String statusAktif;

    public SiswaMengemudi(String idSiswa, String nama, String paketKursus) {
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.paketKursus = paketKursus;
        this.statusAktif = "Aktif";
        this.catatanInternal = "Siswa baru terdaftar";
    }

    public String getIdSiswa() { return idSiswa; }
    public void setIdSiswa(String idSiswa) { this.idSiswa = idSiswa; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getPaketKursus() { return paketKursus; }
    public void setPaketKursus(String paketKursus) { this.paketKursus = paketKursus; }

    protected void perbaruiCatatan(String catatan) { this.catatanInternal = catatan; }
    void nonaktifkanSiswa() { this.statusAktif = "Tidak Aktif"; }

    public void aturJadwal(String hari) {
        this.catatanInternal = "Jadwal Latihan: " + hari + " (Jam Fleksibel)";
    }

    public void aturJadwal(String hari, String jam) {
        this.catatanInternal = "Jadwal Latihan: " + hari + " Pukul " + jam;
    }
}