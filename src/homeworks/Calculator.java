package homeworks;

import java.util.Scanner;

public class Calculator {

    double sum(double a, double b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double multi(double a, double b) {
        return a * b;
    }

    double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Ошибка: деление на ноль!");
        }

        return a / b;
    }


    public static void main(String[] args) {
        String operators = "+-*/";

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = scan.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scan.nextDouble();

        System.out.println("Выберите операцию (+, -, *, /): ");
        String operation = scan.nextLine();

        if (!operators.contains(operation)) {
            System.out.println("Выбранная операция недоступна...");
        } else {

            Calculator calc = new Calculator();

            if (operation.equals("+")) {
                System.out.println(calc.sum(a, b));
            } else if (operation.equals("-")) {
                System.out.println(calc.sub(a, b));
            } else if (operation.equals("*")) {
                System.out.println(calc.multi(a, b));
            } else if (operation.equals("/")) {
                System.out.println(calc.div(a, b));
            }
        }

        scan.close();
    }
}
