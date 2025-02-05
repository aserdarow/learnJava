package tasks.chapter1;

import java.util.Scanner;

public class VariantB {
    public static long[] getNumbersFromInput() {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter number of count: ");
        int numOfCount = scan.nextInt();

        long[] numbers = new long[numOfCount];

        for (int i = 0; i < numOfCount; i++) {
            System.out.println("Enter your number: ");
            long num = scan.nextLong();
            numbers[i] = num;
        }
        scan.close();

        return numbers;
    }

    public static boolean isEven(long number) {
        return number % 2 == 0;
    }

    public static void task1(long[] nums) {
        for (long num : nums) {
            if (isEven(num)) {
                System.out.println(num + " - четное");
            } else {
                System.out.println(num + " - нечетное");
            }
        }
    }

//    public static void task2(long[] nums) {
//        Scanner scan = new Scanner(System.in);
//
//        long max = Integer.MAX_VALUE;
//        long min = Integer.MIN_VALUE;
//
//        for (long num : nums) {
//            long numbers = scan.nextLong();
//            if (numbers < min) {
//                min = numbers;
//            }
//            if (numbers > max) {
//                max = numbers;
//            }
//
//        }
//
//        System.out.println("Наименьшее число: " + min);
//        System.out.println("Наибольшее число: " + max);
//
//        scan.close();
//
//        // {-5, -20, -40, 1}
//    }


    public static void  task3(long[] nums){
        for (long num : nums){
            if (num % 3 == 0){
                System.out.println(num + " - делится на 3 и на 9");
            }
        }
    }

    // TODO: остальные задачи

    public static void task4(long[] nums) {
        for (long num : nums) {
            if (num % (5 * 7) == 0) {
                System.out.println(num + " - делится на 5 и на 7");
            }
        }
    }

    //9263567233
//132351453426236
    public static boolean isPrimeImprove(long num) {
        long numRoot = (long) Math.sqrt(num) + 1;

        for (long i = 2; i < numRoot; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static boolean isPrime(long num) {
        for (long i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void task6(long[] nums) {
        for (long num : nums) {
            if (isPrimeImprove(num)) {
                System.out.println(num);
            }
        }
    }

    public static void task9(long[] nums) {
        // https://thecode.media/is-happy/

        // TODO: В программировании под счастливым числом понимают натуральное число,
        //  сумма квадратов цифр которого в итоге равна 1
    }

    public static void task10(long[] nums) {
        // TODO: Число палиндром, 1221, 12321
    }

    public static void task11(long nums) {
        //    [1, 3, 5, 7, 11, 2, 0]
    }


    public static void main(String[] args) {
        long[] numbers = getNumbersFromInput();

        //task1(numbers);
        //task2(numbers);
  task3(numbers);
//        task4(numbers);
        //task6(numbers);

        /*
        List of prime numbers: http://compoasso.free.fr/primelistweb/page/prime/liste_online_en.php
         */
    }
}
