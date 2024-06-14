import java.util.Scanner;

public class App4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // --- exercises ---
        /**
         * 1. richiedi all'utente di inserire un numero e dire se:
         * - il numero e' pari o dispari
         * - il numero divide esattamente 3
         * - il numero divide esattamente 5
         * - il numero divide esattamente 3 e 5
         * - il numero e' positivo ma minore di 100
         * 
         */

        System.out.println("Inserisci un numero: ");
        int userVal1 = Integer.valueOf(scanner.nextLine());
        if (userVal1 % 2 == 0) {
            System.out.println("Il numero e' pari");
        } else {
            System.out.println("Il numero e' dispari");
        }

        if (userVal1 % 3 == 0 && userVal1 % 5 == 0) {
            System.out.println("Il numero divide esattamente 3 e 5");
        } else {

            if (userVal1 % 3 == 0) {
                System.out.println("Il numero divide esattamente 3");
            } else if (userVal1 % 5 == 0) {
                System.out.println("Il numero divide esattamente 5");
            }
        }

        if (userVal1 > 0 && userVal1 < 100) {
            System.out.println("Il numero e' positivo ma minore di 100");
        }

        /**
         * 2. richiedi all'utente di inserire due numeri e stamparli in
         * ordine decrescente (dal piu' grande al piu' piccolo)
         */

        /**
         * 3. richiedi all'utente di inserire un numero e creare una variabile
         * di tipo stringa che conterra' 'ok' se il numero e' positivo, 'ko' altrimenti.
         * Stampare la stringa.
         */

        /**
         * 4. richiedi all'utente di inserire un numero e poi effettuare
         * le seguenti operazioni su quel numero:
         * - aggiungere 100
         * - togli 65
         * - motilicarlo per 3
         * - dividerlo per 6
         * 
         * Per ogni operazione, stampare il risultato con la virgola.
         * Alla fine stampare se il risultato finale e' un numero intero
         * o contiene dei decimali.
         */
    }
}
