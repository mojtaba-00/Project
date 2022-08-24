import java.util.Scanner;

public class MakeT_Omany_Bumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number : ");
        String number = input.nextLine();
        int num = Integer.parseInt(number);
        if (num <= 9) {
            int len = number.length();
            int[] list = new int[num + 1];
            for (int i = 0; i <= num; i++) {
                list[i] = i;
            }
            System.out.print(list[num]);
        } else if (num >= 10 && num <= 99) {
//            String[] str = new String[100];
            StringBuilder str = new StringBuilder();
            for (int i = 10; i <= 99; i++) {
                String item = String.valueOf(i);
                str.append(i);
            }
//            System.out.println(str);
            System.out.println(str.charAt(num - 10));
        } else if (num >= 100 && num <= 999) {
            StringBuilder str = new StringBuilder();
            for (int i = 100; i <= 999; i++) {
                String item = String.valueOf(i);
                str.append(i);
            }
            System.out.println(str.charAt(num - 100));
        } else if (num >= 1000 && num <= 9999) {
            StringBuilder str = new StringBuilder();
            for (int i = 1000; i <= 9999; i++) {
                String item = String.valueOf(i);
                str.append(i);
            }
            System.out.println(str.charAt(num - 1000));
        }
    }
}