package com.company;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 1;
        System.out.println(ceilNumber(arr,target));
    }

    static int ceilNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[end]){
            System.out.println("Number greater than the target does not exist ");
            return arr[end];
        }

        while (start <= end){
            int mid = start + (end - start) /2;

            if(target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
