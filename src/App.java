public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int[] arr = { 5, 4, 3, 2, 1 };
        int[] arr1 = { 5, 1, 4, 2, 8 };
        int[] arr2 = { 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000};
        int[] arr3 = { 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000, 78, 169, 367, 480, 1024, 54, 67, 1, 4, 999, 15000};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        BubbleSort bubbleSort1 = new BubbleSort();
        bubbleSort1.sort(arr1);
        BubbleSort bubbleSort2 = new BubbleSort();
        bubbleSort2.sort(arr2);
        BubbleSort bubbleSort3 = new BubbleSort();
        bubbleSort3.sort(arr3);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        InsertionSort insertionSort1 = new InsertionSort();
        insertionSort1.sort(arr1);
        InsertionSort insertionSort2 = new InsertionSort();
        insertionSort2.sort(arr2);
        InsertionSort insertionSort3 = new InsertionSort();
        insertionSort3.sort(arr3);
    }
}