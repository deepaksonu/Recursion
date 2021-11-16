package com.deepak.strings;

public class SkipChar {

    public static void main(String[] args) {

        String str =  "baaccapplecab";
        skip("",str);
        System.out.println(skip(str));
        System.out.println(skipApple(str));

    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        if(up.charAt(0) == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+up.charAt(0), up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.charAt(0) == 'a'){
            return skip(up.substring(1));
        }else{
            return up.charAt(0) + skip( up.substring(1));
        }

    }

    static String skipApple(String str){
        if(str.isEmpty()) {
            return "";
        }

        if(str.startsWith("apple")){
            return skipApple(str.substring("apple".length()));
        }else
            return str.charAt(0) + skipApple(str.substring(1));

    }
}
