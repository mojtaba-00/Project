import java.util.Scanner;

public class Reverse_A_One_Dimensional_Array {
    public static void main(String[] args) {
        Scanner reader= new Scanner(System.in);
        System.out.println("Enter your number");
        int num=reader.nextInt();
        int[] arr=new int[num];
        for (int i=0 ; i<num ; i++) {
            System.out.println("Enter your number");
            arr[i] = reader.nextInt();
        }
            for (int i=0 ; i<num ;i++){
                System.out.print(arr[i]);
                System.out.println();
        }
        for (int i=num-1 ; i>=0 ;i--){
            System.out.print(arr[i]);
        }


    }
}