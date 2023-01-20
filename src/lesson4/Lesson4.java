package lesson4;

import java.util.Locale;

public class Lesson4 {
    public static void main(String[] args) {
        String str ="Hello, World";
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        int length = str.length();
        int lastIndex = length - 1;
        System.out.println(str.charAt(lastIndex));


    }
}
