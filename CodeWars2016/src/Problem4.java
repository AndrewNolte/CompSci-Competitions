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
public class Problem4 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double base = sc.nextDouble();
            int power = sc.nextInt();
            if(base == 0 && power == 0){
                break;
            }
            double output = base * Math.pow(10, (double)power);
            System.out.printf("%.2f", output);
            System.out.println("");
        }
    }
    
}
