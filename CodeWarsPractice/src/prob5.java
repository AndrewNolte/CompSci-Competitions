
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
 * @author s542046
 * @time 10 mins
 */
public class prob5 {
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("pangram.txt"));

        mainloop:
        while(sc.hasNext()){
            String line = sc.nextLine().trim().toUpperCase();
            int[] chars = new int[26];
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if(Character.isAlphabetic(c)){
                    chars[c-65]++;
                }
            }
            boolean perfect = true;
            for(int c : chars){
                if(c == 0){
                    System.out.println("NEITHER: " + line);
                    continue mainloop;
                    
                }
                if(c > 1){
                    perfect = false;
                }
            }
            if(perfect){
                System.out.println("PERFECT: " + line);
            }else{
                System.out.println("PANGRAM: " + line);
            }
        }
    }
    
}
