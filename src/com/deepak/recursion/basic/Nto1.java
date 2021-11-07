package com.deepak.recursion.basic;

public class Nto1 {
    public static void main(String[] args) {
        onetoN(5);
        nto1(5);
    }

    static void nto1(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        nto1(n-1);
    }

    static void onetoN(int n){
        if(n == 0){
            return;
        }
        onetoN(n-1);
        System.out.println(n);
    }
}
