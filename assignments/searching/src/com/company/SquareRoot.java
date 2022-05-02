package com.company;
// https://leetcode.com/problems/sqrtx/
public class SquareRoot {

    public static void main(String[] args) {
	    int input = 2147395599;
        System.out.println(findSquareRoot(input));
    }

    private static int findSquareRoot(int input) {
        if(input <= 1){
            return input;
        }
        int start = 1;
        int end = input / 2;

        while(start <= end){
            int mid = start + (end -start) / 2;
            long temp = (long)mid * (long)mid;

            if(temp == input){
                return mid;
            }

            if (temp > input){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
