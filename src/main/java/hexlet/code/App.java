
package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Cli.questionUser;
import static hexlet.code.games.Even.evenGreeting;
import static hexlet.code.games.Calc.calcGreeting;
import static hexlet.code.games.GCD.gcdGreeting;
import static hexlet.code.games.Progression.progressionGreeting;
import static hexlet.code.games.Prime.primeGreeting;

public class App {

    public static void main(String[] args) {
        showMenu();
        runningGames();
    }

    private static void showMenu() {
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.println();
    }

    private static void runningGames() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        switch (userChoice) {
            case "1" -> questionUser();
            case "2" -> evenGreeting();
            case "3" -> calcGreeting();
            case "4" -> gcdGreeting();
            case "5" -> progressionGreeting();
            case "6" -> primeGreeting();
            default -> System.out.println("Number entered incorrectly: " + userChoice);
        }
        scanner.close();
    }
}
