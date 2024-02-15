import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t1 = input.nextInt();
        int t2 = input.nextInt();
        int t3 = input.nextInt();

        // int x = input.nextInt();
        // descreasingNumber(n);
        // increasingNumber(n);
        // increasingDescreasingNumber(n);
        // int fact = factorial(n);
        // System.out.println(fact);
        // int powerLinear = powerOfNumberLinear(n, x);
        // System.out.println(powerLinear);
        // int powerLogarithmic = powerOfNumberLogarithmic(n, x);
        // System.out.println(powerLogarithmic);
        // printZigZag(n);
        towerOfHanoi(n, t1, t2, t3);

    }

    private static void descreasingNumber(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        descreasingNumber(n - 1);

    }

    private static void increasingNumber(int n) {
        if (n == 0)
            return;
        increasingNumber(n - 1);
        System.out.println(n);
    }

    public static void increasingDescreasingNumber(int n) {

        if (n == 0)
            return;
        System.out.println(n);
        increasingDescreasingNumber(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {

        if (n == 1)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static int powerOfNumberLinear(int n, int x) {
        if (x == 0)
            return 1;
        else
            return (n * powerOfNumberLinear(n, x - 1));
    }

    public static int powerOfNumberLogarithmic(int n, int x) {
        if (x == 0)
            return 1;
        int npxb2 = powerOfNumberLogarithmic(n, x / 2);
        int npx = npxb2 * npxb2;
        if (x % 2 != 0)
            npx = npx * n;
        return npx;
    }

    public static void printZigZag(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");
        printZigZag(n - 1);
        System.out.print(n + " ");

    }

    public static void towerOfHanoi(int n, int t1, int t2, int t3) {
        if (n == 0)
            return;
        towerOfHanoi(n - 1, t1, t3, t2);
        System.out.println(n + " [ " + t1 + " -> " + t2 + " ]");
        towerOfHanoi(n - 1, t3, t2, t1);

    }
    
}
