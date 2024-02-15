import java.io.ObjectInputFilter.Status;
import java.lang.reflect.Array;
import java.security.Principal;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;
import javax.swing.text.html.parser.Element;

public class Arrays {

    public static void main(String[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int number1 = input.nextInt();
        // System.out.print("Enter Size of Array2: ");
        // int number2 = input.nextInt();

        // spanOfArray(number);
        // findElement(number);
        // barChart(number1, input);
        // sumOfTwoArrays(number1, number2, input);
        // diifferanceOfTwoArrays(number1, number2, input);
        // reverseOfArray(number1, input);
        // rotationOfArray(number1, input);
        // inverseOfArray(number1, input);
        // subArrayofArray(number1, input);
        // binarySearch(number1, input);
        // findCeilAndFloor(number1, input);
        // firstAndLastIndex(number1, input);
        // subsetOfArray(number1, input);
        invertedBarChart(number1, input);

    }

    private static void Display(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
    }

    private static int[] createArrayWithUserInput(int num, Scanner input) {
        int[] arr = new int[num];
        System.out.println("Enter Elements of Array ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = input.nextInt();
        return arr;
    }

    private static void swapArray(int startIndex, int endIndex, int array[]) {
        while (startIndex < endIndex) {
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }

    }

    public static void spanOfArray(int num, Scanner input) {

        int[] arr = createArrayWithUserInput(num, input);

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max - min);

    }

    public static void findElement(int num, Scanner input) {
        int[] arr = createArrayWithUserInput(num, input);
        int ind = 0;

        int digit = input.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (digit == arr[i]) {
                ind = i;
                break;
            } else
                ind = -1;

        }
        System.out.println("Element found at index : " + ind);

    }

    public static void barChart(int num, Scanner input) {
        int[] arr = createArrayWithUserInput(num, input);

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        for (int i = max; i >= 1; i--) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
        Display(arr);
    }

    public static void sumOfTwoArrays(int num1, int num2, Scanner input) {
        int[] array1 = createArrayWithUserInput(num1, input);
        int[] array2 = createArrayWithUserInput(num2, input);

        int max = num1 > num2 ? num1 : num2;
        int carry = 0;

        int[] array3 = new int[max];
        int lengthOfArray1 = num1 - 1;
        int lengthOfArray2 = num2 - 1;

        for (int i = max - 1; i >= 0; i--) {

            int valueOfArray1 = lengthOfArray1 > -1 ? array1[lengthOfArray1] : 0;
            int valueOfArray2 = lengthOfArray2 > -1 ? array2[lengthOfArray2] : 0;

            int sum = valueOfArray1 + valueOfArray2 + carry;
            int reminder = sum % 10;
            carry = sum / 10;
            array3[i] = reminder;
            lengthOfArray1--;
            lengthOfArray2--;
        }
        if (carry > 0)
            System.out.print(carry);

        Display(array3);
    }

    public static void diifferanceOfTwoArrays(int num1, int num2, Scanner input) {

        int[] array1 = createArrayWithUserInput(num1, input);
        int[] array2 = createArrayWithUserInput(num2, input);

        int max = num1 > num2 ? num1 : num2;
        int borrow = 10;
        int carry = 0;

        int[] array3 = new int[max];
        int lengthOfArray1 = num1 - 1;
        int lengthOfArray2 = num2 - 1;

        for (int i = max - 1; i >= 0; i--) {

            int valueOfArray1 = lengthOfArray1 > -1 ? array1[lengthOfArray1] : 0;
            int valueOfArray2 = lengthOfArray2 > -1 ? array2[lengthOfArray2] : 0;

            int diff = valueOfArray2 + carry - valueOfArray1;
            if (diff < 0) {
                diff += borrow;
                carry = -1;

            } else {
                carry = 0;
            }
            int reminder = diff % 10;

            array3[i] = reminder;
            lengthOfArray1--;
            lengthOfArray2--;

        }
        Display(array3);
    }

    public static void reverseOfArray(int num1, Scanner input) {

        int[] array = createArrayWithUserInput(num1, input);
        int index = num1 - 1;

        for (int i = 0; i < array.length / 2; i++) {

            swapArray(i, index, array);
            index--;
        }

        Display(array);
    }

    public static void rotationOfArray(int num1, Scanner input) {

        int[] array = createArrayWithUserInput(num1, input);
        int k = input.nextInt();

        k = k % num1;
        k = k >= 0 ? k : k + num1;

        for (int i = 0; i < k; i++) {
            // rotateOnceLeft(array);
            // rotateOnceRight(array);
        }
        // approch1(array, k);
        approch2(array, k);
        Display(array);
    }

