import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci valore 1: ");
        Double d1 = Double.valueOf(scanner.nextLine());

        System.out.println("Inserisci valore 2: ");
        Double d2 = Double.valueOf(scanner.nextLine());

        if (d1 == d2) {
            System.out.println("I due valori sono uguali");
        }
    }
}
