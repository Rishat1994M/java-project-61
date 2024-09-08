package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int COUNT = 3;

    public static void runEngine(String description, String[][] roundsData) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String user = scanner.next();
        System.out.println("Hello, " + user + "!");
        System.out.println(description);

        for (String[] round : roundsData) {
            String question = round[0];
            String correctAnswer = round[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();
            if (userAnswer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + user + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + user + "!");
    }
}
