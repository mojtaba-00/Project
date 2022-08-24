
import java.util.Scanner;

public class Find_Bmm_Number {

    public static void main(String[] args) {
        int a, b, i;
        Scanner intput = new Scanner(System.in);
        System.out. println("Enter A:");
        a = intput.nextInt();
        System.out. println("Enter B:");
        b = intput.nextInt();
        if (a > b)
            i = a;
        else
            i = b;

        while ((a % i != 0) || (b % i != 0)) {
            i--;
        }
        System.out. println("BMM " + a + " and " + b + " is " + i);
    }
}

