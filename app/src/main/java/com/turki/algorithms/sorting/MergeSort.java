package com.turki.algorithms.sorting;

/**
 *
 * Analysis:
 * <p>
 * Best Ω(n log(n)) - Average θ(n log(n)) - Worst O(n log(n)).
 *
 * @author Turki Mahmoud
 */
public class MergeSort {

    public void mergeSort(int array[]) {
        // TODO: Will be published on 19th, August, 2017
    }

    public static void main(String args[]) {

        MergeSort sort = new MergeSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.mergeSort(arr);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