    private static void rotateOnceRight(int array[]) {
        int length = array.length;
        int temp = array[length - 1];
        for (int i = length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    private static void rotateOnceLeft(int array[]) {
        int length = array.length;
        int temp = array[0];
        for (int i = 0; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[length - 1] = temp;
    }

    private static void approch1(int array[], int k) {

        int temp = 0;
        int length = array.length;
        int[] array2 = new int[length];

        for (int i = k; i < length; i++) {
            array2[temp] = array[i];
            temp++;
        }

        for (int i = 0; i < k; i++) {
            array2[temp] = array[i];
            temp++;
        }

        for (int i = 0; i < length; i++) {
            array[i] = array2[i];
        }

    }

    private static void approch2(int array[], int k) {

        int index = array.length - 1;

        swapArray(0, index, array);
        swapArray(0, k - 1, array);
        swapArray(k, index, array);

    }

    public static void inverseOfArray(int num, Scanner input) {

        int[] array = createArrayWithUserInput(num, input);
        int[] tempArray = new int[num];

        for (int i = 0; i < num; i++) {
            int j = array[i]; // j = 5
            tempArray[j] = i; //
        }
        Display(tempArray);
    }

    public static void subArrayofArray(int num, Scanner input) {
        int[] array = createArrayWithUserInput(num, input);
        System.out.print("SubArray of Array : ");
        Display(array);
        System.out.println();

        for (int i = 0; i < num; i++) {

            for (int j = i; j < num; j++) {

                for (int k = i; k <= j; k++) {

                    System.out.print(array[k] + " ");
                }

                System.out.println();
            }

        }
    }

    public static void binarySearch(int num, Scanner input) {

        int[] array = createArrayWithUserInput(num, input);
        System.out.print("Element to be Seacrhed : ");
        int k = input.nextInt();

        int first = 0;
        int last = array.length - 1;

        while (first <= last) {
            int middle = (last + first) / 2;
            if (k < array[middle]) {
                last = middle - 1;

            } else if (k > array[middle]) {
                first = middle + 1;

            } else {
                System.out.println("Seacrhed Element found at index : " + middle);
                return;
            }
        }
        System.out.println("Seacrhed Element not found");
    }

    public static void findCeilAndFloor(int num, Scanner input) {
        int[] array = createArrayWithUserInput(num, input);
        int k = input.nextInt();

        int low = 0;
        int high = array.length - 1;
        int floor = -1;
        int ceil = -1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (k > array[mid]) {
                low = mid + 1;
                floor = mid;
            } else if (k < array[mid]) {
                high = mid - 1;
                ceil = mid;
            } else {
                floor = mid;
                ceil = mid;
            }
        }
        if (floor > -1)
            System.out.println("Floor : " + array[floor]);
        if (ceil > -1)
            System.out.println("Ceil : " + array[ceil]);
    }

    public static void firstAndLastIndex(int num, Scanner input) {
        int[] array = createArrayWithUserInput(num, input);
        int k = input.nextInt();

        int low = 0;
        int high = array.length - 1;
        int firstIndex = -1;
        int lastIndex = -1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (k > array[mid]) {
                low = mid + 1;
            } else if (k < array[mid]) {
                high = mid - 1;
            } else {
                firstIndex = mid;
                high = mid - 1;
            }
        }
        if (firstIndex > -1)
            System.out.println("First Index : " + firstIndex);

        else
            System.out.println("Element not found");

        low = 0;
        high = array.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;

            if (k > array[mid]) {
                low = mid + 1;
            } else if (k < array[mid]) {
                high = mid - 1;
            } else {
                lastIndex = mid;
                low = mid + 1;
            }
        }
        if (lastIndex > -1)
            System.out.println("Last Index : " + lastIndex);

        else
            System.out.println("Element not found");
    }

    private static int descimatToBase(int num, int base) {
        int pow = 1;
        int result = 0;

        while (num > 0) {
            int reminder = num % 2;
            result = pow * reminder + result;
            num = num / base;
            pow = pow * 10;
        }
        return result;
    }

    private static String simplyfyingString(int binary, int num) {

        String binaryString = Integer.toString(binary);
        int length = binaryString.length();
        for (int i = 0; i < num - length; i++)
            binaryString = "0" + binaryString;
        return binaryString;

    }

    public static void subsetOfArray(int num, Scanner input) {
        int[] array = createArrayWithUserInput(num, input);

        int length = (int) Math.pow(2, num);
        for (int i = 0; i < length; i++) {
            int binary = descimatToBase(i, 2);
            String binaryString = simplyfyingString(binary, num);
            String subset = " ";
            for (int j = array.length - 1; j >= 0; j--) {

                if (binaryString.charAt(j) == '0')
                    subset = "- " + subset;
                else
                    subset = array[j] + " " + subset;
            }
            System.out.println(subset + " ");
        }
    }

    public static void invertedBarChart(int num, Scanner input) {
        int[] arr = createArrayWithUserInput(num, input);

        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        Display(arr);
        System.out.println();
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] >= i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }

    
}
