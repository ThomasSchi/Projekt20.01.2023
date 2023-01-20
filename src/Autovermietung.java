import java.util.Scanner;

public class Autovermietung {
    public static void main(String[] args) {
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
