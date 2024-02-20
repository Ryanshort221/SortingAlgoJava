import java.util.Arrays;

public class BubbleSort {
    public int[] n;

    // 1 less then the n of items you had (n-1)
    public void sort(int[] n) {
        int temp = 0;
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1 - i; j++) {
                if (n[j] > n[j + 1]) {
                    temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(n) + "bubble sort");
    }
}