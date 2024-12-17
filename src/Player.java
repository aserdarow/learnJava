// Класс, сущность
public class Player {
    // атрибут, поле, свойство
    int age;
    private int score;

    // метод
    public int get_score() {
        return score;
    }

    public static void sayHello(String name) {
        System.out.printf("Привет, %s", name);
    }

    // Точка входа
    public static void main(String[] args) {

        // Объекты, экземпляры
        Player vasya = new Player();
        Player petya = new Player();
        Player tolya = new Player();

        System.out.println(vasya.age);
        System.out.println(petya.age);
        System.out.println(tolya.age);

        System.out.println(vasya.get_score());
        System.out.println(petya.get_score());
        System.out.println(tolya.get_score());

        Player.sayHello("Вася");
    }
}
