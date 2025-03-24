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

    public static void main(String[] args) {
        //  task1();
        // task2();
        task3();
    }
}
