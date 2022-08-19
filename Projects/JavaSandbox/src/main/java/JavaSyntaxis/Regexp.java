package JavaSyntaxis;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Regexp {
    public static void main(String[] args) {
        /*
        regexlib.com - вся инфа об этой хуйне
            \\d - одна цифра
            \\w - одна английская буква
            \\w = [a-zA-Z]
            + - один или более
            * - ноль или более
            ? - символ, который идет до него может существовать, а может и не существовать.
            (| | |) - Когда нужно описать множественные условия
            [abc] = (a|b|c)
            [a-zA-Z] - описание всех букв в английском алфавите.
            [^a-c] - ^ означает отрицание, то, что идет после него не должно быть в составе строки
            . - Любой символ

            Фигурные скобки означают точное кол-во предыдущих символов
            {1}
            {1, }
            {1, 2}

            .split("") - получение строки в виде массива.
            Разделять можно по разным регулярным выражениям
            .split(".") и т.д.
            .replace("this","to this") - можно в оригинальной строке заменить что-то на другое
         */

        String a = "2d";
        System.out.println(a.matches("\\dd")); // true

        a = "2222d";
        System.out.println(a.matches("\\d+d")); // true

        a = "d";
        System.out.println(a.matches("\\d*d")); // true

        a = "-23432";
        System.out.println(a.matches("-?\\d*")); // true
        a = "23432";
        System.out.println(a.matches("-?\\d*")); // true

        a = "+23432";
        System.out.println(a.matches("([-+2])?\\d*")); // true

        a = "A23432";
        System.out.println(a.matches("[a-cA-C]\\d*")); // true
        a = "H23432";
        System.out.println(a.matches("[a-cA-C]\\d*")); // false
        a = "c123432";
        System.out.println(a.matches("[a-c0-12]\\d*")); // true

        a = "1234 567 89 10";
        System.out.println(a.matches("[^5-7]*")); // false
        a = "1234 89 10";
        System.out.println(a.matches("[^5-7]*")); // true

        a = "http://www.google.com";
        System.out.println(a.matches("http://www\\..+\\.(com|ru)")); // true
        a = "http://www.google.ru";
        System.out.println(a.matches("http://www\\..+\\.(com|ru)")); // true
        a = "http://www.google.sdf";
        System.out.println(a.matches("http://www\\..+\\.(com|ru)")); // false

        a = "a";
        System.out.println(a.matches("[a-z]{4}")); // false
        a = "aaaa";
        System.out.println(a.matches("[a-z]{4}")); // true

        a = "Oh, Hello there";
        List<String> aString = new LinkedList<>();
        aString = Arrays.asList(a.split(" ")); // разделяется по пробелы
        System.out.println(aString);

        a = "What1 a2 fuck3 is4 that5?";
        aString = Arrays.asList(a.split("\\d")); // разделяется по любой цифре
        System.out.println(aString);

        a = "What1 a2 fuck3 is4 that5?";
        String newString = a.replaceAll("\\d+", ""); // What a fuck is that? теперь без цифр.
        System.out.println(newString);
    }
}
