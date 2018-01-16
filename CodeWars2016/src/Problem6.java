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
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            double t = sc.nextDouble();
            double t0 = sc.nextDouble();
            double t1 = sc.nextDouble();
            double c0 = sc.nextDouble();
            double c1 = sc.nextDouble();
            double output = ((c1-c0)/(t1-t0))*(t-t0) + c0;
            System.out.println(((double)Math.round(output) / 8.0));
            
        }
        //y = (y2-y1 / x2 -x1)(x-x1) + y1
    }
}
