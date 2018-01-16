
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
 * 
 * time = 3:20
 */
public class Factorial {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("factorial.dat"));
        
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            int num = sc.nextInt();
            factorial(num);
            System.out.println();
        }
        
    }
    
    public static void factorial(int num){
        if(num < 2){
            System.out.print(1);
        }else{
            System.out.print(num + "x");
            factorial(num-1);
        }
    }
    
}
