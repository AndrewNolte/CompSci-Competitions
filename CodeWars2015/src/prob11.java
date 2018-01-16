/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class prob11 {
    
    static char[][] data;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int size = sc.nextInt();
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            data = new char[rows][cols];
            for(int r = 0; r < rows; r++){
                for(int c = 0; c < cols; c++){
                    data[r][c] = '#';
                }
            }
            for(int r = 0; r < rows; r+= size){
                for(int c = 0; c < cols; c+=size){
                    putDiamond(r,c,size);
                }
            }

        }
        

    }
    public static void putDiamond(int r, int c, int size){
        int startpos = c + size/2;
        int endpos = c + size/2 + 1;
        for(int row = r; row < size; row++){
            //for(int 
        }
    }
        
    
}
