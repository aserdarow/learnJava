package examples;

public class Animals {
    public void voice() {
        System.out.println("Base Voice");
    }

    public boolean isWild() {
        return true;
    }

}

class Cat extends Animals {
    public void voice() {
        System.out.println("Мяу!");
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();

        cat1.voice();
    }

}
