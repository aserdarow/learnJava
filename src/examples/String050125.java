package examples;

import java.util.concurrent.TimeUnit;

class String050125 {
    private int age = 18;

    public static void countdown() throws InterruptedException {
        System.out.print("sfdglsdkjfghaksdgaskdgksdg\r");
        for (int i = 10; i > 0; i--) {
            System.out.printf("\r%d", i);
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("\rGo!...");
    }

    public static void whatIsMethodPrintF() {
        String name = "Ахмет";
        int age = 18;
        double number = 1.2435;

        System.out.printf("Привет, меня зовут %s. Мне %d лет. %.2f", name, age, number);
    }

    public static void whatIsMethodPrintLn() {
        System.out.println("Привет, меня зовут Ахмет. Мне 18 лет. 1.24");
    }

    public static void whatIsMethodPrint() {
        System.out.print("Привет, меня зовут Ахмет. Мне 18 лет. 1.24");
    }

    public static void main(String[] args) throws InterruptedException {
        countdown();
        whatIsMethodPrintF();
        whatIsMethodPrintLn();
        whatIsMethodPrint();
    }
}
