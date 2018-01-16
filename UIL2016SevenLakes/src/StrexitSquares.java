
import java.io.File;
import java.io.IOException;
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
public class StrexitSquares {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("squares.in"));

        int runs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < runs; i++) {
            boolean isLeaving = true;
            int s = sc.nextInt();
            int[][] mat = new int[s][s];
            for (int r = 0; r < s; r++) {
                for (int c = 0; c < s; c++) {
                    mat[r][c] = sc.nextInt();
                }
            }

            int sum = 0;
            for (int k = 0; k < s; k++) {
                sum += mat[0][k];
            }
            for (int k = 0; k < s; k++) {
                int rsum = 0;
                for (int j = 0; j < s; j++) {
                    rsum += mat[k][j];
                }
                if (rsum != sum) {
                    isLeaving = false;
                }
            }
            for (int j = 0; j < s; j++) {
                int rsum = 0;
                for (int k = 0; k < s; k++) {
                    rsum += mat[k][j];
                }
                if (rsum != sum) {
                    isLeaving = false;
                }
            }
            
            
            int nsum = 0;
            for (int x = 0; x < s; x++) {
                nsum += mat[x][x];
            }
            if (nsum != sum) {
                isLeaving = false;
            }
            
            int wsum = 0;
            for (int x = 0; x < s; x++) {
                wsum += mat[x][s-1-x];
            }
            if (wsum != sum) {
                isLeaving = false;
            }
            
            if(isLeaving == true){
                System.out.println("Stroudonia First");
            }else{
                System.out.println("United in Diversity");
            }

        }

    }
}
