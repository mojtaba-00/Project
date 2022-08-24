import java.util.Scanner;

public class Draw_a_Ayramid  {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter yor number");
        int rows = reader.nextInt();
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
          }
        }
