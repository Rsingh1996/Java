import java.util.ArrayList;
import java.util.Scanner;

public class RecursionInArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int num = input.nextInt();
        // array(num, input);
        // maxOfArray(num, input);
        // firstOccurrence(num, input);
        // lastOccurrencce(num, input);
        // allOccurences(num, input);
        getSubsequence(input);
    }

    private static int[] createArrayWithUserInput(int[] arr, int i, Scanner input) {
        if (i == arr.length)
            return null;
        arr[i] = input.nextInt();
        createArrayWithUserInput(arr, i + 1, input);
        return arr;
    }

    private static void display(int[] arr, int i) {
        if (i == arr.length)
            return;
        System.out.print(arr[i] + " ");
        display(arr, i + 1);

    }

    public static void array(int num, Scanner input) {
        int[] arr = new int[num];
        arr = createArrayWithUserInput(arr, 0, input);
        display(arr, 0);
    }

    public static void maxOfArray(int n, Scanner input) {
        int[] arr = new int[n];
        arr = createArrayWithUserInput(arr, 0, input);
        int max = ismax(arr, 0);
        System.out.println(max);
    }

    private static int ismax(int[] arr, int i) {
        if (i == arr.length)
            return -1;
        int max = ismax(arr, i + 1);
        if (max < arr[i])
            return arr[i];
        return max;
    }

    public static void firstOccurrence(int n, Scanner input) {
        int[] arr = new int[n];
        arr = createArrayWithUserInput(arr, 0, input);
        int target = input.nextInt();
        int index = firstIndex(arr, 0, target);
        System.out.println(index);
    }

    private static int firstIndex(int[] arr, int i, int t) {
        if (i == arr.length)
            return -1;
        if (arr[i] == t)
            return i;
        else {
            int index = firstIndex(arr, i + 1, t);
            return index;
        }
    }

    public static void lastOccurrencce(int n, Scanner input) {
        int[] arr = new int[n];
        arr = createArrayWithUserInput(arr, 0, input);
        int target = input.nextInt();
        int index = lastIndex(arr, 0, target);
        System.out.println(index);
    }

    private static int lastIndex(int[] arr, int i, int t) {
        if (i == arr.length)
            return -1;
        int index = lastIndex(arr, i + 1, t);
        if (index == -1) {
            if (arr[i] == t)
                return i;
            else {
                return -1;
            }
        } else
            return index;
    }

    public static void allOccurences(int n, Scanner input) {
        int[] arr = new int[n];
        arr = createArrayWithUserInput(arr, 0, input);
        int target = input.nextInt();
        int[] iarr = allIndices(arr, target, 0, 0);
        if (iarr.length == 0) {
            System.out.println();
            return;
        }
        display(iarr, 0);
    }

    private static int[] allIndices(int[] arr, int t, int i, int count) {
        if (i == arr.length)
            return new int[count];
        int[] iarr;

        if (arr[i] == t) {
            iarr = allIndices(arr, t, i + 1, count + 1);
            iarr[count] = i;

        } else
            iarr = allIndices(arr, t, i + 1, count);
        return iarr;
    }

    public static void getSubsequence(Scanner input) {
        String str = input.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);

    }

    private static ArrayList<String> gss(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0);
        String ros = str.substring(1);
        ArrayList<String> rres = gss(ros);

        ArrayList<String> mres = new ArrayList<>();
        for (String rstr : rres) {
            mres.add("" + rstr);
        }

        for (String rstr : rres) {
            mres.add(ch + rstr);
        }
        return mres;
    }
}
