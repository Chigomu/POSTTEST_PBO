public class MobilManual extends KendaraanKursus {
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