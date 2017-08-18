package com.turki.algorithms.sorting;


/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order)
 * from unsorted part and putting it at the beginning.
 * The algorithm maintains two sub-arrays in a given array.
 * 1) The sub-array which is already sorted.
 * 2) Remaining sub-array which is unsorted.
 * <p>
 * In every iteration of selection sort, the minimum element (considering ascending order)
 * from the unsorted sub-array is picked and moved to the sorted sub-array.
 * <p>
 * Analysis:
 * <p>
 * Best Ω(n^2) - Average θ(n^2) - Worst O(n^2).
 *
 * @author Turki Mahmoud
 */
public class SelectionSort {

    public void selectionSort(int array[]) {
        int size = array.length;

        // Iterate One by one on unsorted sub-array
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted array
            for (int j = i + 1; j < size; j++)
                if (array[j] < array[minIndex])
                    minIndex = j;

            // Swap the new minimum element with the current min element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String args[]) {

        SelectionSort sort = new SelectionSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.selectionSort(arr);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }

}
