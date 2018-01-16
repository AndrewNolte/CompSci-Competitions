
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
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
 * time = 6:50
 */
public class Team {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("team.dat"));
        int numTimes = sc.nextInt();
        for (int iteration = 0; iteration < numTimes; iteration++) {

            int numTimes2 = sc.nextInt();
            int maxp = sc.nextInt();
            ArrayList<Integer> nums = new ArrayList();
            for (int iteration2 = 0; iteration2 < numTimes2; iteration2++) {
                sc.next();
                nums.add(sc.nextInt());
            }
            Collections.sort(nums);
            Collections.reverse(nums);
            int sum = 0;
            for (int i = 0; i < maxp && i < nums.size(); i++) {
                sum+= nums.get(i);
                
            }
            System.out.println(sum);
 

        }
    }

}
