import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListProgram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(scn.nextInt());
        }
        removeAllPrime(al);
        System.out.println(al);
    }

    public static void removeAllPrime(ArrayList<Integer> al) {

        for (int i = al.size() - 1; i >= 0; i--) {
            if (isPrime(al.get(i)))
                al.remove(i);
        }
    }

    public static boolean isPrime(int n) {
        for (int j = 2; j <= Math.sqrt(n); j++) {
            if (n % j == 0)
                return false;
        }
        return true;
    }
}