// Given a signed 32-bit integer x, return x with its digits reversed. If
// reversing x causes the value to go outside the signed 32-bit integer range
// [-231, 231 - 1], then return 0.

public class reverseInteger {
    public static void main(String[] arg) {
        reverse(3456);

    }

    public static int reverse(int x) {
        long result = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            x = x / 10;
            result = result * 10 + lastDigit;

        }
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        } else {
            System.err.println((int) result);
        }
        return (int) result;
    }
}