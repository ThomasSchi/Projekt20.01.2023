public class Zahlung {
    private double betrag;
    private boolean zahlungsstatus;
    private Mietvertrag vermietung;
    private int Vertragsnummer;

    public Zahlung(double betrag, boolean zahlungsstatus, Mietvertrag vermietung) {
        this.betrag = betrag;
        this.zahlungsstatus = zahlungsstatus;
        this.vermietung = vermietung;
    }

    public double getBetrag(double betrag) {

        return betrag ;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public boolean isZahlungsstatus(boolean bezahlt) {


        return zahlungsstatus;
    }

    public void setZahlungsstatus(boolean zahlungsstatus) {
        this.zahlungsstatus = zahlungsstatus;
    }

    public Mietvertrag getVermietung() {
        return vermietung;
    }

    public void setVermietung(Mietvertrag vermietung) {
        this.vermietung = vermietung;
    }

    public void erstelleZahlungsbestaetigung() {
        if (this.zahlungsstatus) {
            String bestaetigung = "Zahlungsbestätigung\n" +
                    "Betrag: " + this.betrag + "\n" +
                    "Mietvertrag: " + //this.vermietung.getVertragsnummer() + "\n" +
                    "Bezahlt: Ja";
            System.out.println(bestaetigung);
        } else {
            System.out.println("Zahlung noch nicht eingegangen");
        }
    }
}
