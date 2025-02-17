package homeworks;

import java.util.Scanner;

public class LetterDetective {
    private final String engVowels = "AEIOUY";
    private final String ruVowels = "АЕЁИОУЫЭЮЯ";

    private static char getUserLetter(String alphabetMsg) {
        System.out.println("Введите букву " + alphabetMsg + ": ");

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        return text.charAt(0);
    }

    private static String checkLetter(String vowels, char letter, char firstChar, char lastChar) {
        if (vowels.indexOf(letter) != -1) {
            return letter + " - гласная буква!";
        } else if ((letter >= firstChar && letter <= lastChar)) {
            return letter + " - согласная буква!";
        } else {
            return "Упс! Неизвестная буква. Попробуйте другую!";
        }

    }

    void gameLogic(int num) {
        char letter;
        if (num == 1) {
            letter = getUserLetter("латинского алфавита");
            System.out.println(checkLetter(engVowels, letter, 'A', 'Z'));
        } else if (num == 2) {
            letter = getUserLetter("кириллицы");
            System.out.println(checkLetter(ruVowels, letter, 'А', 'Я'));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Добро пожаловать в программу \"Буква - Детектива\"!");
        System.out.println("Выберите алфавит: \n1.Латинский.\n2.Кириллица.");
        System.out.println("Введите номер алфавита: ");
        int num = scan.nextInt();
//        if  (num < 1 || num > 2) {
        if (num != 1 && num != 2) {
            System.out.println(
                    "\"Упс! Выбран неверный режим.\n" +
                            "Попробуйте ещё раз...\""
            );
        } else {
            //        int number = 10;
//        String name = new String("Max");
            LetterDetective letObj = new LetterDetective();

            letObj.gameLogic(num);
        }
    }
}
