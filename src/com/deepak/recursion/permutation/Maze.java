package com.deepak.recursion.permutation;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public static void main(String[] args) {

        boolean[][] maze = {
                {true, true,true},
                {true, false,true},
                {true, true,true},
        };
        pathWithRestrictions("", maze, 0,0);
        System.out.println(pathDiagList("",3,3));
        System.out.println(pathList("",3,3));
        path("",3,3);
    }

    static int count(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r, c-1);

        return left + right;
    }

    static void path(String p, int r, int c){
        if(r ==1 && c == 1){
            System.out.println(p);
            return;
        }
        if(r > 1){
            path(p+"D", r-1,c);
        }
        if(c > 1){
            path(p+"R", r, c-1);
        }
    }

    static List<String> pathList(String p ,int r, int c){
        if(r ==1 && c ==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String > ans = new ArrayList<>();

        if(r > 1){
            ans.addAll(pathList(p + "D", r-1,c));
        }
        if(c > 1){
            ans.addAll(pathList(p + "R", r,c-1));
        }

        return ans;
    }

    static List<String> pathDiagList(String p ,int r, int c){
        if(r ==1 && c ==1){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String > ans = new ArrayList<>();

        if(r > 1 && c >1){
            ans.addAll(pathDiagList(p+"d", r-1,c-1));
        }
        if(r > 1){
            ans.addAll(pathDiagList(p + "D", r-1,c));
        }
        if(c > 1){
            ans.addAll(pathDiagList(p + "R", r,c-1));
        }

        return ans;
    }

    static void pathWithRestrictions(String p, boolean[][] maze,int r, int c){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r < maze.length -1){
            pathWithRestrictions(p + "D", maze, r+1,c);
        }

        if(c < maze[0].length -1 ){
            pathWithRestrictions(p + "R", maze,r,c+1);
        }
    }
}
