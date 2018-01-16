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
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if(input.equals("========="))break;
            char[] a = input.toCharArray();
            
            if(getWinner(a,0,3,6))continue;
            if(getWinner(a,1,4,7))continue;
            if(getWinner(a,2,5,8))continue;
            if(getWinner(a,0,1,2))continue;
            if(getWinner(a,3,4,5))continue;
            if(getWinner(a,6,7,8))continue;
            if(getWinner(a,0,4,8))continue;
            if(getWinner(a,2,4,6))continue;
            printWinner(a,'d');

                        
        }
        
    }
    
    public static boolean getWinner(char[] a, int b, int c, int d){
        char winner = 'd'; //default
        if(checkSeries(a[b],a[c],a[d])){
            winner = a[b];
            a[b] = '$';
            a[c] = '$';
            a[d] = '$';
            printWinner(a, winner);
            return true;
        }
        return false;
    }
    public static boolean checkSeries(char a, char b, char c){
        return ((a == b) && (b==c)) && a != '=';
          
    }
    
    public static void printWinner(char[] arr, char winner){
        if(winner == 'd'){
            System.out.print("There was a tie.");
        }else{
            System.out.print("Player " + winner + " won.");
        }
        for(int i = 0; i < arr.length; i++){
            if(i % 3 == 0){
                System.out.println("");
            }
            System.out.print(arr[i]);
        }
        System.out.println("");
        System.out.println("");
    }
    
}
