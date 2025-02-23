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
    double rem(double a, double b){
        return a % b;
    }
//    double pow(double a, double b){
//        return Math.pow(double a,double b);
//    }


    //  Добавьте возможность возведения числа в степень ( ^ ).

    public static void main(String[] args) {
        String operators = "+-*/%^";

        Scanner scan = new Scanner(System.in);

        System.out.println("Выберите операцию (+, -, *, /, %, ^): ");
        String operation = scan.nextLine();

        if (!operators.contains(operation)) {
            System.out.println("Выбранная операция недоступно...");
        } else {
            System.out.println("Введите первое число: ");
            double a = scan.nextDouble();

            System.out.println("Введите второе число: ");
            double b = scan.nextDouble();

            Calculator calc = new Calculator();

            switch (operation){
                case "+": System.out.println(calc.sum(a,b));
                case "-": System.out.println(calc.sub(a,b));
                case "*": System.out.println(calc.multi(a,b));
                case "/": System.out.println(calc.div(a,b));
                case "%": System.out.println(calc.rem(a,b));
            }

//            if (operation.equals("+")) {
//                System.out.println(calc.sum(a, b));
//            } else if (operation.equals("-")) {
//                System.out.println(calc.sub(a, b));
//            } else if (operation.equals("*")) {
//                System.out.println(calc.multi(a, b));
//            } else if (operation.equals("/")) {
//                System.out.println(calc.div(a, b));
//            } else if (operation.equals("%")){
//                System.out.println(calc.rem(a, b));
//            }
        }

        scan.close();
    }
}
