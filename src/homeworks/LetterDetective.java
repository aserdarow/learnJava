package homeworks;

import java.util.Scanner;

public class LetterDetective {
    private final String engVowels = "AEIOUY";
    private final String ruVowels = "АЕЁИОУЫЭЮЯ";

    private static char getUserLetter(String alphabetMsg) {
        System.out.println("Введите букву " + alphabetMsg + ": ");

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        return text.toUpperCase().charAt(0);
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
        scan.close();


        if (num == 1) {
            char letter = getUserLetter("латинкого алфавита");

//        boolean letter = new Boolean();
//        if (letter)
        }
    }
}
