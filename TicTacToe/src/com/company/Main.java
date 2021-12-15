package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        Board board = new Board(5,4);

    }

    public void Message() {

        System.out.println("Vítejte");

    }
        /**public static void writer(){
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
         **/

}
