package tasks.chapter1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VariantA {

    // TODO: 1
    public static void task1() {
        System.out.println("Enter name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello, " + name + ".");
        scan.close();


    }

    // TODO: 2


    public static void main(String[] args) {
        task1();

    }
}
