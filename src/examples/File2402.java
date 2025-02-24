package examples;

public class File2402 {

    // Цикл с предусловием
    static void exampleOne() {
        int num = 10;
        int sum = 0;

        int i = 1;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    static void exampleTwo() {
        int num = 10;
        int production = 1;

        int i = 1;
        while (i <= num) {
            production *= i;
            i++;
        }
        System.out.println(production);
    }

    static void exampleThree() {
        int num = 5;
        int i = 0;

        if (i < num) {
            System.out.println("Что-то");
        }

    }

    // Цикл с постусловием
    static void exampleFour() {
        int num = 10;
        int production = 1;

        int i = 1;
        do {
            production *= i;
            i++;
        }
        while (i <= num);
        System.out.println(production);
    }

    // Цикл с параметром — for
    static void exampleFive() {
        int num = 10;
        int production = 1;

        for (int i = 1; i <= num; i++) {
            production *= i;
        }

        System.out.println(production);
    }

    // Цикл полного перебора, упрощающий доступ к массивам и коллекциям
    static void exampleSix() {
        int[] arr = {1, 3, 5, 7, 9};

        for (int elem : arr) {
            System.out.printf("Элемент массива: %d ", elem);
        }
    }

    static void exampleSeven() {
        String[] names = {"Ivan", "Petya", "Vasya", "Alice", "Tolya"};

        for (String name : names) {
            System.out.printf("Элемент массива: %s ", name);
        }
    }

    static void exampleEight() {
        String[] names = {"Ivan", "Petya", "Vasya", "Alice", "Tolya"};

//        System.out.printf("Элемент массива: %s ", names[0]);
//        System.out.printf("Элемент массива: %s ", names[1]);
//        System.out.printf("Элемент массива: %s ", names[2]);

        for (int i = 0; i < names.length; i++) {
            System.out.printf("Элемент массива: %s ", names[i]);
        }
    }


    public static void main(String[] args) {

        exampleOne();
        exampleTwo();
    }

}
