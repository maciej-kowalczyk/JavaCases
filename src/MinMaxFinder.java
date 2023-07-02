/*
Napisz program, który znajduje największą i najmniejszą liczbę w podanej tablicy liczb całkowitych.
 */
public class MinMaxFinder {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 1, 9, 4, 7 };
        int minimum = findMinimum(numbers);
        int maximum = findMaximum(numbers);

        System.out.println("Najmniejsza liczba: " + minimum);
        System.out.println("Największa liczba: " + maximum);
    }

    public static int findMinimum(int[] numbers) {
        int minimum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }

        return minimum;
    }

    public static int findMaximum(int[] numbers) {
        int maximum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
        }

        return maximum;
    }
}
