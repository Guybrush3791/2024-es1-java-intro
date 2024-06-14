import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // primitivi java
        boolean myBool = true; // !

        byte myByte = 100; // -128 to 127
        short myShort = 10; // -32,768 to 32,767
        int myInt = 5; // -2,147,483,648 to 2,147,483,647 // !
        long myLong = 1000000000; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 //

        float myFloat = 5.99f; // 32 bit // !
        double myDouble = 5.99; // 64 bit // !

        char myChar = 'a'; // 16 bit // !

        // operatori
        int x = 5;
        int y = 3;

        int sum = x + y;
        int diff = x - y;
        int prod = x * y;
        int quot = x / y;

        System.out.println("sum: " + sum);
        System.out.println("diff: " + diff);
        System.out.println("prod: " + prod);
        System.out.println("quot: " + quot);

        float f1 = 5.5f;
        float f2 = 3.5f;

        float fsum = f1 + f2;
        float fdiff = f1 - f2;
        float fprod = f1 * f2;
        float fquot = f1 / f2;

        System.out.println("fsum: " + fsum);
        System.out.println("fdiff: " + fdiff);
        System.out.println("fprod: " + fprod);
        System.out.println("fquot: " + fquot);

        // cast
        int myInt2 = 9;
        long myLong2 = myInt2; // implicit cast

        long myLong3 = 2147483648L;
        int myInt3 = (int) myLong3; // explicit cast

        System.out.println("myLong2: " + myLong2);
        System.out.println("myInt3: " + myInt3);

        // string
        String greeting = "Hello, World!";
        System.out.println(greeting);

        // string concatenation
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        // syso/scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName2 = scanner.nextLine();
        System.out.println("Hello " + name + " " + lastName2);

        scanner.close();

        // --- esercitazioni ---
        /**
         * 1. scrivere un programma che chiede all'utente di inserire due numeri e
         * stampa:
         * - la somma
         * - la differenza
         * - il prodotto
         * - il quoziente
         * 
         * 2. scrivere un programma che chiede all'utente nome e cognome e stampa:
         * - "Hello, nome cognome"
         * 
         * 
         */

    }
}
