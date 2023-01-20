import java.util.Date;

public class Mietvertrag {

    private String kundenname;
    private String mietauto;
    private double tagespreis;
    private Date mietbeginn;
    private Date mietende;
    private double gesamtkosten;
    private String zahlungsmethode;

    public Vertrag (String kundenname, String mietauto, double tagespreis, Date mietbeginn, Date mietende, double gesamtkosten, String zahlungsmethode) {
        this.kundenname = kundenname;
        this.mietauto = mietauto;
        this.tagespreis = tagespreis;
        this.mietbeginn =mietbeginn;
        this.mietende = mietende;
        this.gesamtkosten = gesamtkosten;
        this.zahlungsmethode = zahlungsmethode;

    }

    public String getMarke() {
        return marke;
    }

}
