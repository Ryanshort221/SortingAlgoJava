import java.util.Arrays;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        // int[] arr = { 5, 4, 3, 2, 1 };
        // int[] arr1 = { 5, 1, 4, 2, 8 };
        // int[] arr2 = { 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000};
        // BubbleSort bubbleSort = new BubbleSort();
        // bubbleSort.sort(arr);
        // BubbleSort bubbleSort1 = new BubbleSort();
        // bubbleSort1.sort(arr1);
        // BubbleSort bubbleSort2 = new BubbleSort();
        // bubbleSort2.sort(arr2);
        // InsertionSort insertionSort = new InsertionSort();
        // insertionSort.insertionSort(arr);
        // InsertionSort insertionSort1 = new InsertionSort();
        // insertionSort1.insertionSort(arr1);
        // InsertionSort insertionSort2 = new InsertionSort();
        // insertionSort2.insertionSort(arr2);
        // SelectionSort selectionSort = new SelectionSort();
        // selectionSort.sort(arr);
        // SelectionSort selectionSort1 = new SelectionSort();
        // selectionSort1.sort(arr1);
        // SelectionSort selectionSort2 = new SelectionSort();
        // selectionSort2.sort(arr2);
        // Dijkstra dijkstra = new Dijkstra();
        // int[][] testMatrix = { { 0, 3, 0, 0 }, { 3, 0, 4, 0 }, { 0, 4, 0, 5 }, { 0, 0, 5, 0 } };
        // dijkstra.dijkstra(testMatrix);
        // int targetNode = 3;
        // int[] distances = dijkstra.dijkstra(testMatrix);

        // System.out.println("The shortest distance from node 0 to node " + targetNode + " is " + distances[targetNode]);


        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        QuickSort quicksort = new QuickSort();
        quicksort.quicksort(arr);
        System.out.println("Quick Sort " + Arrays.toString(arr));
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(arr);
        System.out.println("Merge Sort " + Arrays.toString(arr));
    }
}
