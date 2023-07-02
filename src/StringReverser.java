/*
Napisz program, który odwraca podany ciąg znaków. Na przykład, dla ciągu "Hello, World!"
program powinien zwrócić "!dlroW ,olleH".
 */
public class StringReverser {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);

        System.out.println("Normalny ciag znakow: " + input);
        System.out.println("Odwrocony ciag znakow: " + reversed);
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}
