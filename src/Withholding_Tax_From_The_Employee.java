import java.util.Scanner;

public class Withholding_Tax_From_The_Employee {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = reader.nextInt();
        int number = 0;
        if (salary < 3000000) {
            number = salary / 100 * 5;
            System.out.println("your salary" + (salary - number));
        } else if (salary >= 3000000 && salary <= 6000000) {
            number = salary / 100 * 10;
            System.out.println("your salary" + (salary - number));
        } else if (salary > 6000000) {
            number = salary / 100 * 24;
            System.out.println("your salary" + (salary - number));
        } else System.out.println("Error");
    }
}
