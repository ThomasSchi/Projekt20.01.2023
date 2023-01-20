
public class Autos {
    private String marke;
    private String typ;
    private double preisprotag;
    private boolean verfuegbarkeit;

    public Autos(String marke, String typ, double preisprotag, boolean verfuegbarkeit) {
        this.marke = marke;
        this.typ = typ;
        this.preisprotag = preisprotag;
        this.verfuegbarkeit = verfuegbarkeit;
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

    public boolean getVerfuegbarkeit() {
        return verfuegbarkeit;
    }

    public void setVerfuegbarkeit(boolean verfuegbarkeit) {
        this.verfuegbarkeit = verfuegbarkeit;
    }
}

