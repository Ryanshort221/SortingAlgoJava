import java.util.Arrays;

public class InsertionSort {
    public int[] n;

    public void sort(int[] n) {
        int n1 = n.length;
        for (int i = 1; i < n1 ; i++) {
            int key = n[i];
            int j = i - 1;

            while (j >= 0 && n[j] > key) {
                n[j + 1] = n[j];
                j--;
            }
            n[j + 1] = key; 
        }
        System.out.println(Arrays.toString(n));
    }
} 
