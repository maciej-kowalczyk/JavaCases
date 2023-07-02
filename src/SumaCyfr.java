/*
Napisz program, który oblicza sumę cyfr w podanej liczbie całkowitej. Na przykład,
dla liczby 12345 suma cyfr wynosi 1 + 2 + 3 + 4 + 5 = 15
 */
public class SumaCyfr {
    public static void main(String[] args) {
        int liczba = 12345;
        int sumaCyfr = obliczSumeCyfr(liczba);
        System.out.println("Suma cyfr w liczbie " + liczba + " wynosi " + sumaCyfr);
    }

    public static int obliczSumeCyfr(int liczba) {
        int suma = 0;

        while (liczba != 0) {
            int cyfra = liczba % 10;
            suma += cyfra;
            liczba /= 10;
        }

        return suma;
    }
}
