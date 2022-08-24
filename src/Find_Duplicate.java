public class Find_Duplicate {
    public static void main(String[] args) {
        int[] numbers = {25, 65, 15, 75, 65, 25, 15, 35};
        System.out.println(duplicate(numbers));

    }

    public static boolean duplicate(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {

            boolean duplicate = false;
            int j = 0;

            while (j < i) {

                if ((i != j) && numbers[i] == numbers[j]) {
                    duplicate = true;
                }

                j++;
            }

            if (duplicate) {
                System.out.print(numbers[i] + " ");
            }
        }
        return false;
    }
}
