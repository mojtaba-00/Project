import java.util.Scanner;

public class Taking_The_Number_And_Reversing {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = reader.nextInt();
        int number2 = 0;
        while (number != 0)
        {
            int number3 = number % 10;
            number2 = number2 * 10 + number3;
            number = number / 10;
        }
        System.out.print(number2);
    }
}