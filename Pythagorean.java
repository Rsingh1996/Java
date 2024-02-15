import java.util.Scanner;

public class Pythagorean {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        Integer number1 = input.nextInt();
        Integer number2 = input.nextInt();
        Integer number3 = input.nextInt();
        System.out.println("Pythagorean triplet : " + PythagoreanTriplet(number1, number2, number3));

    }

    public static boolean PythagoreanTriplet(int number1, int number2, int number3) {

        if (number1 > number2 && number1 > number3) {
            if (number1 * number1 == number2 * number2 + number3 * number3)
                return true;
            else
                return false;
        } else if (number2 > number1 && number2 > number3) {
            if (number2 * number2 == number1 * number1 + number3 * number3)
                return true;
            else
                return false;
        } else {
            if (number3 * number3 == number2 * number2 + number1 * number1)
                return true;
            else
                return false;
        }
    }
}