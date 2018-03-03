
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542046
 */
public class prob11 {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("p11.txt"));

        int w = sc.nextInt();
        int h = sc.nextInt();
        
        int[][] arr = new int[w][h];
        
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if(sc.hasNextInt()){
                    int n = sc.nextInt();
                    if(n == 0){
                        n = -1;
                    }
                    arr[i][j] = sc.nextInt();
                }else{
                    arr[i][j] = 0;
                }                
            }
        }
        
        ArrayList<Integer> filler = new ArrayList<>();
        
        while(sc.hasNextInt()){
            filler.add(sc.nextInt());
        }
        
        int[][] modi = arr.clone();
        
        for (int i = 0; i < modi.length; i++) {
            for (int j = 0; j < modi[i].length; j++) {
                if(arr[i][j] == -1){
                    int n = arr[i][limit(j+1,0,h)];
                    int s = arr[i][limit(j-1,0,h)];
                    int e = arr[limit(i+1,0,w)][j];
                    int ww = arr[limit(i-1,0,w)][j];
                    
                    modi[i][j] = n + s + e + ww;
                }
            }
        }
        
       
        
        
    }
    
    public static int limit(int val, int low, int high){
        if(val > high)return high;
        if(val < low)return low;
        return val;
    }
}
