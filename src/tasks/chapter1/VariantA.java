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

    public static void task2(){
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

    public static void task3(){
        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter number of count: ");
        int numOfCount = scan.nextInt();

        int[] numbers = new int[numOfCount];

        for (int i = 0; i < numOfCount; i++) {
            System.out.println("Enter your number: ");
            int num = scan.nextInt();
            numbers[i] = num;
        }

        System.out.println("Answer: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }

    public static void task4(){
        String password = "ahmet";
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your password");
        String userPassword = scan.next();

//        boolean result = password == userPassword;
        boolean result = password.equals(userPassword);
        System.out.println("Amwer: " + result);
        scan.close();

    }



    public static void task5(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your of count: ");
        int numYourCount = scan.nextInt();

        int[] number = new int[numYourCount];

        for (int i = 0; i < numYourCount; i++) {
            System.out.println("Enter your number: ");
            int num = scan.nextInt();
            number[i] = num;
        }

        int sum = 0;
        int product = 1;

        for (int i = 0; i < numYourCount; i++) {
            sum += number[i];
            product *= number[i];
        }

        System.out.println("Answer: ");
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);

        scan.close();

    }
    // polucaem cislo kak v 3task zapisyvat massiw zatem nado passitat summy i umnazeniya(proyezvideniya)
    // v itogy dolzjno byt summa i proizvedeniye vseh cisel



    public static void task6(){
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
    // polucit 3 straky 1familiya 2data polucennennoga zadaniya 3data zdaci zadaniya



    public static void main(String[] args) {
       // task1();
//        task2();
//        task3();
//        task4();
        task5();
//        task6();

    }
}
