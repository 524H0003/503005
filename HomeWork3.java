import java.util.*;

public class HomeWork3 {
    private static int numberOfWords(String input) {
        return input.split(" ").length;
    }

    private static String getFirstName(String input) {
        String[] subStrings = input.split(" ");

        return subStrings[subStrings.length - 1];
    }

    private static String getLastName(String input) {
        String[] subStrings = input.split(" ");

        return subStrings[0];
    }

    private static String getMiddleName(String input) {
        String[] subStrings = input.split(" ");
        String[] middleName = Arrays.copyOfRange(subStrings, 1, subStrings.length - 1);
        String output = new String("");

        for (String i : middleName) {
            output += i + " ";
        }

        return output;
    }

    private static String correntFormat(String input) {
        String[] subStrings = input.split(" ");
        String output = new String("");

        for (String i : subStrings) {
            output += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }

        return output;
    }

    private static String correntFormat1(String input) {
        String[] subStrings = input.split(" +");
        String output = new String("");

        for (String i : subStrings) {
            if (i.length() == 0) continue;
            output += i.substring(0, 1).toUpperCase() + i.substring(1) + " ";
        }

        return output;
    }

    public static void print(String input) {
        System.out.println(input);
    }

    public static void print(int input) {
        System.out.println(input);
    }

    public static void main(String[] args) {
        String input = new String("         Nguyen    tran Minh tuan  ");

        print(numberOfWords(input));
        print(getFirstName(input));
        print(getLastName(input));
        print(getMiddleName(input));
        print(correntFormat(input));
        print(correntFormat1(input));
    }
}