import java.util.Scanner;

public class Find_Kmm_Number {

    public static void main(String[] args) {
        int a, b, i;
        Scanner intput = new Scanner(System.in);
        System.out. println("Enter a:");
        a = intput.nextInt();
        System.out. println("Enter b:");
        b = intput.nextInt();

        if (a > b)
            i = a;
        else
            i = b;

        while ((i % a != 0) || (i % b != 0)) {
            i++;
        }
        System.out. println("KMM " + a + " and " + b + " is " + i);
    }
}