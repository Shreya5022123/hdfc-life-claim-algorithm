import com.hdfclife.algo.*;
import com.hdfclife.exception.InvalidIndexException;
import com.hdfclife.exception.PairNotFoundException;
import com.hdfclife.store.ClaimAmountStore;

import java.util.Arrays;

public class Main{
    static void main(String[] args) {
        ClaimAmountStore store=new ClaimAmountStore();
        store.add(25000);
        store.add(18000);
        store.add(42000);
        store.add(15000);
        store.add(31000);
        store.add(9000);

        int[] seed =store.toArray();
        System.out.println(Arrays.toString(seed));

        int shiftCount=store.insert(2,22000);
        System.out.println(Arrays.toString(store.toArray()));
        System.out.println(shiftCount);

        store.delete(2);
        System.out.println(Arrays.toString(store.toArray()));


        System.out.println(Arrays.toString(PairSumSolver.findPairBruteForce(seed,57000)));
        System.out.println(Arrays.toString(PairSumSolver.findPairTwoPointer(seed,57000)));

        System.out.println(PalindromeChecker.isPalindrome(12321));
        System.out.println(PalindromeChecker.isPalindrome(18500));

        int[] partitionArray = Arrays.copyOf(seed, seed.length);

        int[] partitioned =
                PartitionSolver.partitionTwoPointer(partitionArray, 20000);

        System.out.println(Arrays.toString(partitioned));


        System.out.println(
                SlidingWindowSolver.maxSumOfSizeK(seed, 3)
        );

        System.out.println(
                UniqueSubstringSolver.longestUniqueSubstring("TERMULIPTERM")
        );

        int[] sortedSeed = Arrays.copyOf(seed, seed.length);
        Arrays.sort(sortedSeed);



        boolean found = BinarySearcher.binarySearch(
                sortedSeed,
                15000,
                0,
                sortedSeed.length - 1
        );

        System.out.println(found ? "found" : "not found");


        boolean notFound = BinarySearcher.binarySearch(
                sortedSeed,
                999,
                0,
                sortedSeed.length - 1
        );

        System.out.println(notFound ? "found" : "not found");

//exceptions
        try{
            store.insert(99,1);
        }
        catch (InvalidIndexException e){
            System.out.println(e.getMessage());
        }

        try {
            PairSumSolver.findPairBruteForce(seed, 1);

        } catch (PairNotFoundException e) {

            // 15. Caught pair-not-found message
            System.out.println(e.getMessage());
        }
    }
 }
