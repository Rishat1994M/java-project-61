
package hexlet.code;

import java.util.Random;

public class Utils {
    private static int bound;
    private static final Random RANDOM = new Random();

    public static int generateNum() {
        int origin = 1;
        return RANDOM.nextInt(origin, bound);
    }

    public static void setBound(int newBound) {
        bound = newBound;
    }

    public static int generateNumber(int origin, int upperBound) {
        return RANDOM.nextInt(origin, upperBound);
    }
}
