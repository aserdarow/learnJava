package examples;


import java.util.Scanner;

/*
Оператор условного перехода.
if - если
else-if - иначе если
else-if - иначе если
else-if - иначе если
else - иначе
*/
public class ConditionalOperators {
    static int maxTwo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static int maxThree(int a, int b, int c) {

        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }


    static int minTwo(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }


    static int minThree(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    static int maxFour(int a, int b, int c, int d) {
        if (a > b && a > c && a > d) {
            return a;
        } else if (b > a && b > c && b > d) {
            return b;
        } else if (c > a && c > b && c > d) {
            return c;
        } else {
            return d;
        }
    }

    static int maxFour2(int a, int b, int c, int d) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        //int d = scan.nextInt();

        System.out.println("Answer:");
//        System.out.println(maxTwo(x, y));
//        System.out.println(maxThree(x, y, z));
//        System.out.println(minTwo(x, y));
        System.out.println(minThree(x, y, z));
//        System.out.println(maxFour(x, y, z, d));
    }
}
