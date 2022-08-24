import java.math.BigInteger;
import java.util.Scanner;

class Calculate_Big_Numbers_With_Operators {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        BigInteger mult;
        char x;
        System.out.print("Enter A : ");
        BigInteger number1 = s.nextBigInteger();
        System.out.print("Enter B : ");
        BigInteger number2 = s.nextBigInteger();
        System.out.print("Enter operator (+ , - , *) ");
        x = s.next().charAt(0);
        switch (x) {
            case '*': {
                mult = number1.multiply(number2);
                System.out.print("your number: " + mult);
                break;
            }
            case '-': {
                mult = number1.subtract(number2);
                System.out.print("your number: " + mult);
                break;
            }
            case '+':
                mult = number1.add(number2);
                System.out.println(mult);
                break;
            default: {
                System.out.print("Error");
                return;
            }
        }
    }
}