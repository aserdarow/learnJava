package examples;

public class ForLoop {

    public static void example1() {
        int numOfCount = 5;

        for (int i = 0; i < numOfCount; i++) {
            System.out.println("Hello " + i);
        }
    }

    public static void example2() {
        int numOfCount = 0;

        for (int i = 7; i > numOfCount; i--) {
            System.out.println("Hello " + i);
        }
    }

    public static void main(String[] args) {
        example1();
        example2();
    }

}
