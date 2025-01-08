package examples;


public class ConvertTypes {

    public static int toInt(short value) {
        return (int) value;
    }

    /**
     * Преобразует символьный тип в целое число.
     *
     * @param value Символьное значение.
     * @return Целое число.
     */
    public static int toInt(char value) {
        return (int) value;
    }

    public static void main(String[] args) {

        byte a = 5;
        short b = (short) a;

        char someChar = 'A';

        int charNum = toInt(someChar);
        System.out.println(charNum);

        int count = 1;

        // Инкремент
        System.out.println(count++);
        System.out.println(++count);

        // Декремент
        System.out.println(count--);
        System.out.println(--count);

    }

}
