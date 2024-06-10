package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Prime {
    public static boolean isSimple(int start) {
        if (start < 2) {
            return false;
        }
        for (int k = 2; k <= Math.sqrt(start); k++) {
            if (start % k == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String names = scanner.nextLine();
        System.out.println("Hello, " + names + "!");
        int count = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (count < 3) {
            Random random = new Random();
            int startNumber = random.nextInt(99);
            System.out.println("Question: " + startNumber);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            boolean b = isSimple(startNumber);

            if (b && answer.equalsIgnoreCase("yes")
                    || (!b && answer.equalsIgnoreCase("no"))) {
                System.out.println("Correcrt!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + (b ? "yes" : "no") + "'.");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + names + "!");
        }
        scanner.close();
    }
}