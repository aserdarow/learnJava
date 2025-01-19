package tasks.chapter1;

import java.util.Scanner;

public class VariantB {

    public static int[] getNumbersFromInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter number of count: ");
        int numOfCount = scan.nextInt();

        int[] numbers = new int[numOfCount];

        for (int i = 0; i < numOfCount; i++) {
            System.out.println("Enter your number: ");
            int num = scan.nextInt();
            numbers[i] = num;
        }
        scan.close();

        return numbers;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void task1(int[] nums) {
        for (int num : nums) {
            if (isEven(num)) {
                System.out.println(num + " - четное");
            } else {
                System.out.println(num + " - нечетное");
            }
        }
    }

    public static void task2(int nums) {
        // TODO: Алгоритм для максимального числа
        // {-5, -20, -40, 1}

        // текущееМаксимальноеЧисло = минусБесконечность
        // Цикл текущееЧисло из массива
        //     Если текущееЧисло больше текущееМаксимальноеЧисло, то
        //         текущееМаксимальноеЧисло =  текущееЧисло
        //
        // Вывести(текущееМаксимальноеЧисло)

    }

    // TODO: остальные задачи

    public static void task4(int[] nums) {
        for (int num : nums) {
            if (num % (5 * 7) == 0) {
                System.out.println(num + " - делится на 5 и на 7");
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = getNumbersFromInput();

        task1(numbers);
//        task2(numbers);
//        task3(numbers);
        task4(numbers);
    }
}

