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
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            String output = "hates";
            String input = sc.next();
            char prevChar = '$';
            for(char c: input.toCharArray()){
                if(c == prevChar){
                    output = "likes";
                    break;
                }
                prevChar = c;
            }
            System.out.println(output + " " + input);
            
        }
    }
}
