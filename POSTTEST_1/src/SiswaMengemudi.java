class SiswaMengemudi {
    private String idSiswa;
    private String nama;
    private String paketKursus;

    public SiswaMengemudi(String idSiswa, String nama, String paketKursus) {
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.paketKursus = paketKursus;
    }

    public String getIdSiswa() { return idSiswa; }
    public void setIdSiswa(String idSiswa) { this.idSiswa = idSiswa; }
    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }
    public String getPaketKursus() { return paketKursus; }
    public void setPaketKursus(String paketKursus) { this.paketKursus = paketKursus; }
}