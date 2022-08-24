import java.util.Scanner;

class Rotation_of_Elements {
    public static void main(String[] args) {
        int[] myarray = new int[]{1,2,3,4,5};
        int[] myarray2 = new int[myarray.length];
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = reader.nextInt();
        int rotation = number;
        int i = 0;
        while (rotation < myarray2.length) {
            myarray2[i] = myarray[rotation];
            i++;
            rotation++;
        }
        rotation = 0;
        while (rotation < number) {
                myarray2[i] = myarray[rotation];
                i++;
                rotation++;
            }
        for (int item :myarray2){
            System.out.print(item);
        }
    }
}