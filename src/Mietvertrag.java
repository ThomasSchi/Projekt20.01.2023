import java.util.Date;
import java.util.Scanner;

public class Mietvertrag {

    private String kundenname;
    private String mietauto;
    private double tagespreis;
    private Date mietbeginn;
    private Date mietende;
    private double gesamtkosten;
    private String zahlungsmethode;

    public Mietvertrag() {
    }


    public void Mietvertrag(String kundenname, String mietauto, double tagespreis, Date mietbeginn, Date mietende, double gesamtkosten, String zahlungsmethode) {
        this.kundenname = kundenname;
        this.mietauto = mietauto;
        this.tagespreis = tagespreis;
        this.mietbeginn = mietbeginn;
        this.mietende = mietende;
        this.gesamtkosten = gesamtkosten;
        this.zahlungsmethode = zahlungsmethode;


    }

    public static void Dateneingabe(String kundenname, Date mietbeginn, Date mietende, double gesamtkosten, String zahlungsmethode) {


    }




    // Kunden Kundendaten = new Kunden(Dateneingabe());


    public String getMietauto() {
        return mietauto;
    }

    public double getTagespreis() {
        return tagespreis;
    }

    public Date getMietbeginn() {
        return mietbeginn;
    }

    public Date getMietende() {
        return mietende;
    }

    public double getGesamtkosten() {
        return gesamtkosten;
    }

    public String getZahlungsmethode() {
        return zahlungsmethode;
    }

    public String getKundenname() {
        return kundenname;

    }

    public static void Vertragsvorlage (String kundenname, Date mietbeginn, Date mietende, double gesamtkosten, String zahlungsmethode) {

        System.out.println(" Name: " + kundenname);
        System.out.println("Mietbeginn: " + mietbeginn);
        System.out.println("Mietende: " + mietende);
        System.out.println("Die Gesamtkosten betragen fuer den Zeitraum: " + gesamtkosten);
        System.out.println("Mit welcher Zahlungsmethode möchten Sie das bezahlen?");

        if (zahlungsmethode == "visa") {
            System.out.println("Bitte geben Sie Ihre Kreditkartennummer ein: ");

            //methode über zahlungsmethode einfügen
            System.out.println("Kreditkartennummer : " );

        } else if (zahlungsmethode == "bar" ) {
            System.out.println("Bitte zahlen Sie das Geld ein.");
        } else if (zahlungsmethode == "EC-Karte" ) {
            System.out.println("Bitte geben Sie Ihre Kreditkartennummer ein: ");

        }



    }

}
