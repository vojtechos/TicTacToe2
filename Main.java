package com.company;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static int player = 2;

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

    public static void startGame(Board board) {
        board.printBoard();

        if (player % 2 == 0) {
            System.out.println("PlayerX je na tahu");
            boolean isOk;
            do {
                System.out.println("Vyber si x souřadnice");
                int xCoordinate = scanner.nextInt();
                System.out.println("Vyber si y souřadnice");
                int yCoordinate = scanner.nextInt();
                try {
                    board.setNewValue(xCoordinate, yCoordinate, Field.TOOKBYPLAYERX);
                    isOk = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Špatná pozice vybírej znovu");
                    isOk = false;
                }
            } while (!isOk);

            player++;
        }

        if (player % 2 == 1) {
            System.out.println("PlayerY je na tahu");
            boolean isOk;
            do {
                System.out.println("Vyber si x souřadnice");
                int xCoordinate = scanner.nextInt();
                System.out.println("Vyber si y souřadnice");
                int yCoordinate = scanner.nextInt();
                try {
                    board.setNewValue(xCoordinate, yCoordinate, Field.TOOKBYPLAYERX);
                    isOk = true;
                } catch (IllegalArgumentException e) {
                    System.out.println("Špatná pozice vybírej znovu");
                    isOk = false;
                }
            } while (!isOk);

            player++;
        }

        /**
         * Zařídit opakování
         */

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

    }}
