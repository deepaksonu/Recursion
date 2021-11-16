package com.deepak.recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    public static void main(String[] args) {
        System.out.println(diceList("",4));
        dice("", 4);

    }

    static void dice(String p, int up){
        if(up == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1 ; i <= up && i < 6  ; i++){
            dice(p+i,up-i);
        }
    }

    static List<String> diceList(String p ,int target){
        if(target == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> ans = new ArrayList<>();
        for(int i = 1 ; i < 6 && i <= target ; i++){
            ans.addAll(diceList(p+i, target-i));
        }
        return ans;
    }
}
