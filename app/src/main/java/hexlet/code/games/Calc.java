package hexlet.code.games;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String names = scanner.nextLine();
        System.out.println("Hello, " + names + "!");

        int count = 0;
        System.out.println("What is the result of the expression?");
        Random random = new Random();

        while (count < 3) {
            int randomNumber1 = random.nextInt(100) + 1;
            int randomNumber2 = random.nextInt(100) + 1;
            int result = 0;

            char[] myChar = new char[]{'+', '-', '*'};
            int n = (int) Math.floor(Math.random() * myChar.length);
            char sign = myChar[n];

            if (sign == '+') {
                result = randomNumber1 + randomNumber2;
            } else if (sign == '-') {
                result = randomNumber1 - randomNumber2;
            } else if (sign == '*') {
                result = randomNumber1 * randomNumber2;
            }
            System.out.println("Question: " + randomNumber1 + " " + sign + " " + randomNumber2);

            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == result) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + names + "!");
        }
        scanner.close();
    }
}

