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
        } else System.out.print("Welche Sicherheit wollen Sie hinterlegen?");
        String sicherheit = s.next();
        System.out.print("Bitte geben Sie Ihre Telefonnummer ein: ");
        int telefonnummer = s.nextInt();
        System.out.print("Sind Sie ein Geschaeftskunde? ");
        String gfkunde = s.next();
        System.out.print("Ihr Vertrag wird nun erstellt: ");


        Autos auto1 = new Autos("BMW", "Limusine", 130, true, 1);
        Autos auto2 = new Autos("BMW", "Gälendewagen", 130, true, 2);
        Autos auto3 = new Autos("Audi", "Limusine", 100, false, 3);
        Autos auto4 = new Autos("Mercedes Benz", "Coupe", 230, true, 4);
        Lagerbestand lager = new Lagerbestand();
        lager.addCar(auto1);
        lager.addCar(auto2);
        lager.addCar(auto3);
        lager.addCar(auto4);


        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte suchen Sie die Marke aus.Sie können zwischen Audi,BMW,Mercedes Benz entscheiden");

        String marke1 = sc.next();
        if (marke1 == "BMW") {
            System.out.println("BMW sehr gute Wahl");

        } else if (marke1 == "Mercedes Benz") {
            System.out.println("Benz sehr gute Wahl");

        } else if (marke1 == "Audi") {
            System.out.println("Audi sehr gute Wahl");

        } else {
            System.out.println("Bitte verfügbare Marke schreiben ");

        }
    }
}
