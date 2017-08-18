package com.turki.algorithms.sorting;

/**
 * In java insertion sort, we compare the value at any index from all the prior elements until all the lesser values are found.
 * We place the value at the index before which there are no lesser values.
 * <p>
 * By doing this iteratively to the last index, we have a sorted array of integers.
 * <p>
 * Key points to note when writing insertion sort in java program:
 * 1- Start with 2nd element to the last element of the array, so use a for loop.
 * 2- Store the value into another variable to avoid it being lost when we change the index value in between.
 * 3- We need to keep changing the values until we are at 0th index or we found prior value to be greater,
 * so we can use a while loop for this.
 * <p>
 * <p>
 * <p>
 * Analysis:
 * <p>
 * Best Ω(n) - Average θ(n^2) - Worst O(n^2).
 *
 * @author Turki Mahmoud
 */
public class InsertionSort {

    public void insertionSort(int array[]) {
        int size = array.length;

        // Iterate One by one on unsorted sub-array
        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                // Swap the new minimum element with the current min element
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                j--;
            }
        }
    }


    public static void main(String args[]) {

        InsertionSort sort = new InsertionSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.insertionSort(arr);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
