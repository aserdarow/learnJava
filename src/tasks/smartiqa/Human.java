package tasks.smartiqa;

public class Human {
    // Статические поля (атрибуты, свойства) класса
    private static String defaultName = "Unknown";
    private static int defaultAge = 0;

    // Динамическиее поля (атрибуты, свойства) объекта
    public String name;
    public int age;
    private double money;
    private House house;

    public Human(String name, int age) {
//        if (name != null) {
//            this.name = name;
//        }
//        else {
//            this.name = defaultName;
//        }
        this.name = (name != null) ? name : defaultName;
        this.age = (age > 0) ? age : defaultAge;
        this.money = 0.0;
        this.house = null;

    }

    public Human() {
        this(defaultName, defaultAge);  // ключевое слово this
    }

    public void info() {
        System.out.printf(
                "Имя: %s%nВозраст: %d лет%nБаланс: %.2f%nДом: %s%n%n",
                name, age, money, house
        );
    }

    public static void defaultInfo() {
        System.out.printf(
                "Имя по умолчанию: %s%nВозраст по умолчанию: %d лет%n",
                defaultName, defaultAge
        );
    }

    private void makeDeal(House currHouse, double price) {
        this.money -= price;  // уменьшать количество денег на счету
        this.house = currHouse;  // ссылка на только что купленный дом
    }

    public void earnMoney(double moneyValue) {
        if (moneyValue < 0) {
            System.out.println("[ИНФО] Укажите положительное число");
        } else {
            this.money += moneyValue;
        }

    }

    public static void main(String[] args) {
        Human vasya = new Human("Вася", 22);
        Human petya = new Human("Петя", 18);
        Human unknown1 = new Human();

        vasya.info();
        vasya.earnMoney(599);

        petya.info();
        petya.earnMoney(-299);

        vasya.info();
        petya.info();
        unknown1.info();

        Human.defaultInfo();

    }

}
