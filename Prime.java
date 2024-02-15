import java.util.Scanner;

public class Prime {
    public static void main(String arr[]) {

        Scanner input = new Scanner(System.in);
        Integer numberOfPrimeNumber = input.nextInt();
        int count = 0;
        for (int i = 2; i > 1; i++) {
            if (count == numberOfPrimeNumber || numberOfPrimeNumber <= 0)
                break;
            boolean isNumberPrime = isNumberPrimeOptimizedMore(Math.abs(i));
            if (isNumberPrime == true) {
                System.out.print(i + " ");
                count++;
            }
        }
    }

    public static boolean isNumberPrime(int num) {

        if (num == 0 || num == 1 || num == -1)
            return false;
        for (int j = 2; j < num; j++) {
            if (num % j == 0)
                return false;
        }
        return true;
    }

    public static boolean isNumberPrimeOptimized(int n) {

        if (n == 0 || n == 1 || n == -1)
            return false;
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }

    public static boolean isNumberPrimeOptimizedMore(int n) {

        if (n == 0 || n == 1 || n == -1)
            return false;
        for (int j = 2; j * j <= n; j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }
}