import java.util.Scanner;

public class Strings {

    public static void main(String arg[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        // stringCompression(s);
        // toggleCase(s);
        permutationOfString(s);
        // for (int i = 0; i < s.length(); i++) {
        // for (int j = i + 1; j < s.length() + 1; j++)
        // if (isPalindromic(s.substring(i, j)) == true)
        // System.out.println(s.substring(i, j));
        // }

    }

    public static boolean isPalindromic(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static void stringCompression(String s) {
        String ss = "";
        String ss1 = "";

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                count++;
                i++;
            }
            ss += s.charAt(i);
            ss1 += s.charAt(i);

            if (count > 1)
                ss1 += count;

        }

        System.out.println(ss);
        System.out.println(ss1);

    }

    public static void toggleCase(String s) {

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                char lc = (char) (ch - 'A' + 'a');
                sb.setCharAt(i, lc);
            } else if (ch >= 'a' && ch <= 'z') {
                char uc = (char) (ch - 'a' + 'A');
                sb.setCharAt(i, uc);
            }
        }
        System.out.println(sb.toString());
    }

    public static void permutationOfString(String s) {
        int num = 1;
        for (int i = 1; i <= s.length(); i++) {
            num *= i;
        }
        for (int i = 0; i < num; i++) {
            StringBuilder sb = new StringBuilder(s);
            int temp = i;
            for (int j = s.length(); j > 0; j--) {
                int reminder = temp % j;
                int q = temp / j;
                System.out.print(sb.charAt(reminder));
                sb.deleteCharAt(q);
                temp = q;

            }
            System.out.println();

        }

    }
}
