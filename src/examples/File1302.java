package examples;

public class File1302 {
    String name = "Ivan";
//    private final String name = "Ivan";

    // default package
    int someMethod() {
        return -1;
    }

    // public
    public int someMethod2() {
        return -1;
    }

    // protected
    protected int someMethod3() {
        return -1;
    }

    // private
    private int someMethod4() {
        return -1;
    }

    public static void main(String[] args) {
        File1302 obj1 = new File1302();

        System.out.println(obj1.name);
        obj1.name = "Vasya";
        System.out.println(obj1.name);
        System.err.println("\nПроизошла какая-то ошибка");

    }
}

abstract class Animal {
    abstract void makeSound();

    abstract void eat();
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("The dog barks");
    }

    void eat() {
        System.out.println("The dog eating");
    }
}
