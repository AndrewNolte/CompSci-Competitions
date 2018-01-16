
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrew
 * 
 * achieved answer of 180 at around an hour
 * still don't think the answer is 120 after another hour
 */
public class Tree {
    
    public static void main(String[] args) throws FileNotFoundException {
//        System.out.println(getPos(1).size());
//        System.out.println(getPos(2).size());
//        System.out.println(getPos(3).size());
//        System.out.println(getPos(4).size());
//        
//        for(String s : getPos(3)){
//            System.out.println(s);
//        }

        Scanner sc = new Scanner(new File("tree.dat"));
        int numTimes = sc.nextInt();

        for (int iteration = 0; iteration < numTimes; iteration++) {

            int numt = sc.nextInt();
            sc.nextInt();
            Node root = new Node(0,-1);

            for (int i = 1; i < numt; i++) {
                int parent = sc.nextInt();
                if(parent == 0){
                    root.addChild(new Node(i, parent));
                }else{
                    root.findChild(parent).addChild(new Node(i, parent));

                }
            }
            System.out.println(root.getRootPossiblities());

        }
    }
    
    public static class Node{
        ArrayList<Node> children = new ArrayList();
        
        int pos;
        int par;
        
        public Node(int pos, int par){
            System.out.println("Addding Node(" + pos + ", " + par + ")");
            this.par = par;
            this.pos = pos;
        }
        
        
        public void addChild(Node n){
            children.add(n);
        }
        
        public Node findChild(int posit){
            //System.out.println("Attempting find of " + posit);
            for(Node n : children){
              if(n.pos == posit){
                  return n;
              }
            }
            for(Node n: children){
                Node nod = n.findChild(posit);
                if(nod != null){
                    return nod;
                }
            }
            return null;
        }
        
        public int getRootPossiblities(){
            if(children.size() == 0){
                return 2;
            }
            int total =  getPos(children.size()).size();
            for(Node n : children){
                total *= n.getRootPossiblities();
                total/=2;
            }
            total*=2;
            System.out.println(this.toString() + " has " + total + " possibilities");
            return total;
        }
        
        @Override
        public String toString(){
            return "Node(pos: " + pos + ", par: " + par + ")";
        }
    }
    
    
    //black is 0, white is 1
    public static ArrayList<String> getPos(int n){
        ArrayList<String> whites;
        if(n < 2){
            whites = new ArrayList();
            whites.add("0");
            whites.add("1");
            return whites;
        }else{
            whites = getPos(n-1);
        }
        ArrayList<String> blacks = (ArrayList<String>)whites.clone();
        for (int i = 0; i < whites.size(); i++) {
            whites.set(i, "1" + whites.get(i));
        }
        for (int i = 0; i < blacks.size(); i++) {
            
            if(blacks.get(i).charAt(0) == '0'){
                blacks.remove(i);
                i--;
            }
        }
            
        
        for (int i = 0; i < blacks.size(); i++) {
            blacks.set(i, "0" + blacks.get(i));
        }
        whites.addAll(blacks);
        
        return whites;
    }
}
