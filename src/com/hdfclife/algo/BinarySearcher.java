package com.hdfclife.algo;

public class BinarySearcher {

    public static boolean binarySearch(int[] array, int target, int left, int right) {

        if (left > right) {
            return false;
        }

        int mid = left + (right - left) / 2;

        if (array[mid] == target) {
            return true;
        }

        if (target < array[mid]) {
            return binarySearch(array, target, left, mid - 1);
        }

        return binarySearch(array, target, mid + 1, right);
    }
}