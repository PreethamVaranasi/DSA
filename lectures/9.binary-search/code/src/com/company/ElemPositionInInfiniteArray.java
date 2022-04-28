package com.company;

public class ElemPositionInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9,10,12,13,14,18,20,22};
        int target = 3;
        // answer should be 9

        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        System.out.println(binarySearch(arr,target,start,end));
    }
    static int binarySearch(int[] arr, int target, int start, int end){
         while (start <  end){
             int mid = start + (end - start) /2;
             if(target > arr[mid]){
                 start = mid + 1;
             }else if(target < arr[mid]){
                 end = mid - 1;
             }else {
                 return mid;
             }
         }
        return -1;
    }

}
