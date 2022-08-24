import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {
        int[] arr = {30,20,40,50,90,80,60,70};
        Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
        int index =BinarySearch (arr,80);
        if (BinarySearch (arr , 80)!=-1){
            System.out.println(index);
        }
    }

    static int BinarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length-1;
        int mid ;
        while (left <= right) {
            mid = left + (right - 1) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

}
