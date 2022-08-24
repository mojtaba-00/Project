import java.util.Scanner;

public class Find_Peterson_Number {
    public static void main(String[] args) {
        int number = 0, len = 0, max = 0, test = 0, num = 0;
        String character;
        System.out.println("Enter your number : ");
        Scanner input = new Scanner(System.in);
        character = input.nextLine();
        number = Integer.parseInt(character);
        int copyNumber = number;
        for (int i = 0; i < character.length(); i++) {
            num = number % 10;
            test = 1;
            for (int j = num; j > 0; j--) {
                test *= j;
            }
            max += test;
            number /= 10;

        }
        if (max == copyNumber) {
            System.out.println("Its peterson number is : " + max);
        } else {
            System.out.println("Its not peterson number : " + max);
        }


    }
}

