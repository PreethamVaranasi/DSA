package com.company;

public class BinarySearch {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 48;
        System.out.println(binarySearch(arr,target));
    }
    static boolean binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;


        while (start <= end){
            mid =  start + (end - start) / 2;
            if(target > arr[mid]){
                start = mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
