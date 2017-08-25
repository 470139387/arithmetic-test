package com.arithmetic;

public class ReverseStackByRecursion {
    
    public static long total(int n){
        if(1 == n){
            return 1;
        }else {
            System.err.println("ddd");
            return total(n-1)+n;
        }
        
    }
    public static void main(String[] args ) {
        System.err.println("=="+total(3));
    }
}
