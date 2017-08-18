package com.turki.algorithms.sorting;

/**
 * Like QuickSort, Merge Sort is a Divide and Conquer algorithm. It divides input array in two halves,
 * calls itself for the two halves and then merges the two sorted halves.
 * <p>
 * The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that assumes
 * that arr[l..m] and arr[m+1..r] are sorted and merges the two sorted sub-arrays into one.
 * <p>
 * <p>
 * MergeSort(arr[], l,  r)
 * If r > l
 * 1. Find the middle point to divide the array into two halves:
 * middle m = (l+r)/2
 * 2. Call mergeSort for first half:
 * Call mergeSort(arr, l, m)
 * 3. Call mergeSort for second half:
 * Call mergeSort(arr, m+1, r)
 * 4. Merge the two halves sorted in step 2 and 3:
 * Call merge(arr, l, m, r)
 * <p>
 * <p>
 * Analysis:
 * <p>
 * Best Ω(n log(n)) - Average θ(n log(n)) - Worst O(n log(n)).
 *
 * @author Turki Mahmoud
 */
public class MergeSort {

    /**
     * @param array
     * @param low
     * @param high
     */
    public void mergeSort(int array[], int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergeSort(array, low, middle);
            // Sort the right side of the array
            mergeSort(array, middle + 1, high);
            // Combine them both
            merge(array, low, middle, high);
        }
    }

    /**
     * @param array
     * @param low
     * @param middle
     * @param high
     */
    private void merge(int array[], int low, int middle, int high) {
        int helper[] = new int[array.length];

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }

        int i = low, j = middle + 1, k = low;

        // Copy the smallest values from either the left or the right side back to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side are already at the right position.

    }


    public static void main(String args[]) {

        MergeSort sort = new MergeSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.mergeSort(arr, 0, arr.length-1);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
