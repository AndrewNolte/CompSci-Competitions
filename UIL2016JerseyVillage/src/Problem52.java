/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem52{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("PR52.dat"));
        
        String name = sc.nextLine();
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        
        double area = 2*Math.sqrt(Math.pow(width/2,2)+Math.pow(height,2))*width;
        double paint = area/450;
        int p = (int)Math.ceil(paint);
        
        System.out.print("PAINTING " + name + " WILL REQUIRE ");
        System.out.printf("%,d", p);
        System.out.println(" GALLONS OF PAINT");
    }
}
