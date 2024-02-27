import java.util.Random;

public class QuickSort {
    // Quick Sort - recursively divide the array into two halves and sort them
    // runtime complexity: O(n log n) - the array is divided into log n levels and
    // each level requires n operations
    // space complexity: O(log n) - additional space for the recursive calls


    public void quicksort(int[] array, int lowIndex, int highIndex) {
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        if (lowIndex >= highIndex) {
            return;
        }

        while (leftPointer < rightPointer) {
            while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        if (lowIndex < leftPointer - 1) {
            quicksort(array, lowIndex, leftPointer - 1);
        }
        if (highIndex > leftPointer + 1) {
            quicksort(array, leftPointer + 1, highIndex);
        }
    }

    public void quicksort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
