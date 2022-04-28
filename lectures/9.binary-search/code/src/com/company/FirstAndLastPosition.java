package com.company;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 4;
        int[] ans = {-1,-1};
        ans[0] = searchIndex(arr,target,false);
        ans[1] = searchIndex(arr,target,true);
        System.out.println(Arrays.toString(ans));
    }
    static int searchIndex(int[] arr, int target, boolean isForward){
        int start = 0;
        int end = arr.length - 1;
        int ansIndex = -1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                ansIndex = mid;
                if(isForward){
                    start = mid + 1;
                }else {
                    end = mid - 1;
                }
            }
        }
        return ansIndex;
    }
}
