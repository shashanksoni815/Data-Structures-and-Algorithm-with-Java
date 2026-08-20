package Arrays;

import java.util.Arrays;

public class dis {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9,0, 0, 0, 0, 0};
        int[] brr = {2, 4, 6, 8, 10};
        me(arr, 5, brr);
    }

    public static int[] me(int[] arr, int m, int[] brr) {
        int n = brr.length;
        int[] result = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr[i] < brr[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = brr[j++];
            }
        }
        while (i < m) {
            result[k++] = arr[i++];
        }
        while (j < n) {
            result[k++] = brr[j++];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
