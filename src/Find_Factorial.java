
import java.util.Scanner;

    public class Find_Factorial {

    public static void main(String[] args) {
        int n, fact = 1;
        Scanner input = new Scanner(System.in);
        System.out. println("Enter Number Of N:");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out. println("Factorial(" + " " + n + " ) " + "is " + fact);

    }

}