package com.deepak.recursion.basic;

/**
 *
 0 1 2 3  4  5  6  7
 arr = 1 2 3 44 56 67 86 98
 target = 86

 static int binarySearch(int[] arr,int target,int s,int e){
 if(s > e){
 return -1;
 }

 int mid = s + (e-s)/2;
 if(target < arr[mid]){
 return binarySearch(arr,target,s,mid-1);
 }else if(target > arr[mid]){
 return binarySearch(arr,target,mid+1,e);
 }else
 return mid;

 }

 target = 86
 -> arr,86,0,7 ; m = 4
 -> arr,86,5,7 ; m = 6
 return 6

 target =2
 -> arr,2,0,7 ; m = 4
 -> arr,2,0,3 ; m = 2
 -> arr,2,0,1 ; m = 1
 return 1

 target = 98
 -> arr,98,0,7 ; m = 4
 -> arr,98,5,7 ; m = 6
 return 6

 target = 102
 -> arr,102,0,7 ; m = 4
 -> arr,102,5,7 ; m = 6
 -> arr,102,7,7 ; m = 7
 -> arr,102,8,7 ;
 return -1

 target =1
 -> arr,1,0,7 ; m = 4
 -> arr,1,0,3 ; m = 2
 -> arr,1,0,1 ; m = 1
 -> arr,1,0,0 ;
 return 0

 */
public class BinarySearch  {

    public static void main(String[] args) {
        int[] arr = {1,2,3,44,56, 78,86};
        System.out.println(arr.length);
        int target = 86;
        System.out.println(search(arr,target,0, arr.length-1));
    }

    static int search(int[] arr,int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }

        if(arr[m] < target){
            return search(arr, target, m+1, e);
        }
        else {
            return search(arr, target, s, m-1);
        }
    }

}

