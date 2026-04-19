public class MobilMatic extends KendaraanKursus {
    private String statusCVT;

    public MobilMatic(String platNomor, String merk, String statusCVT) {
        super(platNomor, merk, "SIM A Matic");
        this.statusCVT = statusCVT;
    }

    public String getStatusCVT() { return statusCVT; }
    public void setStatusCVT(String statusCVT) { this.statusCVT = statusCVT; }

    @Override
    public String getInfo() {
        return super.getInfo() + " | [MATIC] CVT: " + statusCVT;
    }

    @Override
    public String cekKondisi() {
        return "Fokus Pengecekan: Transmisi matic CVT (" + statusCVT + ") normal.";
    }
}