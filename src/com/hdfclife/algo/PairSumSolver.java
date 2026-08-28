package com.hdfclife.algo;

import com.hdfclife.exception.PairNotFoundException;

import java.util.Arrays;

public class PairSumSolver {
    public static int[] findPairBruteForce(int[] array,int target){
        int[] result=new int[2];
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if((array[i]+array[j])==target){
                    result[0]=array[i];
                    result[1]=array[j];
                    return result;
                }

            }
        }
            throw new PairNotFoundException("No pair sum could produce the target");
    }

    public static int[] findPairTwoPointer(int[] array,int target){
        int[] newArr=new int[array.length];
        for(int i=0;i<array.length;i++){
            newArr[i]=array[i];
        }
        Arrays.sort(newArr);
        int[] result=new int[2];
        int i=0,j=newArr.length-1;

        while(i<j){
            int sum=newArr[i]+newArr[j];
            if(sum==target){
                result[0]=newArr[i];
                result[1]=newArr[j];
                return result;
            } else if (sum<target) {
                i++;
            }
            else{
                j--;
            }
        }
        throw new PairNotFoundException("No pair sum could produce the target");
    }


}
