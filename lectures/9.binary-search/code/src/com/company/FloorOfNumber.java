package com.company;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 1;
        System.out.println(floorNumber(arr,target));
    }

    static int floorNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target < arr[start]){
            System.out.println("Number lesser than the target does not exist ");
            return 0;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
