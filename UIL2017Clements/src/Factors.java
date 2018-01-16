
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
 * time- spent two hours trying
 * used desmos and finally got it
 */
public class Factors {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("factors.dat"));
        int numTimes = sc.nextInt();
        for (int i = 1; i <= 25; i++) {
            //System.out.println(getNumFactors(i));
            //System.out.println(Arrays.toString(getPrimeFactorsFromFact(i)));
            //System.out.println(getPFsFromNum(i));
        }
        //System.out.println(getNumFactors(4));
        for (int iteration = 0; iteration < numTimes; iteration++) {
            int num = sc.nextInt();
            System.out.println(getNumFactors(num));
        }
    }

    public static int getNumFactors(int fact) {
        int[] arr = getPrimeFactorsFromFact(fact);
        int tot = 1;
        for (int i = 2; i < arr.length; i++) {
            int j = arr[i];
            tot*= (j+1);
        }
        return tot;
    }


    public static int[] getPrimeFactorsFromFact(int fact) {
        if (fact < 2) {
            return new int[100];
        } else {
            int[] arr = getPrimeFactorsFromFact(fact - 1);
            ArrayList<Integer> toAdd = getPFsFromNum(fact);
            for(Integer i : toAdd) {
                arr[i]++;
            }
            return arr;
        }
    }

    public static ArrayList<Integer> getPFsFromNum(int num) {
        ArrayList<Integer> nums = new ArrayList();
        int div = 2;
        while (num > 1) {
            if (num % div == 0) {
                num /= div;
                nums.add(div);
            } else {
                div++;
            }
        }
        return nums;

    }

}
