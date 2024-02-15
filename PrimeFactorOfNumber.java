import java.util.Scanner;

public class PrimeFactorOfNumber {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        int i = 2;
        while (number >= i) {
            if (number % i != 0) {
                i++;
            } else {
                number = number / i;
                System.out.println(i);
            }
            System.out.println("*" + i);
        }
    }
}
