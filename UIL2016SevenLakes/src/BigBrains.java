
import java.io.File;
import java.io.IOException;
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
public class BigBrains {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("brains.in"));
        
        int runs = sc.nextInt();
        for(int i = 0; i < runs; i++){
            double v = sc.nextDouble();
            
            
            int w = sc.nextInt();
            double[] volumes = new double[w];
            String[] names = new String[w];
            for(int j = 0; j < w; j++){
                names[j] = sc.next();
                volumes[j] = sc.nextDouble();
                if(volumes[j] >= v){
                    v = volumes[j]+1;
                }
            }
            System.out.printf("%.2f Stroud", v);
            System.out.println();
            for(int k = 0; k < w; k++){
                System.out.printf("%.2f" + names[k], volumes[k]);
                System.out.println();
            }
            
        }

    }
}
