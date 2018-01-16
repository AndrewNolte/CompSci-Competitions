
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s542046
 */
public class A_Nine {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("a_nine.dat"));
        int runs = scan.nextInt();
        for(int i = 0; i < runs; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.print(a+b + " ");

            System.out.print(Math.abs((a-b))+ " ");

            System.out.print(a*b+ " ");

            System.out.printf("%.2f%n",(double)Math.max(a, b)/(double)Math.min(a, b));
        }
        

    }
}
