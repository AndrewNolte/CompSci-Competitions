
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s542046
 */
public class prob13 {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("p13.txt"));
        int len = sc.nextInt();
        char[] chars = new char[len];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = sc.next().toUpperCase().charAt(0);
        }
        int[][] options = nPickr(len, 5);
        
        char[][] choices = new char[options.length][5];
        for (int i = 0; i < choices.length; i++) {
            for (int j = 0; j < choices[i].length; j++) {
                choices[i][j] = chars[options[i][j]];
            }
        }
        
        TreeSet<String> ans = new TreeSet<>();
        for (int i = 0; i < choices.length; i++) {
            ans.add(String.valueOf(choices[i]));
        }
        
        Iterator<String> i = ans.iterator();
        ArrayList<String> answer = new ArrayList<>();
        while(i.hasNext()){
            answer.add(i.next());
        }
        
        
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            System.out.println(n + ": " + answer.get(n-1));
            
            //System.out.println(n + ": " + ans.);
            
        }

    }
    

    
    
    
    /*
    get the a set of possible combinations of a integer array of length length
    */
    public static int[][] combos(int length){
        if(length == 1){
            return new int[][]{new int[]{0}};
        }
        int[][] ans = new int[factorial(length)][length];

        int[][] subans = combos(length-1); 
        //get the combo set that is inside this one that
        //will repeat similarly length times
        
        //go through each time the subset will repeat
        for(int i = 0; i < length; i++){
            //go through the subset for this beginning number
            for (int j = 0; j < subans.length; j++) {
                ans[j + i * subans.length][0] = i;  //set the first num to this new sets num
                for (int k = 0; k < length - 1; k++) { //fill in subset
                    int sub = subans[j][k];
                    if(sub >= i){
                        ans[j + i * subans.length][k + 1] = sub + 1;
                    }else{
                        ans[j + i * subans.length][k + 1] = sub;
                    }
                }
            }
        }
        return ans;
    }
    
    //order matters!
    public static int[][] nPickr(int n, int r){
        int len = 1;
        for (int i = n; i > (n-r); i--) {
            len *= i;
        }
        int[][] ans = new int[len][r];
        
        int[][] chosen = nChooser(n,r);
        int[][] combs = combos(r);

        //iterate over the different chosen sets
        for (int i = 0; i < chosen.length; i++) {
            int[] arr = chosen[i];  //the current set of numbers
            
            //iterate over the differnt combos
            for (int j = 0; j < combs.length; j++) {
                int[] curcomb = combs[j];   //the current ordering
                
                for (int k = 0; k < r; k++) {
                    ans[i * combs.length + j][k] = arr[curcomb[k]];
                }
            }
        }
        
        return ans;
    }
    
    public static void printArr(int[][] arr){
        for (int[] an : arr) {
            System.out.println(Arrays.toString(an));
        }
    }
    
    
    public static int[][] nChooser(int n, int r) {
        //find the length
        int big = Math.max(r, n - r);
        int small = Math.min(r, n - r);
        int len = 1;
        for (int i = n; i > big; i--) {
            len *= i;
        }
        len /= factorial(small);
        
        //construct bounds, answer, and current list
        int[][] ans = new int[len][r];
        int[] bases = new int[r];
        int[] roofs = new int[r];
        for (int i = 0; i < r; i++) {
            bases[i] = i;
            roofs[r - 1 - i] = n - 1 - i;
        }
        int[] cur = bases.clone();
        
        //solve
        int i = 0;
        while (i < len) {
            ans[i] = cur.clone();
            boolean carry = true;
            for (int j = r - 1; (j >= 0) && carry; j--) {       //add 1, starting all the way at the right
                cur[j]++;
                if (cur[j] > roofs[j]) {
                    carry = true;
                } else {
                    carry = false;
                    for (int k = 1; k + j < cur.length; k++) {  //reset nums to the right
                        cur[k+j] = cur[j] + k;
                    }
                }
            }
            i++;
        }
        return ans;
    }
    
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }


    
}
