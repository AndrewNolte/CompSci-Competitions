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
public class Problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            double aa = sc.nextDouble();
            double bb = sc.nextDouble();
            double cc = sc.nextDouble();
            if(aa == 0 && bb == 0 && cc == 0)break;
            
            double a = 1/(Math.sqrt(aa));
            double b = 1/(Math.sqrt(bb));
            double c = 1/(Math.sqrt(cc));
            for(int x = -100; x <= 100; x++){
                for(int y = -100; y <= 100; y++){
                    double la = dist(x,y,0,100);
                    double lb = dist(x,y,-100,-100);
                    double lc = dist(x,y,100,-100);
                    if(checkRatios(la,lb,lc,a,b,c)){
                        System.out.println(x + " " + y);
                    }

                }
            }

        }
    }
    public static boolean checkRatios(double la, double lb, double lc,
                                        double a, double b, double c){
        double r1 = la / a;
        double r2 = lb / b;
        double r3 = lc / c;
        if(Math.abs(r1 - r2) < .1 && Math.abs(r2-r3) < .1){
            return true;
        }else{
            return false;
        }
    }
    public static double dist(int x1, int y1,int x2, int y2){
        return(Math.hypot((double)(x2-x1), (double)(y2-y1)));
    }
}
