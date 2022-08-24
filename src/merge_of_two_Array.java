public class merge_of_two_Array {
    public static void main(String[] args) {
        int[] arr1 = {25, 65, 35, 45, 65};
        int[] arr2 = {75, 85, 95, 49, 68};
        int[] merge = new int[arr1.length + arr2.length];
        int c = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
            c++;
        }
        for (int j = 0; j < arr2.length; j++) {
            merge[c++] = arr2[j];
        }
        for (int x = 0; x < merge.length; x++) {
            System.out.println(merge[x]);
        }

    }
}