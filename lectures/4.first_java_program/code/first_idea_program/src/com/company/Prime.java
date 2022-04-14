package com.company;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number :");
        int n = input.nextInt();
        int c = 2;
        while (c * c <= n){
            if(n % c == 0){
                System.out.println("Input number is not prime");
                return;
            }
            c++;
        }
        System.out.println("Input number is prime");
    }
}
