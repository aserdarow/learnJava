package tasks.chapter2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class VariantC {

    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

    }

    static int randint(int start, int end) {
        // (преобразовать) (случайное_число * (конец - начало) + начало)
        return (int) (Math.random() * (end - start) + start);

    }

    static void task1(int[][] ahmet,int k) {
//        Scanner scan = new Scanner(System.in);
//        int k = scan.nextInt();
        //scan.close();
        Arrays.sort(ahmet, Comparator.comparingInt(a -> a[k]));
        System.out.println("Измененная матрица (task1)");
        printMatrix(ahmet);


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ввдеите размерность матрицы: ");
        int n = scan.nextInt();

        int[][] matrix = new int[n][n];


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = randint(-n, n);

            }
        }
        int k = scan.nextInt();
        //scan.close();
        System.out.println("Исходная матрица");
        printMatrix(matrix);

        task1(matrix,k);
        //printMatrix(matrix);

    }


}
