public class Zahlung {
    private double betrag;
    private boolean zahlungsstatus;
    private Mietvertrag vermietung;

    public Zahlung(double betrag, boolean zahlungsstatus, Mietvertrag vermietung) {
        this.betrag = betrag;
        this.zahlungsstatus = zahlungsstatus;
        this.vermietung = vermietung;
    }

    public double getBetrag() {
        return betrag;
    }

    public void setBetrag(double betrag) {
        this.betrag = betrag;
    }

    public boolean isZahlungsstatus() {
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
}
