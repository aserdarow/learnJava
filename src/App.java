public class App {
    public static void main(String[] args) {
        var king = "King Balon the 6th";

        // BEGIN (write your solution here)
        var newKing = 6;
        var newLockRoom = 17;
        System.out.println(king + " has " + (newKing * newLockRoom) + " rooms.");

        // END
    }
}

/*
src/main/java/io/hexlet/App.java
Вы столкнулись с таким кодом, который выводит на экран общее количество комнат во владении нынешнего короля:
var king = "King Balon the 6th";
System.out.println(king + " has " + (6 * 17) + " rooms.");
Как видите, это магические числа: непонятно, что такое 6 и что такое 17. Можно догадаться, если знать историю королевской семьи: каждый новый король получает в наследство все замки от предков и строит новый замок — точную копию родительского замка из 17 комнат
Эта странная династия просто плодит одинаковые замки…
Избавьтесь от магических чисел, создав новые переменные, а затем выведите текст на экран.
Получится так:
King Balon the 6th has 102 rooms.
Названия переменных должны передавать смысл чисел, но должны при этом оставаться достаточно короткими и ёмкими для комфортного чтения.
Помните: код будет работать с любыми названиями, а наша система всегда проверяет только результат на экране, поэтому выполнение этого задания — под вашу ответственность.
 */