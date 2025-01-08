package examples;

import java.util.Scanner;

public class In080125 {
    short year = 2025;

    public boolean isLeapYear(short someYear) {

        // TODO: Определить, является ли год високосным.

        return false;
    }


    public static void main(String[] args) {
        System.out.println("Enter name and press <Enter> & age and press <Enter>:");

        Scanner scan = new Scanner(System.in);

        String name = scan.next();
        System.out.println("Hello, " + name + "!");

        int num = scan.nextInt();
        System.out.println("Age: " + num + " years old.");

        scan.close();

        int num2 = 233;
        long likesCount = 2541526567346734435L;
        double pi = 3.141592f;
        float e = 2.78234514f;


        long result = 15 + 46546536546657L;

        char some = 'a';

        boolean is_sunny = true;
        boolean is_warm = false;
        double n = 1E9;  // 1_000_000_000.0
        
    }
}
