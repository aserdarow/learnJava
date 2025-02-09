package examples;

public class WrapperClass {
    public static void main(String[] args) {
        String s = "abc";
        String s2 = new String("abc");

        s2.trim().substring(0, 1).toUpperCase();

        int n = 10;

//        int n2 = (int)("120");   // Error
        int n2 = Integer.parseInt("120");
        String s3 = Integer.toString(n);

        int max = Integer.MAX_VALUE;

        Integer someNum = Integer.parseInt("1342334");
        long someNum2 = Long.parseLong("134233452346256");
        System.out.println(someNum);

        char a = 'a';

        Character a2 = 'a';
        System.out.println(a2.equals('b'));

        boolean t = Boolean.TRUE;
        boolean f = Boolean.FALSE;

        boolean someCondition = 6 > 4 && 5 < 7;
        System.out.println(someCondition);

        System.out.println(Boolean.logicalAnd(6 > 4, 5 < 7));

        System.out.println(Integer.valueOf("42", 8));

//        byte, short, int, long, double, float    boolean,    char
    }
}
