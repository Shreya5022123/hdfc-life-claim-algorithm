package com.hdfclife.algo;

import com.hdfclife.exception.InvalidWindowException;

public class SlidingWindowSolver {

    public static int maxSumOfSizeK(int[] array, int k) {

        if (k <= 0 || k > array.length) {
            throw new InvalidWindowException("Invalid window size: " + k);
        }
        int windowSum = 0;

        for (int i = 0; i < k; i++) {
            windowSum += array[i];
        }

        int maxSum = windowSum;

        for (int right = k; right < array.length; right++) {

            windowSum += array[right];
            windowSum -= array[right - k];

            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }
}