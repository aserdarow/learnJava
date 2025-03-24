package examples;

public class File1703 {

    // Вопросы к главе 2
    // Вопрос 1: byte, short, int long, float, double boolean и char.
    // Вопрос 2: В Java аргументы примитивных типов передаются в методы по значению.
    // Вопрос 3: Размер примитивных типов в Java зависит от типа данных:
    //byte — 1 байт; 12
    //short — 2 байта; 1
    //int — 4 байта; 1
    //long — 8 байтов; 1
    //float — 4 байта; 1
    //double — 8 байтов; 1
    //boolean — 1 бит; 1
    //char — 2 байта. 1
    // Вопрос 4: Явное приведение - (тип) (значение, которое нужно преобразовать)
    // Вопрос 5: Неявное приведение - (автоматическое) происходит, когда в процессе преобразования
    // не могут потеряться какие-либо данные. Например, когда преобразование производится к
    // более универсальному типу: от коротких целых short к длинным целым long. Пример:
    //  static someMethod(long x) {// body}
    //  static void main(String[] args) {
    //  int a = 1567;
    //  someMethod(a)
    //  }
    // Вопросы 6 - 7: Литералы в Java-программе — это явно заданные значения в коде программы,
    // константы определённого типа. Они находятся в коде в момент запуска.
    //Литералы могут быть разных типов, которые определяются их назначением и способом написания:
    // Числовые. Целочисленные, с плавающей точкой.
    // Строковые. Набор символов, заключённых в двойные кавычки.
    // Символьные. Представлены кодовой таблицей Unicode, то есть каждый символ — 16-битовое значение.
    // Логические. Представляют два значения: true или false.
    // Null. Специальный литерал, который обозначает отсутствие значения или ссылку на пустой объект.
    // Использование литералов упрощает написание кода, так как они обеспечивают простой подход
    // к выражению постоянных значений.

    // Вопрос 8: Некоторые правила работы с типами при вычислении выражений:
    // Типы всех значений byte, short, char повышаются до типа int.
    //  Если один операнд имеет тип long, то тип всего выражения повышается до long.
    //  Если один операнд имеет тип float, то тип всего выражения повышается до float.
    //  Если один операнд имеет тип double, то тип всего выражения повышается до double.
    //  Если в арифметической операции задействованы аргументы разных типов, то перед
    //  выполнением операции все аргументы автоматически приводятся к более универсальному
    //  из задействованных типов. Пример:

    // long resultOne = 343265636435377 + 356877;
    // int resultTwo = 11 / 5;  Integer
    // double resultTwo = 11 / 5.0;  Double
    // System.out.println((11 / 5.0));  Double
    // System.out.println((5.5 * 3));  Double

    // Вопрос 9:
    //  int n = (int) 4535;  это будет работает.
    //  int n = (int) "4535";  это не будет работает, нужен класс Integer
    //  int n = Integer.parseInt("4535");  это будет работает.
    //  int n = Integer.max(5, 10);


    // Вопрос 10:
    // String s = "Petya";
    // someMethod(s)
    // Array fruits = {"apple", "banana", "kiwi"};
    // someMethodTwo(fruits)
    // Разница между примитивными и ссылочными типами данных заключается в том, что
    // примитивные хранят значения напрямую, а ссылочные содержат ссылки на данные,
    // которые хранятся в памяти.

    // Вопрос 11:
    // !cond1 && cond2 || cond3
    // !(cond1 && cond2) || cond3
    // ^ | &
    // Вопрос 12:
    //        System.out.println(10 / Integer.MAX_VALUE);
    //        System.out.println(Integer.MIN_VALUE / Integer.MAX_VALUE);
    //        System.out.println(Integer.MAX_VALUE / Integer.MIN_VALUE);
    //        System.out.println(Integer.MIN_VALUE / Integer.MIN_VALUE);
    // Вопрос 13
    // Boolean f = false;  // Unboxing
    // boolean f2 = Boolean.FALSE;  // Autoboxing
    // Boolean t = Boolean.TRUE;  // обычный пример
    // Вопрос 14: int a = 10;  String s = "dsfsdf";
    // var b; --> позже в коде можно указать любой тип.

    // Вопрос 15:
    static void exampleForEachLoop() {
        int[] nums = {10, 20, 30, 540,};

        for (int x : nums) {
            System.out.printf("С использованием for-each %d%n", x);
        }
    }

    // Вопрос 16:

    static void exampleInstanceOf() {
        Integer x = 1000;
        String s = "Abcd";

        System.out.println(x instanceof Integer);  // true
        System.out.println(s instanceof String);  // true
        System.out.println(null instanceof String);  // false
    }

    // Вопрос 17:
    // Массив - это структура данных, хранящая упорядоченный
    // набор однотипных элементов.

    // Вопрос 18:
    // Примитивные типы хранят свои значения непосредственно в памяти,
    // а ссылочные типы - хранят адреса объектов, на которые они ссылаются.
    static void question18() {
        int[] nums = new int[20];
        String[] names = new String[15];

        int[] numsTwo = {5, 65, 7, 23, 43};
        String[] namesTwo = {"Alice", "Bob", "John"};

        String[][] alphabet2D = {
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"},
                {"J", "K", "L"},
        };
        alphabet2D[2][2].toUpperCase();

        int[][] arr2DTwo = new int[10][6];
        int[][] arr2D = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
        };

        arr2D[2][0] = 150000;

        System.out.println(arr2D[1][1]);  // 50
        System.out.println(arr2D[2][0]);  // 70
    }
    // Вопрос 19: Ответ на вопросы и примеры были выше в 18 вопросе.


    // Вопрос 20:
    // String[] namesTwo = {"Alice", "Bob", "John"};
    // namesTwo[1] --> "Bob";
    // namesTwo[6] --> java.lang.ArrayIndexOutOfBoundsException;
    static void question20() {
        String[] namesTwo = {"Alice", "Bob", "John"};
        System.out.println(namesTwo[1]); // "Bob"
        //  System.out.println(namesTwo[6]);  // --> java.lang.ArrayIndexOutOfBoundsException;

        // java.lang.ArrayStoreException.
        //  Object x[] = new String[3];
        //  x[0] = new Integer(0);

    }

    public static void main(String[] args) {
//        System.out.println((11 / 5.0));
//        System.out.println((5.5 * (3 + 2)));
//        System.out.println(10 / 10.0);
//        exampleInstanceOf();

        question20();
    }

}
