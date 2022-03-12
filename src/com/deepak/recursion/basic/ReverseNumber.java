package com.deepak.recursion.basic;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(Math.log10(1234));
        System.out.println(reverse(1234));
        System.out.println(isPallindrome(1234));
        System.out.println(reverseNum(1234,0));
    }

    static int reverse(int n){
        int digits = (int) (Math.log10(n) + 1);

        return helper(n , digits);
    }

    static int helper(int n, int digits){
        if(n%10 == n){
            return n;
        }

        return (int) ((n%10) * Math.pow(10,digits -1 ) + helper(n/10, digits -1));
    }

    static int reverseNum(int n,int revN){
        if(n ==0) return revN;

        return reverseNum(n/10, revN*10 + n%10);
    }
    static boolean isPallindrome(int n){
        return n == reverse(n);
    }
}
