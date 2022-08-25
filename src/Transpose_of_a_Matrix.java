
import java.util.Arrays;
import java.util.Scanner;

public class Transpose_of_a_Matrix {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number");
        int num1 = reader.nextInt();
        System.out.println("Enter your number");
        int num2 = reader.nextInt();
        int[][] matrix1 = new int[num1][num2];
        int[][] matrix2 = new int[num1][num2];
        System.out.println("Enter the data for matrix");
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                matrix1[i][j] = reader.nextInt();
            }
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(matrix1[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                matrix2[j][i] = matrix1[i][j];
            }
        }
        for (int [] item:matrix2 ){
            System.out.println(Arrays.toString(item));
        }
    }
}