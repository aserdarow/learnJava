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

    // TODO: ДЗ
    static int minTwo() {
        return -1;
    }

    static int minThree() {
        return -1;
    }

    static int maxFour() {
        return -1;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        System.out.println("Answer:");
        System.out.println(maxTwo(x, y));
        System.out.println(maxThree(x, y, z));
    }
}
