
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
 * @time   
 */
public class prob05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("p05.txt"));

       // char[] chars = {'a','b','g','d','e','#','z','y','h','i','k','l','m','n','x','o','p','q','r','s','t','u','f','c','$','w','3'};
        String charss = "abgde#zyhiklmnxopqrstufc$w3";
        int[] vals = {1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100,200,300,400,500,600,700,800,900};
        while(sc.hasNext()){
            char[] s = sc.next().toLowerCase().toCharArray();
            if(s[0] == '.'){
                break;
            }
            int total = 0;
            for(char c : s){
                int i = charss.indexOf(String.valueOf(c));
                if(i != -1){
                    total+= vals[i];
                }
                    
            }
            System.out.println(total);
        }
    }

    
}
