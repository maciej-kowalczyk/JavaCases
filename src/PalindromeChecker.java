/*
Napisz program, który sprawdza, czy podane słowo jest palindromem. Palindrom to słowo,
które czyta się tak samo od przodu i od tyłu. Przykłady palindromów to "kajak", "anna", "radar".
 */

public class PalindromeChecker {
    public static void main(String[] args) {
        String word = "kajak";
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Podane słowo jest palindromem.");
        } else {
            System.out.println("Podane słowo nie jest palindromem.");
        }
    }
}
