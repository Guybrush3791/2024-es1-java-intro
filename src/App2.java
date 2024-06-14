import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        // conditions
        int x = 5;
        int y = 30;

        boolean boolValue = true;

        boolean xIsGreater = x > y;

        if (xIsGreater) {
            System.out.println("x e' maggiore di y");
        }

        if (x > y) {
            System.out.println("x e' maggiore di y");
        } else {
            System.out.println("x e' minore o uguale a y");
        }

        if (x > y) {
            System.out.println("x e' maggiore di y");
        } else if (x < y) {
            System.out.println("x e' minore di y");
        } else {
            System.out.println("x e' uguale a y");
        }

        // relational operators
        boolean b1 = !boolValue; // not

        boolean b2 = (x == y); // equal to
        boolean b3 = (x != y); // not equal to

        boolean b4 = (x > y); // strictly greater than
        boolean b5 = (x < y); // strictly less than

        boolean b6 = (x >= y); // greater than or equal to
        boolean b7 = (x <= y); // less than or equal to

        // --- exercises ---
        // 1. richiedi all'utente di inserire due numeri e dire se:
        // - il primo e' maggiore del secondo
        // - il secondo e' maggiore del primo
        // - sono uguali

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci due numeri: ");
        int val1 = Integer.valueOf(scanner.nextLine());
        int val2 = Integer.valueOf(scanner.nextLine());

        if (val1 > val2) {
            System.out.println("il primo e' maggiore del secondo");
        } else if (val1 < val2) {
            System.out.println("il secondo e' maggiore del primo");
        } else {
            System.out.println("sono uguali");
        }

        // 2. richiedere un numero all'utente, moltiplicarlo per 100 e dire se e'
        // maggiore o minore di 500

        System.out.println("Inserisci un numero: ");
        int val3 = Integer.valueOf(scanner.nextLine());
        // val3 = val3 * 100;
        val3 *= 100;

        if (val3 > 500) {
            System.out.println(val3 + " e' maggiore di 500");
        } else {
            System.out.println(val3 + " e' minore o uguale a 500");
        }

        scanner.close();
    }
}
