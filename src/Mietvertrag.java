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

    ;

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
        Scanner s = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String kunde = s.next();
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = s.nextInt();
        System.out.print("Welche Sicherheit wollen Sie hinterlegen?");
        String sicherheit = s.next();
        System.out.print("Bitte geben Sie Ihre Telefonnummer ein: ");
        int telefonnummer = s.nextInt();
        System.out.print("Sind Sie ein Geschäftskunde? ");
        String gfkunde = s.next();


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

    public void Vertragsvorlage () {

    }
}
