package examples;

public class BitwiseOperators {
    // b - binary - двоичное  01
    // o - octal - восмиричное  01234567
    // d - decimal - десятичное  0123456789
    // x - hexdecimal - шестнадцатиричное  0123456789ABCDEF

    public static void operatorAnd() {

//        int a = 11;  // 001011;
        byte a = 0b1011;  // 11;
        byte b = 0b100010;  // 34;

//        System.out.println(a);
//        System.out.println(b);

        int result = a & b;
        System.out.println(result);  // 0
    }

    public static void operatorOr() {
        byte a = 0b001011;  // 11;
        byte b = 0b100010;  // 34;

        int result = a | b;
        System.out.println(result);  // 43
    }

    public static void operatorXor() {
        byte a = 0b001011;  // 11;
        byte b = 0b100010;  // 34;

        int result = a ^ b;
        System.out.println(result);  // 41
    }

    public static void operatorNot() {
        byte a = 0b1011;  // 11

        int result = ~a;
        System.out.println(result);  // 41

    }

    public static void shiftLeft() {
        byte a = 0b1011;  // 22

        int result = a << 1;
        System.out.println(result);
    }

    public static void shiftRight() {
        byte a = 0b01011;  // 5

        int result = a >> 1;
        System.out.println(result);
    }

    public static void main(String[] args) {
        operatorAnd();
        operatorOr();
        operatorXor();
        operatorNot();
        shiftLeft();
        shiftRight();
    }
}
