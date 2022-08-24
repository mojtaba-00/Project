import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Pascals_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter your number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> bkp = new ArrayList<>();
        int a = 1;
        list.add(a);
        list.add(a);
        System.out.println(a + "\n" + list.get(0)+" " + list.get(1));
        int result = 0;
        number-=2;
        for (int i = 1; i <= number; i++) {
            bkp.add(a);
            for (int j = 0; j < i; j++) {
                result = Integer.parseInt(String.valueOf(list.get(j))) + Integer.parseInt(String.valueOf(list.get(j + 1)));
                bkp.add(result);
            }
            bkp.add(a);
            int len = list.size();
            list.clear();
            for (Integer integer : bkp) {
                list.add(integer);
            }
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
            bkp.clear();
        }
    }
}
