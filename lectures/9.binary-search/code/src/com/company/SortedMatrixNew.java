package com.company;

import java.util.Arrays;

//My way of searching a number in a matrix

public class SortedMatrixNew {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  2,  3,  4,  5,  6,  7,  8,  9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36, 37, 38, 39, 40},
                {41, 42, 43, 44, 45, 46, 47, 48, 49, 50},
                {51, 52, 53, 54, 55, 56, 57, 58, 59, 60}
        };
        System.out.println(Arrays.toString(search(matrix,66)));
    }

    static int[] search(int[][] matrix, int target) {

        int col = matrix[0].length -1;
        int[] mid = {matrix.length/2,col/2};

        int rowStart;
        int rowEnd;

        if(target >  matrix[mid[0]][mid[1]]){
            rowStart = mid[0];
            rowEnd = matrix.length - 1;
        }else{
            rowStart = 0;
            rowEnd = mid[0];
        }
        while (rowStart <= rowEnd){
            if(target <= matrix[rowStart][col]){
                return binarySearch(matrix[rowStart],target,rowStart);
            }else{
                rowStart++;
            }
        }

        return new int[]{-1,-1};
    }
    static int[] binarySearch(int[] arr,int target,int row){
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
                return new int[]{row,mid};
            }
        }
        return new int[]{-1,-1};
    }
}
