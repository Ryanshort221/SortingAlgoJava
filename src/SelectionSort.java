import java.util.Arrays;
// 1 less then the n of items you had (n-1)
// Selection sort starts at the beginning of your data set and compares the first element to the rest of the elements in the list to find the smallest element. Then swapping the smallest element with the first element. Then it moves to the second element and compares it with the rest of the elements in the list to find the second smallest element and swaps it with the second element. It continues to do this until the list is sorted.
public class SelectionSort {
    public int[] n;

    public void sort(int[] n) {
        int len = n.length;
        for (int i = 0; i < len - 1; i++) {
            int min = n[i];
            int index = i;
            for (int j = i + 1; j < len; j++) {
                if (n[j] < min) {
                    min = n[j];
                    index = j;
                }
            }
            swap(n, i, index);
        }
        System.out.println(Arrays.toString(n) + "selection sort");
    }

    public void swap(int[] n, int a, int b) {
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }
}
