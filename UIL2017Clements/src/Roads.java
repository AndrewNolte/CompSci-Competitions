
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
 * time = 60-90 minutes
 */
public class Roads {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("roads.dat"));
        int numTimes = sc.nextInt();
        
        
        for (int iteration = 0; iteration < numTimes; iteration++) {
            int numIslands = sc.nextInt();
            int numBridges = sc.nextInt();

            //make islands
            Island[] ils = new Island[numIslands + 1];    //ignore index 0
            for (int i = 1; i < ils.length; i++) {
                ils[i] = new Island(i);
            }

            //add bridges
            for (int iteration2 = 0; iteration2 < numBridges; iteration2++) {
                Bridge b = new Bridge(sc.nextInt(), sc.nextInt());
                ils[b.n1].addBridge(b);
                ils[b.n2].addBridge(b);
            }
            
            //check if any starting points are solutions
            boolean cando = false;
            for (int i = 1; i < ils.length; i++) {
                if(isPossible(ils.clone(), 1)){
                    cando = true;
                    break;
                }
            }
            if (cando) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }


        }

    }

    public static void printArr(Island[] ils) {
        for (int i = 1; i < ils.length; i++) {
            Island m = ils[i];
            System.out.print(m.id + ":");
            for (int j = 0; j < m.bridges.size(); j++) {
                Bridge b = m.bridges.get(j);
                System.out.print("B(" + b.n1 + " " + b.n2 + ") ");
            }
            System.out.println("");
        }
    }

    public static boolean isPossible(Island[] ils, int pos) {
        //check if empty
        for (int i = 1; i < ils.length; i++) {
            if (ils[i].bridges.size() > 0) {
                break;
            }
            if (i == ils.length - 1) {
                return true;
            }

        }
        //check if this node has no bridges
        if (ils[pos].bridges.isEmpty()) {
            return false;
        }

        //traverse options
        for (int i = 0; i < ils[pos].bridges.size();) {
            Island[] mySet = ils.clone();
            Bridge b = mySet[pos].bridges.remove(i);
            int newpos = (b.n1 == pos) ? b.n2 : b.n1;
            mySet[newpos].bridges.remove(b);
            if (isPossible(mySet, newpos)) {
                return true;
            }
        }

        return false;

    }

    private static class Island {

        int id;
        public ArrayList<Bridge> bridges = new ArrayList();

        public Island(int id) {
            this.id = id;
        }

        public void addBridge(Bridge b) {
            bridges.add(b);
        }
        
        @Override
        public Island clone(){
            Island is = new Island(id);
            for(int i = 0; i < bridges.size(); i++) {
                is.bridges.add(this.bridges.get(i).clone());
            }
            return is;
        }

    }

    private static class Bridge {

        int n1, n2;

        public Bridge(int n1, int n2) {
            this.n1 = n1;
            this.n2 = n2;
        }
        
        @Override
        public Bridge clone(){
            return new Bridge(n1, n2);
        }

    }
}
