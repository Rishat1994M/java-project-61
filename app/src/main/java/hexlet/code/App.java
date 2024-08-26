package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        int name1 = scanner.nextInt();
        System.out.println("Your choice: " + name1);
        if (name1 == 1) {
            Cli.greetings();
        } else if (name1 == 0) {
            return;
        } else if (name1 == 2) {
            Even.game();
        } else if (name1 == 3) {
            Calc.game();
        } else if (name1 == 4) {
            GCD.game();
        } else if (name1 == 5) {
            Progression.game();
        } else if (name1 == 6) {
            Prime.game();
        }
        scanner.close();
    }
}
