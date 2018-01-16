/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            String word = sc.next();
            String format = "%" + String.valueOf(word.length()) + "s";
            String format2 = "%-" + String.valueOf(word.length()) + "s";
//int lines = word.length()-1;
            for(int k = 1; k <= word.length(); k++){
                System.out.printf(format,word.substring(0, k));
                System.out.println("");
            }
            for(int k = 1; k < word.length(); k++){
                System.out.printf(format2, word.substring(k));
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
