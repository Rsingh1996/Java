import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Fabonacci {
    public static void main(String arr[]) {
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        Integer k = input.nextInt();
        int count = lengthOfNumber(number);
        // System.out.println("Digit count: " + count);
        // numberOfDigits(number,count);
        // reverseOfNumber(number);
        // inverseOfNumberStartingFronBeginning(number,count);
        // inverseOfNumberStartingFronEnd(number,count);
        rotationOfNumberOptimized(number, count, k);
    }

    public static int lengthOfNumber(int num) {

        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    public static void numberOfDigits(int num, int count) {

        while (count > 0) {

            int power = (int) Math.pow(10, count - 1);
            System.out.println(num / power);
            num = (num % power);
            count--;
        }
    }

    public static void reverseOfNumber(int num) {

        System.out.print("Reverse of Number: ");
        while (num != 0) {
            System.out.print(num % 10);
            num = (num / 10);
        }
        System.out.println();
    }

    public static void inverseOfNumberStartingFronEnd(int num, int count) {
        int digit, sum = 0;

        for (int i = 1; i <= count; i++) {
            digit = num % 10;
            num = (num / 10);
            int power = (int) Math.pow(10, digit - 1);
            sum = sum + (i * power);
        }
        System.out.print("Inverse of Number: ");
        System.out.print(sum);
    }

    public static void inverseOfNumberStartingFronBeginning(int num, int count) {
        int digit, sum = 0;

        for (int i = 1; i <= count; i++) {
            int power1 = (int) Math.pow(10, count - i);
            digit = num / power1;
            num = (num % power1);
            int power2 = (int) Math.pow(10, (digit - count) * -1);
            sum = sum + (i * power2);
        }
        System.out.print("Inverse of Number: ");
        System.out.print(sum);
    }

    public static void rotationOfNumber(int num, int count, int k) {
        int result = 0;
        int power = (int) Math.pow(10, k);
        result = (num % power);
        System.out.println(result);
        num = num / power;
        System.out.println(num);

    }

    public static void rotationOfNumberOptimized(int num, int count, int k) {
        int result, multiplier, power = 0;
        if (k < 0) {
            k = k % count;
            power = (int) Math.pow(10, count + k);
            multiplier = (int) Math.pow(10, (k * -1));
        } else {
            k = Math.abs(count - k);
            power = (int) Math.pow(10, k);
            multiplier = (int) Math.pow(10, count - k);
        }

        result = (num % power) * multiplier;
        num = num / power;
        System.out.println(result + num);
    }
}
