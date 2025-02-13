package homeworks;

import java.util.Scanner;

public class LetterDetective {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать в программу \"Буква - Детектива\"!");
        System.out.println("Выберите алфавит: \n1.Латинский.\n2.Кириллица.");
        System.out.println("Введите номер алфавита: ");
        int num = scan.nextInt();
        if (num > 2) {
            System.out.println("\"Упс! Выбран неверный режим.\n" +
                    "Попробуйте ещё раз...\"");
        }
        if (num == 1) {
            System.out.println("Введите букву " + num + " языка(\"Буĸва должна быть в верхнем регистре\"): ");

//        boolean letter = new Boolean();
//        if (letter)
            scan.close();
        }
    }
