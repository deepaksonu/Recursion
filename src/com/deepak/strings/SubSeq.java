package com.deepak.strings;

import java.util.ArrayList;
import java.util.List;

public class SubSeq {

    public static void main(String[] args) {
        subSeq("","abc");
        System.out.println(subSeqList("", "abc"));

    }

    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }
        subSeq(p+up.charAt(0),up.substring(1));
        subSeq(p, up.substring(1));
    }

    static List<String> subSeqList(String p, String up){

        if(up.isEmpty()){
            List<String > list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> left = subSeqList(p + up.charAt(0), up.substring(1));
        List<String> right = subSeqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}
