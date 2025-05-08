package examples;

public class ClassicPhone implements IDevice {
    private int num = 10;

    public void keyboards() {
    }

    public static void main(String[] args) {
        ClassicPhone phone = new ClassicPhone();
        ClassicPhone phone2 = new ClassicPhone();
        ClassicPhone phone3 = new ClassicPhone();

        System.out.println(phone.num);
        System.out.println(phone2.num);
        System.out.println(phone3.num);

        phone2.keyboards();
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }
}

// экземпляр = объект
// атрибут = свойство = поле
// метод = поведение
