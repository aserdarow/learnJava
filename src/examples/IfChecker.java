package examples;

import java.util.Scanner;

public class IfChecker {

    static boolean isFirstCharUpper(String line) {
        char first = line.charAt(0);
        if (first > 'A' && first < 'Z') {
            return true;
        }
        return false;
    }

    static boolean isUpper(String line) {
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);

            if (currentChar < 'A' || currentChar > 'Z') {
                return false;
            } else if (currentChar < 'А' || currentChar > 'Я') {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        System.out.println("Answer:");
        System.out.printf("First char is upper: %s%n", isFirstCharUpper(text));
        System.out.printf("Is upper: %s%n", isUpper(text));

    }
}
