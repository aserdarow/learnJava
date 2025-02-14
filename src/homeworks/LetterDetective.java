package homeworks;

import java.util.Scanner;

public class LetterDetective {

    private static char getUserLetter(String alphabetMsg) {
        System.out.println("Введите букву " + alphabetMsg + ": ");

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        return text.charAt(0);
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
        }

        final String engVowels = "AEIOUY";
        final String ruVowels = "АЕЁИОУЫЭЮЯ";


        char letter;
        if (num == 1) {
            letter = getUserLetter("латинского алфавита");
            if (engVowels.indexOf(letter) != -1) {
                System.out.println(letter + " - гласная буква!");
            } else if ((letter >= 'A' && letter <= 'Z')) {
                System.out.println(letter + " - согласная буква!");
            } else {
                System.out.println("Упс! Неизвестная буква. Попробуйте другую!");
            }
        } else if (num == 2) {
            letter = getUserLetter("кириллицы");
            if (ruVowels.indexOf(letter) != -1) {
                System.out.println(letter + " - гласная буква!");
            } else if ((letter >= 'А' && letter <= 'Я')) {
                System.out.println(letter + " - согласная буква!");
            } else {
                System.out.println("Упс! Неизвестная буква. Попробуйте другую!");
            }
        }

    }
}
