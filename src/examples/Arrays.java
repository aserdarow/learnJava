package examples;

import java.util.Scanner;

public class Arrays {

    public static void example1() {
        int x = 10;

        int[] nums1 = {10, 20, 30, 40};

        System.out.println(x);
        System.out.println(nums1[2]);

        nums1[2] = 190;
        System.out.println(nums1[2]);

        int[] nums2 = new int[3];  // {0, 0, 0}

    }

    public static void example2() {
        Scanner sc = new Scanner(System.in);

        int numOfCount = sc.nextInt();
        int[] numbers = new int[numOfCount];

        for (int i = 0; i < numOfCount; i++) {
            int currNum = sc.nextInt();
            numbers[i] = currNum;
        }
    }


    public static void main(String[] args) {
//        example1();
        example2();
    }

}
