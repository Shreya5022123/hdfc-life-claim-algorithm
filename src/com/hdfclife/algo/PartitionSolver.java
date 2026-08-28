package com.hdfclife.algo;

public class PartitionSolver {

    // Time: O(n), Extra Space: O(1) besides the copy
    public static int[] partitionTwoPointer(int[] arr, int pivot) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            while (left <= right && arr[left] <= pivot) {
                left++;
            }

            while (left <= right && arr[right] > pivot) {
                right--;
            }

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return arr;
    }
}