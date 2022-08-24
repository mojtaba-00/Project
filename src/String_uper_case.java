import java.util.Scanner;

public class String_uper_case {
    public static void ToUpper() {
        char ch;
        String n, old;
        System.out.println("Enter your Statement : ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] x;
        str = str.toLowerCase();
        x = str.split(" ");
        for (String s : x) {
            ch = s.charAt(0);
            n = String.valueOf(ch);
            old = n;
            n = n.toUpperCase();
            System.out.print(s.replace(old, n) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String check2;
        do {
            ToUpper();
            System.out.println("Do you have another statement ? (y/n) : ");
            Scanner in = new Scanner(System.in);
            check2 = in.nextLine();
        } while (check2.equals("y"));


    }
}