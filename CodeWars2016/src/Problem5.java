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
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        for(int i = 0; i < times; i++){
            int mod = sc.nextInt();
            int removed = 0;
            String s = sc.next();
            for(int k = 0; k < s.length(); k++){
                if(k % mod == 0){
                    removed++;
                    continue;
                }
                System.out.print(s.charAt(k));
            }
            System.out.println(" " + (s.length() - removed));
        }
    }
}
