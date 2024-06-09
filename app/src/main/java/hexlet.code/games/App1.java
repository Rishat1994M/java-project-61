package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;


public class App1 {
    static String ch;
    public static void testing() {
        Random random = new Random();
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
        System.out.print("Question: " + Arrays.toString(arrayNumber)
                .replace("[", "").replace("]", "")
                .replace(ch, ".."));
    }
}
