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
public class Problem12 {
    static int rows;
    static int cols;
    static int cx;
    static int cy;
    static int x;
    static int y;
    static int level;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        cols = sc.nextInt();
        cx = cols/2;
        cy = rows/2;
        char[][] data = new char[rows][cols];
        for(int i = 0; i < rows; i++){
            data[i] = sc.nextLine().toCharArray();
        }
        int sx;
        int sy;
        level = 1;
        x = cx-level;
        y = cx-level;
        boolean isFirst = false;
        while(true){
            int initx = x;
            int inity = y;
            if(data[y][x] == ' '){
                rC();
                isFirst = true;
                if(initx == x && inity ==y){
                    level++;
                    x = cx-level;
                    y = cy-level;
                }
            }else{
                break;
            }
        }
       
        if(isFirst){
            sx = x;
            sy = y;
        }else{
            while(true && !isFirst){
            rCC();
            if(data[y][x] == ' '){
//                sx = prevx;
//                sy = prevy;
                break;
            }
            
        }
        }
        
        
    }
    public static void rC(){
        if(x == cx-level && y != cy-level){
            y--;
            return;
        }
        if(y == cy-level && x != cx+level){
            x++;
            return;
        }
        if(x == cx+level && y != cy+level){
            y++;
            return;
        }
        if(y == cy+level && x != cx-level){
            x--;
            return;
        }
    }
    public static void rCC(){
        if(x == cx-level && y != cy+level){
            y++;
            return;
        }
        if(y == cy+level && x != cx+level){
            x++;
            return;
        }
        if(x == cx+level && y != cy-level){
            y--;
            return;
        }
        if(y == cy-level && x != cx-level){
            x--;
            return;
        }
    }
        
}
