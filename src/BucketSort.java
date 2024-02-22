import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class BucketSort {
    public void bucketSort(float[] arr, int n) {
        if (n <= 0) {
            return;
        }

        @SuppressWarnings("unchecked")
        ArrayList<Float>[] bucket = new ArrayList[n];

        // create empty buckets
        for (int i = 0; i < n; i++) {
            bucket[i] = new ArrayList<Float>();
        }

        // add elements into the buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }

        // sort elements of each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort((bucket[i]));
        }

        // get the sorted array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    // public static void bucketSort(int[] arr) {
    //     int max = getMax(arr);
    //     int[] sortedArray = new int[max + 1];

    //     for (int cur : arr) {
    //         sortedArray[cur] = cur;
    //     }
    //     System.out.println(Arrays.toString(arr));
    // }

    // public static int getMax(int[] arr) {
    //     int maxValue = arr[0];
    //     for (int i = 1; i < arr.length; i++) {
    //         if(arr[i] > maxValue) {
    //             maxValue = arr[i];
    //         }
    //     }
    //     return maxValue;
    // }
}
