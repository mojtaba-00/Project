
import java.util.Scanner;
class Calculate_Numbers_With_Operators {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in );
        int a, b;
        char x;
        System.out.print("Enter A : ");
        a=s.nextInt();
        System.out.print("Enter B : ");
        b=s.nextInt();
        System.out.print("Enter operator (+ , -) ");
        x = s.next().charAt(0);
        int num1 = a+b;
        int num2 = a-b;

        switch(x)
        {
            case '+' :
            {
                System.out.print("your number: "+num1);
                break;
            }
            case '-' :
            {
                System.out.print("your number: " +num2);
                break;
            }
            default :
            {
                System.out.print("Error");
                return;
            }
        }
    }
}