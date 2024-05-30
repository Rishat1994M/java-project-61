package hexlet.code;

import java.util.Scanner;
import java.util.Random;
public class GCD {
    public static int randomNumber1;
    public static int randomNumber2;

    public static void divider() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String names = scanner.nextLine();
        System.out.println("Hello, " + names + "!");

        int count = 0;
        System.out.println("Find the greatest common divisor of given numbers.");
        Random random = new Random();

        while (count < 3) {
            int randomNumber1 = random.nextInt(100) + 1;
            int randomNumber2 = random.nextInt(100) + 1;
            int result = 0;
            System.out.println("Question: " + randomNumber1 + " " + randomNumber2);


            int answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);

            if(randomNumber1%randomNumber2 == 0) {
                result = randomNumber2;
            } else if (randomNumber2%randomNumber1 == 0) {
                result = randomNumber1;
            } else {
                result = NOD(randomNumber1, randomNumber2);
            }

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
    public static int NOD (int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return NOD(b, a % b);
        }
    }
}
