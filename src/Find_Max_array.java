public class Find_Max_array {
    public static void main(String[] args) {
        int[] array = {25, 65, 75, 35, 45,};
        System.out.println(maxarray(array));
    }

    public static int maxarray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        return max;
    }
}


