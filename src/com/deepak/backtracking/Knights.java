package com.deepak.backtracking;

public class Knights {
    public static void main(String[] args) {
        knights(new boolean[4][4], 0 ,0, 4);
    }


    static void knights(boolean[][] board,int r,int c,int k){
        if(k == 0){
            display(board);
            return;
        }

        if(r == board.length -1 && c == board.length ){
            return;
        }

        if(c == board.length ){
            knights( board, r+1, 0, k);
            return;
        }

        if(isSafe(board,r,c)){
            board[r][c] = true;
            knights(board, r, c+1, k-1);
            board[r][c] = false;
        }

        knights(board, r, c+1, k);
    }

    static boolean isSafe(boolean[][] board, int r, int c){

        if(isValid(board, r-2, c-1)){
            if(board[r-2][c-1]){
                return false;
            }
        }

        if(isValid(board, r-2, c+1)){
            if(board[r-2][c+1]){
                return false;
            }
        }

        if(isValid(board, r-1, c-2)){
            if(board[r-1][c-2]){
                return false;
            }
        }

        if(isValid(board,r-1,c+2)){
            if(board[r-1][c+2]){
                return false;
            }
        }


        return isValid(board, r, c);
    }

    private static boolean isValid(boolean[][] board, int r, int c){

        if(r < board.length && c < board.length && r >= 0 && c >= 0){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] ) {
                    System.out.print(" K ");
                }else{
                    System.out.print(" - ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
