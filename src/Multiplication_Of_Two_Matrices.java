import java.util.Scanner;

public class Multiplication_Of_Two_Matrices {
    public static void main(String[] args) {
        Scanner readre = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        int row1 = readre.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        int col1 = readre.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        int row2 = readre.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        int col2 = readre.nextInt();
        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible");
        } else {
            int[][] a = new int[row1][col1];
            int[][] b = new int[row2][col2];
            int[][] c = new int[row1][col2];

            System.out.println("Enter values for matrix A : \n");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++)
                    a[i][j] = readre.nextInt();
            }
            System.out.println("Enter values for matrix B : \n");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < col2; j++)
                    b[i][j] = readre.nextInt();
            }

            System.out.println("Matrix multiplication is : \n");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < col1; j++) {
                    for (int k = 0; k < col2; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
