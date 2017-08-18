package com.turki.algorithms.sorting;

/**
 *
 * Analysis:
 * <p>
 * Best Ω(n log(n)) - Average θ(n log(n)) - Worst O(n^2).
 *
 * @author Turki Mahmoud
 */
public class QuickSort {

    public void quickSort(int array[]) {
        // TODO: Will be published on 19th, August, 2017
    }

    public static void main(String args[]) {

        QuickSort sort = new QuickSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.quickSort(arr);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
