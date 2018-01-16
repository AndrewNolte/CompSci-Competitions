/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem055 {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("PR55.dat"));
        int num = sc.nextInt();
         for (int i = 0; i < num; i++) {
             int firsnum = sc.nextInt();
       String  binarystring=   Integer.toBinaryString(i);
       String r = binarystring.substring(0,8);
       String g = binarystring.substring(8,16);
       String b = binarystring.substring(16,24);
       int rvalue = Integer.parseInt(r);
             System.out.println(rvalue);

         }
             
    
             
         }
}