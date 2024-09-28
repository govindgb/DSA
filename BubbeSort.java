import java.util.*;

public class BubbeSort {
    public static void main(String[] args) {

        // int[] arr = { 5, 4, 3, 2, 1 };

        // int n = arr.length;

        // bubble sort
        // for (int i = 0; i < n; i++) {
        // for (int j = i; j < n; j++) {
        // if (arr[i] > arr[j]) {
        // int val = arr[j];
        // arr[j] = arr[i];
        // arr[i] = val;
        // }
        // }
        // }

        // selection sort
        // for (int i = 0; i < n; i++) {
        // int minIndex = i;
        // for (int j = i; j < n; j++) {
        // if (arr[j] < arr[minIndex]) {
        // minIndex = j;
        // }
        // }
        // int minVal = arr[minIndex];
        // arr[minIndex] = arr[i];
        // arr[i] = minVal;
        // }
        // System.out.println(Arrays.toString(arr));

        // insertion sort
        int[] arr = { 6, 1, 7, 4, 2, 9, 8, 5, 3 };
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            j++;
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
