import java.util.Scanner;
public class Find_The_Repeating_Word {
    public static void repeated_letter(String num) {
        String[] ch = num.split("");
        String temp = "";
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i < ch.length; i++) {
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i].equals(ch[j]) && !ch[i].equals("")) {
                    temp = ch[i];
                    ch[j] = "";
                    counter++;
                    flag = true;
                }
            }
            if (flag) {
                System.out.println(temp + " : " + counter);
                flag = false;
                counter = 1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String:");
        String str = input.nextLine();
        repeated_letter(str);
    }
}