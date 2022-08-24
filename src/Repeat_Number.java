import java.util.Arrays;
import java.util.Scanner;

public class Repeat_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number : ");
        String item [] ;
        String str = input.nextLine();
        item = str.split("");
        for (String s : item) {
            System.out.print(s + " : ");
            int count = Integer.parseInt(s);
            for(int i = 0 ; i<count ; i++)
                System.out.print(count);
            System.out.println();
        }
// Soulution with integer
        System.out.println("How many numbers do u have ? ");
        int list[] = new int[input.nextInt()];
        System.out.println("Enter number : ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        for (int i = 0 ; i < list.length ; i ++){
            System.out.print(list[i] + " : " );
            for (int j = 0 ; j < list[i] ; j++){
                System.out.print(list[i]);
            }
            System.out.println();
        }

    }

}