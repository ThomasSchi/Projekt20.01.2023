
public class Autos {
    private String marke;
    private String typ;
    private double preisprotag;
    private boolean verfügbarkeit;

    public Autos(String marke, String typ, double preisprotag, boolean verfügbarkeit) {
        this.marke = marke;
        this.typ = typ;
        this.preisprotag = preisprotag;
        this.verfügbarkeit = verfügbarkeit;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getPreisprotag() {
        return preisprotag;
    }

    public void setPreisprotag(double preisprotag) {
        this.preisprotag = preisprotag;
    }

    public boolean getVerfügbarkeit() {
        return verfügbarkeit;
    }

    public void setVerfügbarkeit(boolean verfügbarkeit) {
        this.verfügbarkeit = verfügbarkeit;
    }
}

