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
public class Problem24{

    
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for(int s = start; s <= end; s++){
            if(isSq(s)){
                System.out.println(s);
            }
        }
    }
    
    public static boolean isSq(int i){
        int r = (int)Math.sqrt(i);
        double r1 = (double) r;
        double r2 = Math.sqrt(i);
        if(r2-r1 == 0){
            return true;
        }else{
            return false;
        }
    }
}