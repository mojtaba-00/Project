public class Find_The_Pythagorean_Number{
    public static void main(String[] args){
        long number = 12;
        outfor :for (int i = 1; i <= number; i++){
            long number2 = number - i;
            infor :for (int j = 1; j <= number2; j++){
                long num3 = number - i - j;
                if (((i * i) + (j * j)) == (num3 * num3)){
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(num3);
                    break outfor;
                }
            }
        }
    }
}







