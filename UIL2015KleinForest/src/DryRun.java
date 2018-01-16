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
public class DryRun {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(new File("dryrun.dat"));
        int loop = scan.nextInt();
        for(int i = 0; i < loop; i++){
            System.out.println("I like " + scan.next() + ".");
        }
    }

}
