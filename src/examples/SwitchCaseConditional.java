package examples;

import java.util.Scanner;

public class SwitchCaseConditional {
    static void exampleOne() {
        Scanner scan = new Scanner(System.in);

        String dayOfWeek = scan.nextLine();

        if (dayOfWeek.equals("Monday")) {
            System.out.println("Сегодня понедельник.");
        } else if (dayOfWeek.equals("Tuesday")) {
            System.out.println("Сегодня вторник.");
            // ...
        } else if (dayOfWeek.equals("Sunday")) {
            System.out.println("Сегодня воскресенье.");
        } else {
            System.out.println("Ошибка! Такой день недели не существует...");
        }

    }

    static void exampleTwo() {
        Scanner scan = new Scanner(System.in);

        String dayOfWeek = scan.nextLine();

        switch (dayOfWeek) {
            case "Monday":
                System.out.println("Сегодня понедельник.");
                break;
            case "Tuesday":
                System.out.println("Сегодня вторник.");
                break;
            // ...
            case "Sunday":
                System.out.println("Сегодня воскресенье.");
                break;
            default:
                System.out.println("Ошибка! Такой день недели не существует...");
        }

    }

    static void differenceBetweenEqualsAndCompareOperator() {
        int a = 10;
        int b = 20;

        if (a == b) {

        } else {
            System.out.printf("%d == %d = %s%n", a, b, a == b);
        }

        String s1 = "abc";
        String s2 = new String("abc");

        // Это один и тот же объект в памяти компьютера.
        if (s1 == s2) {

        } else {
            System.out.printf("%s == %s = %s%n", s1, s2, s1 == s2);
        }

        // Равны ли строки по значению.
        if (s1.equals(s2)) {
            System.out.printf("%s.equals(%s) = %s%n", s1, s2, s1.equals(s2));
        }
    }

    public static void main(String[] args) {
        differenceBetweenEqualsAndCompareOperator();
    }
}
