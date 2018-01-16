
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s542046
 */
public class A_Three {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("a_Three.dat"));

        while(sc.hasNextInt()){
            sc.nextInt();
            int p = sc.nextInt();
            ArrayList<Integer> s = new ArrayList<Integer>();
            int pre = 0;

            for(int i = 0; i < p; i++){
                int pos = sc.nextInt();
                s.add((pos-pre)-1);
                pre = pos;
            }
            for(int i = 1; i <= 5; i++){
                int sum = 0;
                for(int j = 0; j < s.size(); j++){
                    
                    if(s.get(j) >= i){
                        sum++;
                    }
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }

    }

}
