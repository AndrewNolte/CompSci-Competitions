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
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double input = sc.nextDouble();
            if(input <= 0 ){
                break;
            }
            int output = (int) (10000 / input);
            System.out.println((int)input + 
    " gallons per week will last " + output + " weeks");
        }
    }
}
