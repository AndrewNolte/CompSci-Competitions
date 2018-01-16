/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author S542046
 */
public class Problem9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int l = sc.nextInt();
            int w = sc.nextInt();
            int d = sc.nextInt();
            if(l == 0 && w == 0 && d == 0){
                break;
            }
            int volume = l * w * d;
            int notPainted = 0;
            if(l < 3 || w < 3 || d < 3){
                
            }else{
                notPainted = (l-2)*(w-2)*(d-2);
            }
            int painted = volume - notPainted;
            String answer = "";
            if(painted > notPainted){
                answer = "MORE than ";
            }else if(notPainted > painted){
                answer = "LESS than ";
            }
            System.out.println("A " + l + "x" + w + "x" + d + 
                    " block is " + answer + "PERFECT");

        }
    }
}
