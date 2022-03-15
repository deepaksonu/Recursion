package com.deepak.backtracking;

public class Sudoku {

    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if(sudoku(board)){
            display(board);
        }else{
            System.out.println("No Answer");
        }
    }

    static boolean sudoku(int[][] board){
        int row = -1;
        int col = -1;
        boolean hasEmpty = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j] == 0){
                    row = i;
                    col = j;
                    hasEmpty = true;
                    break;
                }
            }
            if(hasEmpty){
                break;
            }
        }
        if(!hasEmpty){
            return true;
        }

        for(int num = 1; num <= 9 ; num++){
            if(isSafe(board,row,col,num)){
                board[row][col] = num;
                if(sudoku(board)){
                    return true;
                }else{
                    board[row][col] = 0;
                }
            }
        }

        return false;

    }

    private static boolean isSafe(int[][] board, int row, int col, int num) {

        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num){
                return false;
            }
        }

        for (int i = 0; i < board.length; i++) {
            if(board[i][col] == num){
                return false;
            }
        }

        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row%sqrt;
        int colStart = col -col%sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart ; j < colStart + sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }

        }

        return true;
    }

    private static void display(int[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}