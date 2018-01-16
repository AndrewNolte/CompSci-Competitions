/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            String one = sc.next();
            String two = sc.next();
            String three = sc.next();
            ArrayList<Character> output = new ArrayList<Character>();
            for(char c: one.toCharArray()){
                if(two.indexOf(c) != -1 && three.indexOf(c) != -1){
                    output.add(c);
                }
            }
            Collections.sort(output);
            for(char c: output){
                System.out.print(c);
            }
            System.out.println("");

        }
    }
}
