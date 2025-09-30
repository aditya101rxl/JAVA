import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) throws IOException {
        System.err.println("Input/Output in JAVA.");

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a character: ");
        int charAscii = bf.read();
        System.out.println("Char value is: " + (char) charAscii);

        bf.readLine(); // consume leftover newline

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("You entered: " + num);

        // Do NOT close bf or sc here — we still need System.in

        // Try-with-resources using System.in (safe to reuse if not closed earlier)
        try (BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter another character: ");
            int ch = bfr.read();
            System.out.println("You entered: " + (char) ch);
            bfr.readLine(); // consume newline
        }

        // Try-finally example
        Scanner ssc = null;
        try {
            // bfr closed in above try-with-resource, so here System.in gives error.
            // bcoz, bfr recursivly closes all resources.
            ssc = new Scanner(System.in);
            System.out.print("Enter a line of text: ");
            String line = ssc.nextLine();
            System.out.println("You entered: " + line);
        } catch (Exception e) {
            System.out.println("Error in resource allocation."+e);
        } finally {
            System.out.println("This block always executes.");
            if (ssc != null) ssc.close(); // OK to close at the end
        }
    }
}
