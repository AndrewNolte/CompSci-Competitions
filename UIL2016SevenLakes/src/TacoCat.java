
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
public class TacoCat {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("taco.in"));
        
        int runs = sc.nextInt();
        for(int i = 0; i < runs; i++){
            int m = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            int u = sc.nextInt();
            
            double mc = m/c;
            double eu = e/u;
            
            int max = (int)Math.min(mc,eu);
            
            System.out.println(max);

        }
     }
}
