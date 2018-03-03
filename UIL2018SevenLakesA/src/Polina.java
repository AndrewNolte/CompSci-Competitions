
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s542046
 */
public class Polina {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("polina.dat"));
 

        while(sc.hasNext()){
            String mes = sc.next();
            String orig = mes;
            boolean isFirst = true;
            
            while(sc.hasNextInt()){
                int code = sc.nextInt();
                char[] cod = String.valueOf(code).toCharArray();
                char[] hex = Integer.toHexString(code).toCharArray();

                char[] m = mes.toCharArray();
                int s1;
                int s2;
                if((code / 100) % 2 == 0){
                    s1 = Character.digit(cod[1], 10);
                    s2 = Character.digit(cod[2], 10);
                }else{
                    s1 = mes.length() - Character.digit(cod[1], 10);
                    s2 = mes.length() - Character.digit(cod[2], 10);
                }
                
                char temp = m[s1];
                m[s1] = m[s2];
                m[s2] = temp;
                
                mes = String.valueOf(m);
                

                if(isFirst){
                    mes = "A" + mes + "AA";
                    isFirst = false;
                }
                
                mes = String.valueOf(hex[0]) + mes + String.valueOf(hex[2]);
            }
            System.out.print(orig + " ");
            System.out.println(mes);
        }
    }
}
