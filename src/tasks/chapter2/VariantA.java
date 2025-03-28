package tasks.chapter2;

import java.util.*;

public class VariantA {
    public static String[] getInformation() {
        Scanner scan = new Scanner(System.in);


        System.out.println("Введите количество чисел: ");
        int n = scan.nextInt();
        scan.nextLine();

        String[] nums = new String[n];
        System.out.println("Введите " + n + " чисел: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextLine();
        }
        scan.close();
        return nums;
    }

    public static void task1(String[] nums) {
        String shortestNum = nums[0];
        String longestNum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            if (num.length() < shortestNum.length()) {
                shortestNum = num;
            }
            if (num.length() > longestNum.length()) {
                longestNum = num;
            }

        }

        System.out.println("Самое короткая число: " + shortestNum + " его длина: " + shortestNum.length());
        System.out.println("Самое длиная число: " + longestNum + " его длина: " + longestNum.length());


    }

    public static void task2(String[] nums) {
        Arrays.sort(nums, Comparator.comparingInt(String::length));

        System.out.println("Число в порядке возрастание длины: ");
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            System.out.println(num + " (длина: " + num.length() + ")");
        }

        Arrays.sort(nums, Comparator.comparingInt(String::length).reversed());

        System.out.println("Число в порядке убывания длины: ");
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            System.out.println(num + " (длина: " + num.length() + ")");
        }

    }


    public static void task3(String[] nums) {

        int sumLength = 0;
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            sumLength += num.length();
        }
        int avgLength = sumLength / nums.length;

        System.out.println("Числа, длина которых меньше средней (" + avgLength + "):");
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            if (num.length() < avgLength) {
                System.out.println(num + " (длина: " + num.length() + ")");
            }
        }

        System.out.println("Числа, длина которых больше средней (" + avgLength + "):");
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            if (num.length() > avgLength) {
                System.out.println(num + "(длина: " + num.length() + ")");
            }
        }

    }

    private static int uniqueDigitsForTask4(String n) {
        // n ---> '111123';

        // {'2', '1', '3'}
        Set<Character> digits = new HashSet<>();

        char[] chars = n.toCharArray();  // {'1', '1', '1', '1', '2', '3'};
        for (int i = 0; i < chars.length; i++) {
            char currDigit = chars[i];
            digits.add(currDigit);
        }

        return digits.size();  // 3
    }

    public static void task4(String[] nums) {
        int minUniqueNum = uniqueDigitsForTask4(nums[0]);
        String result = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currUnique = uniqueDigitsForTask4(nums[i]);  // N-unique

            if (currUnique < minUniqueNum) {
                minUniqueNum = currUnique;
                result = nums[i];
            }
        }

        System.out.println(result);

    }

    public static void task5(String[] nums) {

        // 12434576
        // 24680246
        // 2468
        // 142538
        // 446448
        // 96124

        // 113779

        // 24680246
        // 2468
        // 446448

    }

    public static void task8(String[] nums) {
        // Палиндром
        // 12321
        // 1221
    }

    public static void main(String[] args) {
        String[] numbers = getInformation();
//        task1(numbers);
//        task2(numbers);
//        task3(numbers);
        task4(numbers);
        //task5(numbers);

    }
}
