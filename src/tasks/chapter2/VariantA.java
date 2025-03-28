package tasks.chapter2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

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
        //Arrays.sort(nums, Comparator.comparingInt(String));
        System.out.println("Число в порядке возрастание длины: ");
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            System.out.println(num + " (длина: " + num.length() + ")");
        }


        //Arrays.sort(nums,Comparator.comparingInt());

    }


    public static void task3(String[] nums) {

        double sumLength = 0;
        for (int i = 0; i < nums.length; i++) {
            String num = nums[i];
            sumLength += num.length();
        }
        double avgLength = sumLength / nums.length;

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
    public static void task4(String[] nums){
        String minNum = nums[0];
        int minCount =;
    }

    public static void main(String[] args) {
        String[] numbers = getInformation();
        //task1(numbers);
        //task2(numbers);
        task3(numbers);
        //task4(numbers);
        //task5(numbers);

    }
}
