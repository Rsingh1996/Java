import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

import javax.xml.crypto.dsig.DigestMethod;

public class Pattern {

    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        Integer number = input.nextInt();
        // pattern1(number);
        // pattern2(number);
        // pattern3(number);
        // pattern4(number);
        // pattern5(number);
        // patternOne(number);
        // patternTwo(number);
        // patternThree(number);
        // patternFour(number);
        // patternFive(number);
        // patternSix(number);
        // patternSeven(number);
        // patternEight(number);
        // patternNine(number);
        // patternTen(number);
        // patternEleven(number);
        // patternTwelve(number);
        // patternThirteen(number);
        // patternFourteen(number);
        // patternFifteen(number);
        // patternSixteen(number);
        // patterSeventeen(number);
        // patternEighteen(number);
        // patternNineteen(number);
        patternTwenty(number);

    }

    public static void pattern1(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int num) {

        for (int i = num; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = i; j <= num - 1; j++) {
                System.out.print("  ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int num) {

        for (int i = num; i >= 1; i--) {

            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int z = 1; z <= i; z++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternOne(int num) {

        int stars = 1;
        int spaces = num - 1;

        for (int i = 1; i <= num; i++) {

            for (int star = 1; star <= stars; star++)
                System.out.print("* ");

            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            System.out.println();
            stars++;
            spaces--;
        }
    }

    public static void patternTwo(int num) {

        int stars = num;
        int spaces = 0;

        for (int i = 1; i <= num; i++) {

            for (int star = 1; star <= stars; star++)
                System.out.print("* ");

            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            System.out.println();
            stars--;
            spaces++;
        }
    }

    public static void patternThree(int num) {

        int stars = 1;
        int spaces = num - 1;

        for (int i = 1; i <= num; i++) {

            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            for (int star = 1; star <= stars; star++)
                System.out.print("* ");

            System.out.println();
            spaces--;
            stars++;
        }
    }

    public static void patternFour(int num) {
        int stars = num;
        int spaces = 0;

        for (int i = 1; i <= num; i++) {

            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            for (int star = 1; star <= stars; star++)
                System.out.print("* ");

            System.out.println();
            spaces++;
            stars--;
        }
    }

    public static void patternFive(int num) {
        int stars = 1;
        int spaces = num / 2;

        for (int i = 1; i <= num; i++) {

            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            for (int star = 1; star <= stars; star++)
                System.out.print("* ");

            System.out.println();

            if (i <= num / 2) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }

    public static void patternSix(int num) {
        int stars = num / 2 + 1;
        int spaces = 1;
        for (int i = 1; i <= num; i++) {

            for (int star = 1; star <= stars; star++)
                System.out.print("* ");

            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            for (int star = 1; star <= stars; star++)
                System.out.print("* ");

            System.out.println();

            if (i <= num / 2) {
                spaces += 2;
                stars--;
            } else {
                spaces -= 2;
                stars++;
            }
        }

    }

    public static void patternSeven(int num) {
        int spaces = 0;

        for (int i = 1; i <= num; i++) {

            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            System.out.print("* ");
            System.out.println();
            spaces++;
        }

        // for (int i = 1; i <= num; i++) {

        // for (int j = 1; j <= num; j++) {
        // if (i == j)
        // System.out.print("* ");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }
    }

    public static void patternEight(int num) {
        int spaces = num - 1;

        // for(int i = 1; i <= num; i++) {

        // for(int space = 1; space <= spaces; space++)
        // System.out.print(" ");
        // System.out.print("* ");
        // System.out.println();
        // spaces--;

        // }

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if (i + j == num + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }

    public static void patternNine(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if (i == j || i + j == num + 1)

                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();

        }
    }

    public static void patternTen(int num) {

        int innerSpace = -1;
        int outerSpace = 2;

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= outerSpace; j++)
                System.out.print("  ");
            System.out.print("* ");

            for (int k = 1; k <= innerSpace; k++)
                System.out.print("  ");

            if (i > 1 && i < num)
                System.out.print("* ");

            if (i <= num / 2) {
                outerSpace--;
                innerSpace += 2;
            } else {
                outerSpace++;
                innerSpace -= 2;
            }

            System.out.println();

        }
    }

    public static void patternEleven(int num) {
        int number = 1;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }

    public static void patternTwelve(int num) {
        int firstNumber = 0;
        int secondNumber = 1;
        int sum = 0;
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(firstNumber + " ");
                firstNumber = firstNumber + secondNumber;
                secondNumber = firstNumber - secondNumber;
            }

            System.out.println();
        }
    }

    public static void patternThirteen(int num) {

        for (int i = 0; i < num; i++) {
            int digit = 1;
            for (int j = 0; j <= i; j++) {

                System.out.print(digit + " ");
                int number = (digit * (i - j)) / (j + 1);
                digit = number;

            }

            System.out.println();
        }
    }

    public static void patternFourteen(int num) {

        for (int i = 1; i <= 10; i++)
            System.out.println(num + " * " + i + " = " + num * i);
    }

    public static void patternFifteen(int num) {
        int stars = 1;
        int spaces = num / 2;
        int digit = 1;
        for (int i = 1; i <= num; i++) {
            int secondDigit = digit;
            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            for (int star = 1; star <= stars; star++) {
                System.out.print(secondDigit + " ");

                if (star <= stars / 2)
                    secondDigit++;
                else
                    secondDigit--;

            }

            System.out.println();

            if (i <= num / 2) {
                spaces--;
                stars += 2;
                digit++;
            } else {
                spaces++;
                stars -= 2;
                digit--;
            }

        }
    }

    public static void patternSixteen(int num) {
        int stars = 1;
        int stasr1 = 1;
        int spaces = (num - 1) * 2 - 1;

        for (int i = 1; i <= num; i++) {

            for (int star = 1; star <= stars; star++)
                System.out.print(star + " ");
            for (int space = 1; space <= spaces; space++)
                System.out.print("  ");

            if (spaces <= 0)
                stasr1 = num - 1;
            else
                stasr1 = stars;
            for (int star = stasr1; star >= 1; star--) {
                System.out.print(star + " ");
                stasr1--;
            }
            stars++;
            spaces -= 2;

            System.out.println();

        }

    }

    public static void patterSeventeen(int num) {
        int spaces = num / 2;
        int stars = 1;

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= spaces; j++) {
                if (i != num / 2 + 1)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }

            for (int j = 1; j <= stars; j++)
                System.out.print("* ");

            // for (int j = 1; j <= spaces; j++)
            // System.out.print(" ");

            if (i <= num / 2) {
                stars++;
            } else {
                stars--;
            }
            System.out.println();
        }

    }

    public static void patternEighteen(int num) {
        int spaces = 0;
        int stars = num;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= spaces; j++)
                System.out.print("  ");

            for (int j = 1; j <= stars; j++) {
                if (i > 1 && i <= num / 2 && j > 1 && j < stars)
                    System.out.print("  ");
                else
                    System.out.print("* ");
            }

            if (i <= num / 2) {
                stars -= 2;
                spaces++;

            } else {
                stars += 2;
                spaces--;
            }
            System.out.println();
        }

    }

    public static void patternNineteen(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if (i == 1) {
                    if (j == num || j <= num / 2 + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else if (i <= num / 2) {
                    if (j == num / 2 + 1 || j == num) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else if (i == num / 2 + 1) {
                    System.out.print("*");
                } else if (i < num) {
                    if (j == 1 || j == num / 2 + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j == 1 || j >= num / 2 + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();

        }
    }

    public static void patternTwenty(int num) {

        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num) {
                    System.out.print("* ");
                } else if (i > num / 2 && (i == j || i + j == num + 1)) {
                    System.out.print("* ");
                } else
                    System.out.print("  ");

            }
            System.out.println();

        }
    }
}
