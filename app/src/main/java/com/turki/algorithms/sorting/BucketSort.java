package com.turki.algorithms.sorting;

/**
 *
 * Analysis:
 * <p>
 * Best Ω(n+k) - Average θ(n+k) - Worst O(n^2).
 *
 * @author Turki Mahmoud
 */
public class BucketSort {

    public void bucketSort(int array[]) {
        // TODO: Will be published on 19th, August, 2017
    }

    public static void main(String args[]) {

        BucketSort sort = new BucketSort();
        int arr[] = {5, 1, 3, 2, 4};
        sort.bucketSort(arr);
        System.out.println("Sorted array");
        for (int x : arr) {
            System.out.println(x);
        }
    }
}
