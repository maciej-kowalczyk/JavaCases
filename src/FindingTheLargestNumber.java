/*
Napisz program, który znajduje największą liczbę spośród trzech podanych liczb.
*/

public class FindingTheLargestNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 12;

        int max = a; // Zakładamy, że a jest początkowo największe

        if (b > max) {
            max = b; // Jeśli b jest większe od obecnego max, aktualizujemy max na b
        }

        if (c > max) {
            max = c; // Jeśli c jest większe od obecnego max, aktualizujemy max na c
        }

        System.out.println("Największa liczba to: " + max);
    }
}
