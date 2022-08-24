import java.util.Arrays;

public class Delete_duplicate_numbers {

    public static void main(String[] args) {
        int[] a = { 1, 3, 3,10, 10 };
        Arrays.sort(a);
        int j = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];

            }
        }
        a[j] = a[a.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.println(a[i]);
        }

    }
}