
package hexlet.code;

import java.util.Random;

public class Utils {
    private static final int BOUND = 100;
    private static Random random = new Random();
    private static final String[] RANDOMOPERATOR = {"+", "-", "*", "-"};
    private static final int GENERATENUMB = 3;

    public static int generateNum() {
        int origin = 1;
        return random.nextInt(origin, BOUND);
    }

    public static int generaNum(int origin, int bound) {
        return random.nextInt(origin, bound);
    }

    public static String generateOperators() {
        int indexOfArray = random.nextInt(GENERATENUMB);
        return RANDOMOPERATOR[indexOfArray];
    }
}

