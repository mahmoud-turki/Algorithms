package com.turki.algorithms.sorting;

/**
 * In bubble sort, the array of integers is traversed from index 0 to length-1.
 * The value at 0th position is compared with value at 1st position and if the later is small, its swapped.
 * <p>
 * The comparison is moved from 0th index to length-1 index so that after first iteration,
 * the last index has the biggest value. Same process is repeated again from 0th to length-1 index.
 * <p>
 * After (length-1) iteration, array is sorted. In worst-case the complexity of bubble sort is O(n2)
 * and in best-case the complexity of bubble sort is Ω(n).
 * <p>
 * <p>
 * Analysis:
 * <p>
 * Best Ω(n) - Average θ(n^2) -	 Worst O(n^2).
 *
 * @author Turki Mahmoud
 */
public class BubbleSort {

    public void bubbleSort(int array[]) {
        int size = array.length;

        // Iterate One by one on unsorted sub-array
        for (int i = 0; i < size - 1; i++) {
            // Find the minimum element between two next elements
            for (int j = 0; j < size - i - 1; j++)
                if (array[j] > array[j + 1]) {
                    // Swap the new minimum element with the current min element
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        }
    }

    public static void main(String args[]) {

        BubbleSort sort = new BubbleSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.bubbleSort(arr);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
