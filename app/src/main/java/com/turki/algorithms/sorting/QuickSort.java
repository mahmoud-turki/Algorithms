package com.turki.algorithms.sorting;

/**
 * Like Merge Sort, QuickSort is a Divide and Conquer algorithm.
 * It picks an element as pivot and partitions the given array around the picked pivot.
 * <p>
 * There are many different versions of quickSort that pick pivot in different ways.
 * 1- Always pick first element as pivot.
 * 2- Always pick last element as pivot (implemented below)
 * 3- Pick a random element as pivot.
 * 4- Pick median as pivot.
 * <p>
 * The key process in quickSort is partition().
 * Target of partitions is, given an array and an element x of array as pivot,
 * put x at its correct position in sorted array and put all smaller elements (smaller than x) before x,
 * and put all greater elements (greater than x) after x. All this should be done in linear time.
 * <p>
 * low  --> Starting index,  high  --> Ending index
 * quickSort(arr[], low, high)
 * {
 * if (low < high){
 * //pi is partitioning index, arr[p] is now at right place
 * pi = partition(arr, low, high);
 * quickSort(arr, low, pi - 1);  // Before pi
 * quickSort(arr, pi + 1, high); // After pi
 * }
 * }
 * Analysis:
 * <p>
 * Best Ω(n log(n)) - Average θ(n log(n)) - Worst O(n^2).
 *
 * @author Turki Mahmoud
 */
public class QuickSort {

    /**
     * @param array
     * @param low
     * @param high
     */
    public void quickSort(int array[], int low, int high) {

        if (low < high) {
            //pi is partitioning index, arr[pi] is now at right place
            int partitionIndex = partition(array, low, high);

            // Recursively sort elements before partition and after partition
            quickSort(array, low, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, high);
        }
    }


    /**
     * This function takes last element as pivot, places the pivot element at its correct position in sorted array,
     * and places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot.
     *
     * @param array
     * @param low
     * @param high
     * @return
     */
    private int partition(int array[], int low, int high) {
        int pivot = array[high];
        // index of smaller element
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++;

                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    public static void main(String args[]) {

        QuickSort sort = new QuickSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
