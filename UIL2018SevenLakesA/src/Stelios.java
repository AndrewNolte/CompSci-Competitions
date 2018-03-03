
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s542046
 */
public class Stelios {
    public static void main(String[] args) throws FileNotFoundException {
        
        
        Scanner sc = new Scanner(new File("stelios.dat"));
        while(sc.hasNextLine()){
            
            
            int num = sc.nextInt();
            char cur = 'A';
            
            Node[] map = new Node[num];
            
            char[] bet = new char[num];
            for (int i = 0; i < num; i++) {
                map[i] = new Node(cur);
                bet[i] = cur;
                cur++;
            }
            String al = String.valueOf(bet);
            
            for (int i = 0; i < num; i++) {
                char[] cs = sc.next().toCharArray();
                map[(al.indexOf(cs[0]))].addC(map[al.indexOf(cs[1])]);
                map[(al.indexOf(cs[1]))].addC(map[al.indexOf(cs[0])]);
                
            }
            
                
//            for(Node n : map){
//                System.out.println(n.toString());
//            }
            
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {

                    System.out.print(map[i].distTo(bet[j], new ArrayList<>()) + " ");
                }
                System.out.println("");
                //System.out.println("hello");
                
            }
            for (int i = 0; i < 2*num-1; i++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}


class Node{
    char name;
    ArrayList<Node> siblings = new ArrayList<>();
    
    public Node(char name){
        this.name = name;
    }
    
    //must be added to both sibling sets, unless a unidirectional path
    public void addC(Node n){
        siblings.add(n);
    }
    
    public int distTo(char n, ArrayList<Character> bl){
        if(name == n){
            return 0;
        }
        bl.add(name);
        int min = Integer.MAX_VALUE - 4;
        for(Node nod : siblings){
            //System.out.println(bl.contains(nod.name));
            if(!bl.contains(nod.name)){
                int cur = nod.distTo(n, (ArrayList<Character>)bl.clone());
                if(cur < min){
                    min = cur;
                }
            }
          
        }
        min++;
        //System.out.println(name + "'s closest dist to " + n + " is " + min);
        return min;
            
    }
    
    @Override
    public String toString(){
        String ans =  name + ": ";
        for(Node n : siblings){
            ans += " " + n.name;
        }
        return ans;
    }
}
