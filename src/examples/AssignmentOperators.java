package examples;

public class AssignmentOperators {
    public static void main(String[] args) {
        int num = 10;

        num++;
        num--;

        // Операторы присваивания
        num += 15;
        num -= 10;
        num *= 2;
        num /= 4;
        num %= 5;

        int result = 2 - 3;

//        2 + 3 * 4 = 14

    }
}

// Побитовые операторы

// 14 -> 1110
//  9 -> 1001

// 1110
// |
// 1001
// 1111


// 1110
// &
// 1001
// 1000

// 1110
// ^
// 1001
// 0111

//1001
//~
//1010

// ~9 = -10 --->  ~9 = -(9 + 1)

// 1110
// >> 1
// 0111

// 11100
// << 1
// 0111
