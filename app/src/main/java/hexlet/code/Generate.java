
package hexlet.code;

import java.util.Random;

public class Generate {
    private static final int BOUND = 100;
    private static Random random = new Random();

    public static int generateNum() {
        int origin = 1;
        return random.nextInt(origin, BOUND);
    }

    public static int generaNum(int origin, int bound) {
        return random.nextInt(origin, bound);
    }
}

