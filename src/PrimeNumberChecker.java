/*
Napisz program, który sprawdza, czy podana liczba jest liczbą pierwszą.
Liczba pierwsza to liczba naturalna większa od 1, która ma dokładnie dwa dzielniki: 1 i samą siebie.
 */

public class PrimeNumberChecker {
    public static void main(String[] args) {
        int number = 17;
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false; // Liczby mniejsze lub równe 1 nie są liczbami pierwszymi
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false; // Jeśli liczba jest podzielna przez i, to nie jest liczbą pierwszą
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " jest liczbą pierwszą.");
        } else {
            System.out.println(number + " nie jest liczbą pierwszą.");
        }
    }
}
