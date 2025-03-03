package examples;

import java.util.Arrays;


public class File0303 {

    static void example1() {
        int[] nums = new int[20];
        String[] names = new String[15];
        char[] chars = new char[6];

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(chars));
    }

    static void example2() {
        // Массив с элементами
        int[] nums = {5, 65, 7, 23, 43};

//        int[] numsTwo = {15, 55, 77, 33, 73};
//        nums = numsTwo;


        // 1 2 3 4 ... 20 21 22 ... + 2
        String[] names = {"Alice", "Bob", "John"};
        char[] chars = {'A', 'B', 'C', ' '};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(chars));
    }

    static void example3() {
        int[] nums = new int[20];
        String[] names = new String[15];
        char[] chars = new char[6];


        int value = 5;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = value;
            value += 5;
        }

        String[] tempNames = {"Alice", "Bob", "John"};
        int j = 0;
        for (int i = 0; i < names.length; i++) {
            j = j % tempNames.length;
//            j %= tempNames.length;
            // j = 0 % 3  = 0
            // j = 1 % 3  = 1
            // j = 2 % 3  = 2
            // j = 3 % 3  = 0
            // j = 0 % 3  = 0
            // j = 1 % 3  = 1
            // j = 2 % 3  = 2
            // j = 3 % 3  = 0

            names[i] = tempNames[j];
            j++;
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(chars));
    }

    static void example4() {
        int[][] coords = {
                {2, 5},
                {3, 1},
                {4, 2},
                {6, 7}
        };

        // coords[0] ===> {2, 5}
        // coords[1] ===> {3, 1}
        // coords[2] ===> {4, 2}
        // coords[3] ===> {6, 7}

        // -----------------------------
        // coords[0][1] ===> 5;
        // coords[3][0] ===> 6;

    }

    static void example5() {
        int[] nums = {5, 65, 7, 23, 43};
        int[] numsTwo = nums;

        System.out.println(nums == numsTwo);  // always true
    }

    static void example6() {
        int[] nums = {5, 65, 7, 23, 43};
        int[] numsTwo = {5, 65, 7, 23, 43};

        System.out.println(Arrays.equals(nums, numsTwo));  // true
    }

    static void example7() {
        int[] nums = {5, 65, 7, 23, 43};
        int[] numsTwo = {5, 65, 7, 23, 43};

        System.out.println(Arrays.compare(nums, numsTwo));  // true
    }

    static void example8() {
        int[] nums = {5, 65, 7, 23, 43};
        int[] numsTwo = {55, -65, -7, 2323, 943};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        Arrays.sort(numsTwo);
        System.out.println(Arrays.toString(numsTwo));

    }

    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
//        example5();
//        example6();
//        example7();
        example8();
    }
}
