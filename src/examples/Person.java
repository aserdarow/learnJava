package examples;


public class Person implements IPerson {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstN, String lastN, int age) {
        this.firstName = firstN;
        this.lastName = lastN;
        this.age = age;

    }

    @Override
    public void info() {
        System.out.printf("Hello it's %s%n", this.firstName);
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String fullName() {
        return this.firstName + " " + this.lastName;
    }

    public void hobbies(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.printf("Моё хобби %d%n", i);

        }
    }

    public boolean isEmployee() {
        return false;
    }


    public static void main(String[] args) {
        Person vasya = new Person("Вася", "Васильев", 24);
        Person petya = new Person("Петя", "Петров", 25);
        System.out.println(vasya.fullName());
        System.out.println(vasya.getAge());
        System.out.println(petya.fullName());
        petya.info();
        vasya.hobbies(2);
        System.out.println(vasya.isEmployee());
    }

}
