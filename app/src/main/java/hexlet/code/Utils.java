
package hexlet.code;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int generateNum(int origin, int upperBound) {
        return RANDOM.nextInt(origin, upperBound);
    }

    public static int generateNumber(int origin, int upperBound) {
        return RANDOM.nextInt(origin, upperBound);
    }
}
