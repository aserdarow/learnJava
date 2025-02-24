package examples;

public class RandomNumberGenerator {
    // до m
    static int randInt(int end) {
        return (int) (Math.random() * end + 1);
    }

    // от n до m
    static int randint(int start, int end) {
        // (преобразовать) (случайное_число * (конец - начало) + начало)
        return (int) (Math.random() * (end - start) + start);

    }

    public static void main(String[] args) {
        System.out.println(randInt(2));
        System.out.println(randint(5, 9));
    }
}
