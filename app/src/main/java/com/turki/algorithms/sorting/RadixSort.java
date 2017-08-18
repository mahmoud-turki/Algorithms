package com.turki.algorithms.sorting;

/**
 *
 * Analysis:
 * <p>
 * Best Ω(nk) - Average θ(nk) -	Worst O(nk).
 *
 * @author Turki Mahmoud
 */
public class RadixSort {

    public void radixSort(int array[]) {
        // TODO: Will be published on 19th, August, 2017
    }

    public static void main(String args[]) {

        RadixSort sort = new RadixSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.radixSort(arr);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
