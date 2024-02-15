import java.util.Scanner;

public class Methods {

    public static void main(String[] arg) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int digit1 = input.nextInt();
        int digit2 = input.nextInt();
        // int digitFrequency = frequencyOfDigit(number, digit);
        // int deciToAnyBase = DecimalToAnyBase(number, digit);
        // int anyBaseToDeci = anyBaseToDecimal(number, digit1);
        // int anybaseToAnybase = anyBaseToAnyBase(number, digit1, digit2);
        // int anyBaseAdd = anyBaseAddition(number, digit1, digit2);
        // int abyBaseSub = anyBaseSubtraction(number, digit1, digit2);
        int anyBaseMul = anyBaseMultiplication(number, digit1, digit2);

        // display(digitFrequency);
        // display(convertedNun);
        // display(anyBaseToDeci);
        // display(anybaseToAnybase);
        display(anyBaseMul);

    }

    public static void display(int param) {
        System.out.println(param);

    }

    public static int frequencyOfDigit(int num, int digit) {
        int count = 0;

        while (num != 0) {
            int r = num % 10;
            num = num / 10;
            if (r == digit)
                count++;
        }
        return count;
    }

    public static int DecimalToAnyBase(int num, int base) {

        int count = 0;
        int newnum = 0;

        while (num != 0) {
            int reminder = num % base;
            newnum = newnum + (int) Math.pow(10, count) * reminder;
            num = num / base;
            count++;
        }
        return newnum;
    }

    public static int anyBaseToDecimal(int num, int base) {

        int count = 0;
        int newnum = 0;

        while (num > 0) {
            int reminder = num % 10;
            num = num / 10;
            newnum = newnum + (int) Math.pow(base, count) * reminder;
            count++;
        }
        return newnum;

    }

    public static int anyBaseToAnyBase(int num, int base1, int base2) {
        int deci = anyBaseToDecimal(num, base1);
        int anyBase = DecimalToAnyBase(deci, base2);
        return anyBase;

        // int count = 0;
        // int newnum = 0;

        // while (num > 0) {
        // int reminder = num % base2;
        // num = num / base2;
        // newnum = newnum + (int) Math.pow(base1, count) * reminder;
        // count++;
        // }
        // return newnum;
    }

    public static int anyBaseAddition(int base, int num1, int num2) {
        int carry = 0;
        int newnum = 0;
        int count = 0;
        while (num1 > 0 || num2 > 0 || carry > 0) {
            int r1 = num1 % 10;
            int r2 = num2 % 10;
            int r = r1 + r2 + carry;
            carry = r / base;
            int reminder = r % base;
            newnum = newnum + (int) Math.pow(10, count) * reminder;
            num1 = num1 / 10;
            num2 = num2 / 10;
            count++;
        }
        return newnum;
    }

    public static int anyBaseSubtraction(int base, int num1, int num2) {

        int borrow = 0;
        int newnum = 0;
        int count = 0;

        while (num2 > 0) {
            int r1 = num1 % 10;
            int r2 = num2 % 10;

            num1 = num1 / 10;
            num2 = num2 / 10;

            int reminder = r2 - r1 - borrow;

            if (reminder < 0) {
                borrow = 1;
                reminder += (borrow * base);
            } else {
                borrow = 0;
            }
            newnum = newnum + (int) Math.pow(10, count) * reminder;
            count++;
        }
        return newnum;
    }

    public static int anyBaseMultiplication(int base, int num1, int num2) {
        int result = 0;
        int count = 1;

        while (num2 > 0) {
            int d = num2 % 10;
            num2 = num2 / 10;
            int product = getDigitProduct(base, num1, d);
            result = anyBaseAddition(base, result, count * product);
            count = count * 10;

        }
        return result;

    }

    public static int getDigitProduct(int base, int num1, int num2) {
        int carry = 0;
        int newnum = 0;
        int count = 0;
        while (num1 > 0 || carry > 0) {
            int r1 = num1 % 10;
            num1 = num1 / 10;
            int r = r1 * num2 + carry;
            int reminder = r % base;
            carry = r / base;
            newnum = newnum + (int) Math.pow(10, count) * reminder;
            count++;
        }
        return newnum;

    }
}
