package hexlet.code;

import java.util.Scanner;

public class Cli {

    private static String name;
    public static void greetings() {
        Scanner nameScan = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = nameScan.nextLine();
        System.out.println("Hello, " + name + "!");
    }


    public static String getName() {
        return name;
    }

}

