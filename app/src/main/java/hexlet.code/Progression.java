package hexlet.code;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Progression {
    static String ch;

    public static void progressive() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String names = scanner.nextLine();
        System.out.println("Hello, " + names + "!");
        int count = 0;
        System.out.println("What number is missing in the progression?");
        Random random = new Random();
        while (count < 3) {
            int j = 1;
            int startLine = random.nextInt(99);
            int difference = random.nextInt(9);
            int lengthArray = random.nextInt(6) + 5;
            int[] arrayNumber = new int[lengthArray];
            int hiddenPosition = random.nextInt(lengthArray);
            for (int i = 0; i < lengthArray - 1; i++) {
                arrayNumber[0] = startLine;
                arrayNumber[j] = arrayNumber[i] + difference;
                j++;
                ch = String.valueOf(arrayNumber[hiddenPosition]);
            }
            System.out.println("Question: " + Arrays.toString(arrayNumber)
                    .replace("[", "").replace("]", "")
                    .replace(ch, ".."));

            Integer answer = scanner.nextInt();
            System.out.println("Your answer: " + answer);
            if (answer == arrayNumber[hiddenPosition]) {
                System.out.println("Correct!");
                count++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + arrayNumber[hiddenPosition] + "'.");
                break;
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + names + "!");
        }
        scanner.close();
    }
}

