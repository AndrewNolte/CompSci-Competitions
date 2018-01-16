
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 * time = 4:36
 */
public class Harmonic {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("harmonic.dat"));
        int numTimes = sc.nextInt();
        for (int iteration = 0; iteration < numTimes; iteration++) {
            
            int num = sc.nextInt();
            double sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += 1.0/i;
            }
            System.out.printf("%.3f", sum);
            System.out.println("");
                 
        }
    }
           
}
