
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
public class A_Ten {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("a_ten.dat"));
        while(sc.hasNextInt() == true){

            int n = sc.nextInt();

            boolean isDone = false;

            int i = n-1;
            while(isDone == false){
                int sum = 1;
                for(int j = 2; j <= (i/2); j++){
                    if(i%j == 0){
                        sum+=j;
                    }
                }
                if(sum>i){
                    System.out.println(i);
                    isDone = true;
                }
                i--;
            }
        }
    }
}
