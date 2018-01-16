/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem53 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("PR53.dat"));
        int nump = sc.nextInt();
        for(int round = 0; round < nump; round++){
            int num = sc.nextInt();
//            while(isValid(num) == false){
//                char[] chars = String.valueOf(num).toCharArray();
//                boolean[] hasOne = new boolean[10];
//                for(int i = 0; i < 10; i++){
//                    char c = (char) i;
//                    if(hasOne[i]){
//                        chars[i] = i+1;
//                    }
//                }
//            }
        }

    }
}
