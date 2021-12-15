package com.company;

public class Board {

   private Field[][] board;

   public Board(int m, int n) {
      initBoard(m,n);
   }

   private void initBoard(int m, int n) {
      Field[][] board = new Field[m][n];
      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[i].length; j++) {
            board[i][j] = Field.EMPTYSPACE;
         }
      }
      this.board = board;
   }


   public void printBoard(){

      for (int i = 0; i < board.length; i++) {
         for (int j = 0; j < board[i].length; j++) {
            System.out.print("_");
         }

      }

   }

   public boolean isFree(int x, int y){

      return false;

   }

   public void setNewValue(int x, int y, Field newValue){



      //TODO jestli není už obsazené

   }

   public void checkWin(int strike){



   }

}
