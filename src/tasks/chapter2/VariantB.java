package tasks.chapter2;

import java.util.Scanner;

public class VariantB {

    static void task1() {
        // 5 x 1 = 5
        // 5 x 2 = 10
        for (int i = 1; i <= 9; i++) { // I
            // i = 2
            for (int j = 1; j <= 9; j++) {  // J
                // i x 1 = i*j
                // i x 2 = i*j
                // i x 3 = i*j
                // i x 4 = i*j
                System.out.printf("%d x %d = %d%n", i, j, i * j);
            }
            System.out.println("---=====---");
        }
    }

    static void task2() {
        int[] nums = {10, 20, 30, 40, 50};

        System.out.print("{ ");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i] + ", ");
        }
        System.out.print("}");
    }

    static void task3() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (k > n && k <= m) {
            System.out.printf("%d принадлежит диапазону (%d %d] -> %s%n", k, n, m, k > n && k <= m);
        }
        if (k >= n && k < m) {
            System.out.printf("%d принадлежит диапазону [%d %d) -> %s%n", k, n, m, k >= n && k < m);
        }
        if (k > n && k < m) {
            System.out.printf("%d принадлежит диапазону (%d %d) -> %s%n", k, n, m, k > n && k < m);
        }
        if (k >= n && k <= m) {
            System.out.printf("%d принадлежит диапазону [%d %d] -> %s%n", k, n, m, k >= n && k <= m);
        }

        sc.close();
    }

    static void task4() {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
    }

    static void task5() {

        int n = 129;
        String binN = Integer.toBinaryString(n);

        int count = 0;

        for (int i = 0; i < binN.length(); i++) {
            if (binN.charAt(i) == '0') {
                count++;
            }

        }
        System.out.println(count);
    }

    static void task9() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число от 1 до 12:");
        int monthNumber = sc.nextInt();

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка: число должно быть от 1 до 12.");
        } else {
            String[] months = {
                    "Январь", "Февраль", "Март", "Апрель",
                    "Май", "Июнь", "Июль", "Август",
                    "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
            };
            System.out.println("Месяц: " + months[monthNumber - 1]);
        }
    }


    public static void main(String[] args) {
        //  task1();
        // task2();
        // task3();
        //task4();
        //task5();
        task9();
    }
}
