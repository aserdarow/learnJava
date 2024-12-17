public class Main {

    public static void helloWorld() {
        System.out.println("Hello World!");
    }

    public static void printEvenNumbers(int endRange) {
        for (int i = 2; i <= endRange; i += 2) {
            System.out.println("i = " + i);
        }
    }

    public static void main(String[] args) {
        helloWorld();
        printEvenNumbers(12);
    }
}
