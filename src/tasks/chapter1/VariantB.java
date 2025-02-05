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

    public static void task2(long[] nums) {
        long max = Integer.MIN_VALUE;
        long min = Integer.MAX_VALUE;

        // Approach 1
        for (long num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        // Approach 2
//        long max = nums[0];
//        long min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];

            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }

        }

        System.out.println("Наименьшее число: " + min);
        System.out.println("Наибольшее число: " + max);

    }

    public static void task3(long[] nums) {
        for (long num : nums) {
            if (num % 3 == 0) {
                System.out.println(num + " - делится на 3 и на 9");
            }
        }
    }

    public static void task4(long[] nums) {
        for (long num : nums) {
            if (num % (5 * 7) == 0) {
                System.out.println(num + " - делится на 5 и на 7");
            }
        }
    }

    public static boolean isAllDigitsUnique(long n) {
        long lastDigit = n % 10;
        n = (int) (n / 10);

        long middleDigit = n % 10;
        n = (int) (n / 10);

        long firstDigit = n % 10;
        n = (int) (n / 10);


//        System.out.printf("%d %d %d", firstDigit, middleDigit,  lastDigit);

        return lastDigit != firstDigit && middleDigit != firstDigit && lastDigit != middleDigit;
    }

    public static void task5(long[] nums) {
        // 1. Это трехзначное число?
        // Да - то можно проверить его цифры.
        // Нет - то переходить к следующему числу в массиве.

        // 2. Как получить эти цифры числа?
        // предыдущая цифра = 3
        // текущая цифра =

        // c 783 % 10 = 3
//        783 / 10 = (long) 78.3
        // b 78 % 10 = 8
//        78.3 / 10 (long) 7.8 = 7
        // a 7 % 10 = 7
//        7 / 10 (long) 0.7 = 0

        // с != a and b != a and c != b

        for (long num : nums) {
            if (num > 99 && num < 1000) {
                if (isAllDigitsUnique(num)) {
                    System.out.println(num);
                }
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

    public static void task7Desc(long[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            // TODO:По убыванию
        }
    }

    public static void task7Asc(long[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            // TODO:По возрастанию
        }
    }

    //    nums.length - 1
    //     n = 7
    //    [5, 3, 7, 9, 1, 5, 3]  // n - 1 = 6

    public static void main(String[] args) {
        long[] numbers = getNumbersFromInput();

//        task1(numbers);
//        task2(numbers);
//        task3(numbers);
//        task4(numbers);
        task5(numbers);
//        task6(numbers);
//        task7(numbers);

        /*
        List of prime numbers: http://compoasso.free.fr/primelistweb/page/prime/liste_online_en.php
         */
    }
}
