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
               System.out.print("| _ ");
         }
         System.out.println("|");
      }

   }

   public boolean isFree(int x, int y){
      return board[x][y] == Field.EMPTYSPACE;
   }

   public void setNewValue(int x, int y, Field newValue){
      if(x < 0 || x >= board.length || y < 0 || y > board[0].length || !isFree(x, y)){
         throw new IllegalArgumentException("Spatna pozice");
      }

      this.board[x][y] = newValue;

   }

   public void checkWin(int strike){



   }

}
