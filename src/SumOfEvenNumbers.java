/*
Napisz program, który oblicza sumę liczb parzystych z zakresu od 1 do 100 i wyświetla wynik.
 */

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Suma liczb parzystych: " + sum);
    }
}
