public class App3 {

    public static void main(String[] args) {

        // assignment operators
        int x = 10;
        System.out.println("x: " + x);

        x += 5;
        System.out.println("x: " + x);

        x++;
        System.out.println("x: " + x);

        x--;
        System.out.println("x: " + x);

        x -= 20;
        System.out.println("x: " + x);

        x *= 3;
        System.out.println("x: " + x);

        x /= 5;
        System.out.println("x: " + x);

        // logical operators
        int y = 50;

        if (y > 10 && y < 20) {
            System.out.println("y e' maggiore di 10 e minore di 20");
        }

        // con1 && con2 && con3 ... --> vera se tutte le condizioni sono vere

        if (y > 10 || y < -10) {
            System.out.println("y e' maggiore di 10 o minore di -10");
        }

        // con1 || con2 || con3 ... --> vera se almeno una condizione e' vera

        if (!(y > 10 || y < -10)) {
            System.out.println("y NON e' maggiore di 10 o minore di -10");
        }

        // !cond --> nega la condizione

        // ternary operator
        // int z = y > 10 ? 10 : 20;

        int z;
        if (y > 10) {
            z = 10;
        } else {
            z = 20;
        }

        System.out.println("z: " + z);

        // boolean z = y > 10 ? true : false;
        boolean q = y > 10;

        boolean isItalian = false;
        String greeting = isItalian ? "Ciao!" : "Hello!";
        System.out.println(greeting);
    }
}
