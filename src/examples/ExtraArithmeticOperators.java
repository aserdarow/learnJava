package examples;

import java.util.Scanner;

public class ExtraArithmeticOperators {

    public static void divMod() {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        scanner.close();

        if (num % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }

//        19 % 2 = 1
//        24 % 2 = 0
//        7 % 2 = 1
//        3495673429 % 2 = 1
    }

    public static void main(String[] args) {
        divMod();
    }

}
