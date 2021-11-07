package com.deepak.recursion.basic;

public class CountZeros {
    public static void main(String[] args) {

        System.out.println(countZeros(10202040));
    }

    static int countZeros(int n){
        return helper(n , 0);
    }

    static int helper(int n,int count){
        if(n%10 == n){
            return count;
        }

        if(n%10 == 0) count++;
        return helper(n/10,count);
    }
}
