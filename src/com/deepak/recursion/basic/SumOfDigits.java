package com.deepak.recursion.basic;

public class SumOfDigits {
    public static void main(String[] args) {

        System.out.println(sumOFDigits(12345));
    }

    static int sumOFDigits(int n){
        if(n == 0){
            return 0;
        }

        return sumOFDigits(n/10) + n%10;
    }
}
