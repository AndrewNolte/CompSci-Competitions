/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem51 {
     public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("PR51.dat"));
        int num = sc.nextInt();
                      String whonum = sc.nextLine();
              int sum = 0;
        for(int i = 0; i < num; i++){
              while(whonum.contains("WHO")){
                  whonum.replace("WHO", "");
                  sum++;
              }
            
        }
        if(sum != 0){
            
              System.out.println(sum + " WHO'S");
        }else{
            System.out.println("AN OWL SAYS WHO");
        }
              
              String newwho = whonum.replace("WHO", "");
              System.out.println(newwho);
        }
     
      
    

}