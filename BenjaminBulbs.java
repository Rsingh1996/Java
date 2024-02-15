import java.util.Scanner;

public class BenjaminBulbs {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        for (int i = 1; i * i <= number; i++)
            System.out.println(i * i);
    }
}
