package com.deepak.misc;

import java.util.Arrays;

public class TrapRainWater {

    public static void main(String[] args) {
        //int[] arr = {5,3,7,2,6,4,5,9,1,2};
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        //System.out.println(trapRainWater(arr));
        /**
         *                            5,3,7,2,6,4,5,9,1,2
         * tallest tower yet :        5,5,7,7,7,7,7,9,9,9
         * tallest tower in reverse : 9,9,9,9,9,9,9,9,2,2
         *                            0 2 0 5 1 3 2 0 1
         */
        System.out.println(findWater(arr));
        //peaks : 2,4,7,
    }

    static int findWater(int[] arr){
        int[] frontMax = new int[arr.length];
        int[] reverseMax = new int[arr.length];

        int fMax = 0;
        int rMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > fMax){
                frontMax[i] = arr[i];
                fMax = arr[i];
            }else{
                frontMax[i] = fMax;
            }

            if(arr[arr.length-1-i] > rMax){
                reverseMax[arr.length-1-i] = arr[arr.length-1-i];
                rMax = arr[arr.length-1-i];
            }else{
                reverseMax[arr.length-1-i] = rMax;
            }
        }
        System.out.println(Arrays.toString(frontMax));
        System.out.println(Arrays.toString(reverseMax));
        int water = 0;
        for (int i = 0; i < arr.length; i++) {

            int min = Math.min(frontMax[i],reverseMax[i]);

            if(arr[i] < min){
                water = water + min - arr[i];
            }
        }
        return water;
    }



}
