package homeworks;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = scan.nextDouble();
        System.out.println("Введите второе число: ");
        double b = scan.nextDouble();

        double res1 = a + b;
        System.out.println("Ответ Сложения: " + res1);

        double res2 = a - b;
        System.out.println("Ответ Вычитание: " + res2);

        double res3 = a * b;
        System.out.println("Ответ Умножение: " + res3);

        double res4 = a / b;
        if (b == 0){
            System.out.println("Ошибка: деление на ноль");
        }else {
            System.out.println("Ответ Деления: " + res4);
        }

        scan.close();
    }
}
