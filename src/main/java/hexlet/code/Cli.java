
package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void questionUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String user = scanner.next();
        System.out.println("Hello, " + user + "!");
    }
}
