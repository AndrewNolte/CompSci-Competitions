
import java.io.File;
import java.io.IOException;
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
public class huuuuuuuuge {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("huge.in"));

        while (sc.hasNext()) {
            String str = sc.nextLine();
            str = str.toLowerCase();
            int i = 0;
                while (i < str.length()){
                    char abc = str.charAt(i);
                    
                    if (abc == 'a' || abc == 'i' || abc == 'n' ||abc == 'd' || abc == 'u' 
                            || abc == 'o' || abc == 'r' || abc == 't' || abc == 's')System.out.print((char)(abc - 32));
                    else System.out.print(abc);
                
                i++;
                }
            System.out.println("");
        }
        }
    
}
