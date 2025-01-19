package tasks.chapter1;

import java.util.Scanner;

public class VariantA {
    public static void task1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scan.next();
        System.out.println("Hello, " + name + ".");

        scan.close();
    }

    public static void task2() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Enter your phone number: ");
        String phoneNumber = scan.next();

        System.out.println("Answer:");
        System.out.println(phoneNumber);
        System.out.println(age);

        scan.close();
    }

    public static void task3() {
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter number of count: ");
        int numOfCount = scan.nextInt();

        int[] numbers = new int[numOfCount];

        for (int i = 0; i < numOfCount; i++) {
            System.out.println("Enter your number: ");
            int num = scan.nextInt();
            numbers[i] = num;
        }
        scan.close();

//        System.out.println("Answer: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }

        System.out.println("Answer: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    public static void task4() {
        String password = "ahmet";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password");
        String userPassword = scan.next();

//        boolean result = password == userPassword;
        boolean result = password.equals(userPassword);
        System.out.println("Amwer: " + result);
        scan.close();

    }

    public static void task5() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of count: ");
        int numOfCount = scan.nextInt();
        int[] numbers = new int[numOfCount];

        for (int i = 0; i < numOfCount; i++) {
            System.out.println("Enter your number: ");
            int num = scan.nextInt();
            numbers[i] = num;
        }

        scan.close();

        int sum = 0;
        int product = 1;

        for (int j = 0; j < numOfCount; j++) {
            sum += numbers[j];
            product *= numbers[j];
        }

        System.out.println("Answer: ");
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Multiple of numbers: " + product);

    }

    public static void task6() {
        // https://www.geeksforgeeks.org/java-current-date-time/
        Scanner scan = new Scanner(System.in);

        System.out.println("Твоя Фамилия: ");
        String surname = scan.next();

        System.out.println("Когда получил(а) задачи: ");
        String downDateTasks = scan.next();

        System.out.println("Когда сдавал(а) задачи: ");
        String dateHandTasks = scan.next();

        System.out.println("Answer: ");
        System.out.println(surname);
        System.out.println(downDateTasks);
        System.out.println(dateHandTasks);

        scan.close();
    }

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
    }
}
