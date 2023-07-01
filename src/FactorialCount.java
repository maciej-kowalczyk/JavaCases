/*
Napisz program, który oblicza silnię dla podanej liczby. Silnia liczby n (oznaczana jako n!)
to iloczyn wszystkich liczb naturalnych od 1 do n. Na przykład, 5! = 5 * 4 * 3 * 2 * 1 = 120.
*/


public class FactorialCount {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Silnia liczby " + number + " wynosi: " + factorial);
    }
}
