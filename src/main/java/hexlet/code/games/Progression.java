package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Scanner;

public class Progression {

    static final Scanner ANSWER = new Scanner(System.in);

    public static void game() {
        Cli.greetings();
        System.out.println("What number is missing in the progression?");

        int count = 0;
        final int maxCount = 3;

        while (count < maxCount) {

            final int lengthArray = 10; // это же число есть максимально возможная дельта для прогрессии
            String[] progression = new String[lengthArray];

            final int maxNumberInProgression = 100;
            progression[0] = (int) (Math.random() * maxNumberInProgression) + "";

            final int delta = (int) (Math.random() * 10); // элемент с таким же индексом буду ислючать из прогрессии

            for (int i = 1; i < progression.length; i++) {
                progression[i] = Integer.parseInt(progression[i - 1]) + delta + "";
            }
            String answerNum = progression[delta];
            progression[delta] = "..";


            System.out.println("Question: " + String.join(" ", progression));
            String answerNext = ANSWER.next();

            if (Engine.correctOrNot(answerNext.equals(answerNum), answerNum, answerNext)) {
                break;
            }

            count++;
        }

        Engine.congratulations(count == maxCount);

    }

}
