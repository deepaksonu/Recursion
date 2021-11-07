package com.deepak.recursion.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Find {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,9,9,15,10,16,9,23};
        int target = 9;
        System.out.println(find(arr,target, 0));
        System.out.println(findAll(arr, target, 0));
    }

    static int find(int[] arr, int target, int i){
        if (i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }else{
            return find(arr,target, i+1);
        }
    }
    static List<Integer> findAll(int[] arr, int target, int index){
        List<Integer> tempList = new ArrayList<>();
        if(index == arr.length){
            return tempList;
        }
        if(arr[index] == target){
            tempList.add(index);
        }

        List<Integer> list = findAll(arr,target,index + 1);
        list.addAll(tempList);
        return list;
    }
}
