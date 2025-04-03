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

    private static boolean hasOnlyEvenDigits(String number) {
        // "53455" -> false
        // "24680" -> true;
        //  int result = '5' - '0';
        //  int result = 53 - 48;  // ASCII-таблица
        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit) && (digit - '0') % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean hasBalanceEvenOddDigits(String number) {
        int evenCount = 0, oddCount = 0;

        for (char digit : number.toCharArray()) {
            if (Character.isDigit(digit)) {

                if ((digit - '0') % 2 == 0) evenCount++;
                else oddCount++;

            }
        }

        return evenCount == oddCount;

    }

    /**
     * Найти количество чисел, содержащих только четные цифры, а среди них —
     * количество чисел с равным числом четных и нечетных цифр.
     * @param nums
     */
    public static void task5(String[] nums) {
        int onlyEvenDigitCount = 0, balancedCount = 0;

        for (String n : nums) {
            if (hasOnlyEvenDigits(n)) {
                onlyEvenDigitCount++;
            } else {

                if (hasBalanceEvenOddDigits(n)) {
                    balancedCount++;
                }
            }

        }

        System.out.printf("Только с четными %d%n", onlyEvenDigitCount);
        System.out.printf("Сбалансированные с четными и нечетными цифрами %d%n", balancedCount);

    }


    private static boolean hasStrictAscDigits(String number) {
        // number = "12479"
        // "7" < "9"

        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) >= number.charAt(i + 1)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Найти число, цифры в котором идут в строгом порядке возрастания. Если
     * таких чисел несколько, найти первое из них.
     * @param nums
     */
    public static void task6(String[] nums) {
        // 12479 - ответ.
        // 3678
        // 12345

        // TODO: дописать код.
    }

    private static boolean hasAllUniqueDigits(String number) {
        // Вариант 1: Использовать Set: O(N)
        Set<Character> digits = new HashSet<>();
        digits.add('5');
        digits.add('5');
        digits.add('3');

//        for (int i = 0; i < ; i++) {
//
//        }

        // Вариант 2: Использовать вложенный цикл: O(N * logN)
//        for (int i = 0; i < ; i++) {
//            for (int j = 0; j < ; j++) {
//
//            }
//        }

        return true;
    }

    public static void task7(String[] nums) {
        // TODO: Решение задачи
    }


    public static void task8(String[] nums) {
        // TODO: Решение задачи
    }

    public static void main(String[] args) {
        String[] numbers = getInformation();
//        task1(numbers);
//        task2(numbers);
//        task3(numbers);
//        task4(numbers);
        task5(numbers);
        task7(numbers);
        task8(numbers);

    }
}
