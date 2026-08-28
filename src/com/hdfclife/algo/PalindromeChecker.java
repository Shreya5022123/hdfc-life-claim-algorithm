package com.hdfclife.algo;

import java.util.Arrays;
 public class PalindromeChecker {
            public static boolean isPalindrome(int num) {
                String number = String.valueOf(num);
                char[] digits = number.toCharArray();
                int i = 0, j = digits.length - 1;
                while (i < j) {
                    if (digits[i] != digits[j]) {
                        return false;
                    }
                    i++;
                    j--;
                }
                return true;

            }
 }