
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
 */
public class Dna {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(new File("dna.dat"));
        int numTimes = sc.nextInt();
        for (int iteration = 0; iteration < numTimes; iteration++) {
            String a = sc.nextLine();
            String b = sc.nextLine();
            System.out.println(minChanges(a,b));
            
            
            
        }
    }
    
    public static int mChanges(String tochange, String model){
        if(tochange.equals(model)){
            return 0;
        }
        int num = 0;
        for (int i = 0; i < tochange.length() && i < model.length(); i++) {
            if(tochange.charAt(i) == model.charAt(i)){
//                tochange = tochange.substring(i);
//                model = model.substring(i);
                continue;
            }
            
            if(matches(tochange.substring(i),model.substring(i)) > 1){
                
            }
            
        }
        return 0;
    }
    
    public static int matches(String a, String b){
        int n = 0;
        for (int i = 0; i < a.length() && i < b.length(); i++) {
            if(a.charAt(i) == b.charAt(i)){
                n++;
            }
            
        }
        return n;
    }
    
    public static int minChanges(String tochange, String model){
        if(tochange.equals(model)){
            return 0;
        }
        int num = 0;
        while(tochange.length() > model.length()){
            model+= "Z";
        }
        while(model.length() > tochange.length()){
            tochange+= " ";
        }
        for (int i = 0; i < tochange.length(); i++) {
            if(tochange.charAt(i) != model.charAt(i)){
                String ins = null;
                String subs = null;
                int nins = -1;
                int nsubs = -1;

                if(model.charAt(i)!='Z'){
                    ins = tochange.substring(0,i) + model.charAt(i) + tochange.substring(i, tochange.length());
                    subs = tochange.substring(0, i) + model.charAt(i) + tochange.substring(i + 1, tochange.length());
                nins =  minChanges(ins, model);
                 nsubs = minChanges(subs, model);
                
                }
                
               
                String del = null;
                if(i < tochange.length() && tochange.charAt(i+1) == model.charAt(i)){
                    del = tochange.substring(0,i) + tochange.substring(i+1, tochange.length());
                }
               
                //num = Math.min(nins, nsubs);
                if(del != null){
                    num = Math.min(num, minChanges(del, model));
                }
                
                break;
            }
            
        }
        return num;
        
    }
           
}
