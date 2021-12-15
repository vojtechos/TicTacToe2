package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Board board = initBoard();

        startGame(board);

    }

    public static Board initBoard() {

        System.out.println("Vítejte ve hře piškovorky.\nJako první si vyberte velikost hracího pole.");
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        return new Board(height, width);

    }

    public static void startGame(Board board){
        board.printBoard();
        System.out.println("PlayerX je na tahu");

        System.out.println("Vyber si x souřadnice");
        int xCoordinate = scanner.nextInt();
        System.out.println("Vyber si y souřadnice");
        int yCoordinate = scanner.nextInt();

        board.setNewValue(xCoordinate,yCoordinate,Field.TOOKBYPLAYERX);

    }


         /*
         public static void writer(){
         File file = new File("./test.txt");
         try{
         FileOutputStream outputStream1 = new FileOutputStream(file);
         FileWriter fileWriter = new FileWriter(file);
         fileWriter.write("Aaaahoj");
         fileWriter.flush();
         fileWriter.close();
         }
         catch (FileNotFoundException a){
         a.printStackTrace();
         } catch ( IOException a){
         a.printStackTrace();
         }
         }
         */

}
