package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Even {
    public static void parity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String names = scanner.nextLine();
        System.out.println("Hello, " + names + "!");

        int count = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Random random = new Random();

        while (count < 3) {
            int randomNumber = random.nextInt(100) + 1;
            System.out.println("Question: " + randomNumber);
            String answer = scanner.nextLine();
            System.out.println("Your answer: " + answer);
            if ((randomNumber % 2 == 0 && answer.equals("yes")) || (randomNumber % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + (randomNumber % 2 == 0 ? "yes" : "no") + ".");
                System.out.println("Let's try again, " + names);
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + names + "!");
        }
        scanner.close();
    }
}

