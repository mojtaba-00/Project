

public class Find_Upside_Down {

    public static void main(String[] args) {
        int number=123456;
        int number1=0;
        while (number!=0) {
            int d= number % 10;
            number1=number1*10+d;
            number=number/10;

        }
        System.out.print(number1);
    }

}
