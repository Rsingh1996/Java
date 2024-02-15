import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Size of Array1[Row]: ");
        int row1 = input.nextInt();
        System.out.print("Enter Size of Array1[Column]: ");
        int column1 = input.nextInt();

        // System.out.print("Enter Size of Array2[Row]: ");
        // int row2 = input.nextInt();
        // System.out.print("Enter Size of Array2[Column]: ");
        // int column2 = input.nextInt();

        // TwoDArray(row, column, input);
        // multiplicationOfTwoArray(row1, column1, row2, column2, input);
        // wakanda1(row1, column1, input);
        // spiralDisplay(row1, column1, input);
        // exitPointOfMatrix(row1, column1, input);
        // rotateArray90(row1, column1, input);
        // rotateRing(row1, column1, input);/
        // wakanda2(row1, column1, input);
        // saddlePrice(row1, column1, input);
        searchInSortedTwoDArray(row1, column1, input);
    }

    private static int[][] createArrayWithUserInput(int row, int column, Scanner input) {
        int[][] arr = new int[row][column];
        System.out.println("Enter Elements of Array ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++)
                arr[i][j] = input.nextInt();
        }
        return arr;
    }

    private static void display(int[][] arr) {
        for (int[] x : arr) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }

    }

    public static void twoDArray(int row, int column, Scanner input) {
        int[][] array = createArrayWithUserInput(row, column, input);
        display(array);

    }

    public static void multiplicationOfTwoArray(int row1, int column1, int row2, int column2, Scanner input) {

        int[][] array1 = createArrayWithUserInput(row1, column1, input);
        int[][] array2 = createArrayWithUserInput(row2, column2, input);
        int[][] tempArray = new int[row1][column2];

        if (column1 != row2)
            System.out.println("Invalid input");
        else
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < column1; k++) {
                        tempArray[i][j] += array1[i][k] * array2[k][j];
                    }
                }
            }
        display(tempArray);
    }

    public static void wakanda1(int row, int column, Scanner input) {
        int[][] array = createArrayWithUserInput(row, column, input);
        System.out.println("----------------------");
        display(array);
        System.out.println("----------------------");

        for (int i = 0; i < column; i++) {

            if (i % 2 != 0) {
                for (int j = row - 1; j >= 0; j--) {
                    System.out.print(array[j][i] + " ");

                }
            } else
                for (int j = 0; j < row; j++) {
                    System.out.print(array[j][i] + " ");

                }
        }

    }

    public static void spiralDisplay(int row, int column, Scanner input) {

        int[][] array = createArrayWithUserInput(row, column, input);
        display(array);

        int minrow = 0;
        int mincol = 0;

        int maxrow = array.length - 1;
        int maxcol = array[0].length - 1;

        int totalNumberOfElement = row * column;
        int count = 0;

        while (count < totalNumberOfElement) {
            for (int i = minrow; i <= maxrow; i++) {
                System.out.print(array[i][mincol] + " ");
                count++;
            }
            mincol++;

            for (int i = mincol; i <= maxcol; i++) {
                System.out.print(array[maxrow][i] + " ");
                count++;
            }
            maxrow--;

            for (int i = maxrow; i >= minrow; i--) {
                System.out.print(array[i][maxcol] + " ");
                count++;
            }
            maxcol--;

            for (int i = maxcol; i >= mincol; i--) {
                System.out.print(array[minrow][i] + " ");
                count++;
            }
            minrow++;
        }

    }

    public static void exitPointOfMatrix(int row, int column, Scanner input) {

        int[][] array = createArrayWithUserInput(row, column, input);
        display(array);

        int i = 0;
        int j = 0;
        int dir = 0;

        while (true) {
            dir = (dir + array[i][j]) % 4;

            if (dir == 0)
                j++;
            else if (dir == 1)
                i++;
            else if (dir == 2)
                j--;
            else if (dir == 3)
                i--;
            if (i < 0) {
                i++;
                break;
            } else if (j < 0) {
                j++;
                break;
            } else if (i == row) {
                i--;
                break;
            } else if (j == column) {
                j--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }

    public static void rotateArray90(int row, int column, Scanner input) {
        int[][] array = createArrayWithUserInput(row, column, input);

        // int tempArray[][] = new int[row][column];
        // int col = column - 1;

        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < column; j++) {
        // tempArray[j][col] = array[i][j];
        // }
        // col--;
        // }

        for (int i = 0; i < row; i++) {
            for (int j = i; j < column; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column / 2; j++) {
                int temp = array[i][j];
                array[i][j] = array[i][column - 1 - j];
                array[i][column - 1 - j] = temp;
            }
        }

        display(array);

    }

    public static void rotateRing(int row, int column, Scanner input) {

        int[][] array = createArrayWithUserInput(row, column, input);
        int rotationShell = input.nextInt();
        int numberOfRotation = input.nextInt();

        int[] oneDArray = twoDArrayToOneDArray(array, rotationShell);
        rotaion(oneDArray, numberOfRotation);
        oneDArraytoTwoDArray(array, rotationShell, oneDArray);
        display(array);

    }

    public static void rotaion(int[] oneDArray, int numberOfRotation) {
        int index = oneDArray.length - 1;
        int r = numberOfRotation;
        r = r % oneDArray.length;
        r = r > 0 ? r : r + oneDArray.length;

        reverse(oneDArray, 0, index - r - 1);
        reverse(oneDArray, index - r, index);
        reverse(oneDArray, 0, index);

    }

    public static void reverse(int[] arr, int i, int j) {
        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }

    public static void DisplayOneDArray(int[] arr) {
        for (int x : arr)
            System.out.print(x + " ");
    }

    public static int[] twoDArrayToOneDArray(int[][] array, int rotationShell) {
        int minrow = rotationShell - 1;
        int mincol = rotationShell - 1;
        int maxrow = array.length - rotationShell;
        int maxcol = array[0].length - rotationShell;
        int size = 2 * ((maxrow - minrow) + (maxcol - mincol));
        int count = 0;

        int[] tempArray = new int[size];

        for (int i = minrow; i <= maxrow; i++) {
            tempArray[count] = array[i][mincol];
            count++;
        }
        mincol++;
        for (int j = mincol; j <= maxcol; j++) {
            tempArray[count] = array[maxrow][j];
            count++;
        }
        maxrow--;
        for (int i = maxrow; i >= minrow; i--) {
            tempArray[count] = array[i][maxcol];
            count++;
        }
        maxcol--;
        for (int j = maxcol; j >= mincol; j--) {
            tempArray[count] = array[minrow][j];
            count++;
        }

        return tempArray;

    }

    public static void oneDArraytoTwoDArray(int[][] array, int rotationShell, int[] oneDArray) {
        int minrow = rotationShell - 1;
        int mincol = rotationShell - 1;
        int maxrow = array.length - rotationShell;
        int maxcol = array[0].length - rotationShell;

        int count = 0;

        for (int i = minrow; i <= maxrow; i++) {
            array[i][mincol] = oneDArray[count];
            count++;
        }
        mincol++;
        for (int j = mincol; j <= maxcol; j++) {
            array[maxrow][j] = oneDArray[count];
            count++;
        }
        maxrow--;
        for (int i = maxrow; i >= minrow; i--) {
            array[i][maxcol] = oneDArray[count];
            count++;
        }
        maxcol--;
        for (int j = maxcol; j >= mincol; j--) {
            array[minrow][j] = oneDArray[count];
            count++;
        }
    }

    public static void wakanda2(int row, int column, Scanner input) {
        int[][] array = createArrayWithUserInput(row, column, input);
        System.out.println("----------------------");
        display(array);
        System.out.println("----------------------");
        int count = 0;
        while (row > 0) {
            int minrow = 0;
            int mincol = 0 + count;

            for (int i = 0; i < row; i++) {
                System.out.print(array[minrow][mincol] + " ");
                minrow++;
                mincol++;
            }

            row--;
            count++;
        }

    }

    public static void saddlePrice(int row, int column, Scanner input) {
        int[][] array = createArrayWithUserInput(row, column, input);
        System.out.println("----------------------");
        display(array);
        System.out.println("----------------------");

        int mincol = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] < array[i][mincol]) {
                    mincol = j;
                }
            }
            boolean istrue = true;
            for (int k = 0; k < row; k++) {
                if (array[k][mincol] > array[i][mincol]) {
                    istrue = false;
                    break;
                }
            }
            if (istrue == true) {
                System.out.println(array[i][mincol]);
                return;

            }
        }
        System.out.println("Invalid input");

    }

    public static void searchInSortedTwoDArray(int row, int column, Scanner input) {
        int[][] array = createArrayWithUserInput(row, column, input);
        int target = input.nextInt();
        System.out.println("----------------------");
        display(array);
        System.out.println("----------------------");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (array[i][j] == target) {
                    System.out.println("Target vaule " + target + " is found at (" + i + ", " + j + ")");
                    return;
                }
            }
        }
        System.out.println("Not Found");
    }

}
