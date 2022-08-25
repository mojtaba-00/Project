

public class Amount_Of_Water_Collected {

    static int maxWater(int[] arr, int n) {
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
    public
    static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 1, 0, 1, 2, 2, 1, 2, 0, 1};
        int n = arr.length;
        System.out.print(maxWater(arr, n));
    }
}