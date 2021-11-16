package com.deepak.recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class PermuteString {

    public static void main(String[] args) {
        //permute("","abc");
        System.out.println(permuteList("","abc"));

    }

    static void permute(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);;
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            permute(f+ch+l,up.substring(1));
        }
    }

    static List<String> permuteList(String p, String up){
        if(up.isEmpty()){
            List<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        List<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0,i);
            String l = p.substring(i,p.length());
            List<String> list = permuteList(f+ ch + l, up.substring(1));
            ans.addAll(list);
        }
        return ans;
    }
}
