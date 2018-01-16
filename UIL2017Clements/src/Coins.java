
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 * time = 11:44
 */
public class Coins {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("coins.dat"));
        int numTimes = sc.nextInt();
        for (int iteration = 0; iteration < numTimes; iteration++) {
            
            int numDems = sc.nextInt();
            ArrayList<Integer> types = new ArrayList();
            for (int i = 0; i < numDems; i++) {
                types.add(sc.nextInt());
              
            
            }
            Collections.sort(types);
            int tot = 0;
            int target = sc.nextInt();
            int cur = types.size()-1;
            int numCoins = 0;
            String print = "";
            while(tot < target && cur >= 0){
                if(tot + types.get(cur) <= target){
                    tot += types.get(cur);
                    print += types.get(cur) + " ";
                    numCoins++;
                }else{
                    cur--;
                }
            }
            System.out.println("Minimum Coins: " + numCoins);
            System.out.println(print);
            
        }
    }
    

           
}
