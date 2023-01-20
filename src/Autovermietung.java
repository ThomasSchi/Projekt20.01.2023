import java.util.Scanner;

public class Autovermietung {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        String kunde = s.next();
        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        int alter = s.nextInt();
        if (alter < 18) {
            System.out.println("Vielen Dank fuer Ihr Interesse, melden Sie sich gerne, wenn Sie mindestens 18 geworden sind bei uns.");
        } else
        System.out.print("Welche Sicherheit wollen Sie hinterlegen?");
        String sicherheit = s.next();
        System.out.print("Bitte geben Sie Ihre Telefonnummer ein: ");
        int telefonnummer = s.nextInt();
        System.out.print("Sind Sie ein Geschaeftskunde? ");
        String gfkunde = s.next();
        System.out.print("Ihr Vertrag wird nun erstellt: ");




    }
}
