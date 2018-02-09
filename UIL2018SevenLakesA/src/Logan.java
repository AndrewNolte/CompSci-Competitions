
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Andrew
 */
public class Logan {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("input.dat"));
        int numTimes = sc.nextInt();
        for (int iteration = 0; iteration < numTimes; iteration++) {

            int capacity = sc.nextInt();

            int numTimes2 = sc.nextInt();

            for (int iteration2 = 0; iteration2 < numTimes2; iteration2++) {

            }
        }
        int[][] ans = nChooser(9,4);
        for (int[] an : ans) {
            System.out.println(Arrays.toString(an));
        }

    }

    class Bag {

        int val;
        int w;
        String color;

        public Bag(int val, int w, String color) {
            this.val = val;
            this.w = w;
            this.color = color;
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

    //works for ints on the range [0, inf)
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}
