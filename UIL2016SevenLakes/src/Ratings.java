
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
public class Ratings {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("ratings.in"));

        int runs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < runs; i++) {
            double s = sc.nextDouble();
            double answer = 2*(100-s)*Math.sin(Math.pow(Math.E,(s/4)))+s;
            System.out.printf("%.3f",answer);
            System.out.println();
            
        }
    }
            
    
}
