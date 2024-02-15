import java.util.Scanner;

public class LCM {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        Integer firstNumber = input.nextInt();
        Integer secondNumber = input.nextInt();
        LCMAndHCFOfTwoNumber(firstNumber, secondNumber);

    }

    public static void LCMAndHCFOfTwoNumber(int num1, int num2) {
        int reminder = 0;
        int n1 = num1;
        int n2 = num2;
        int lcm, gcd = 0;
        if (n1 < 1 || n2 < 1)
            System.out.println("Invalid Number, Please Enter valid number");
        else {
            while (num1 % num2 != 0) {
                reminder = num1 % num2;
                num1 = num2;
                num2 = reminder;
            }
            gcd = num2;
            lcm = (n1 * n2) / gcd;
            System.out.println("GCD : " + gcd);
            System.out.println("LCM : " + lcm);
        }
    }
}
