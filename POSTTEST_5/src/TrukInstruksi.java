public class TrukInstruksi extends KendaraanKursus {
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