
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
 * @author s542046
 */
public class prob10 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("p10.txt"));
        //System.out.println(lcm(new int[]{2,6}));
        //return;
        outer:
        while(true){
                    ArrayList<Integer> l = new ArrayList<>();

            boolean first = true;
            while(true){
                int i = sc.nextInt();
                if(i == 0 && first){
                    break outer;
                }else if (i==0){
                    break;
                }else{
                    first = false;

                }
                l.add(i);

            }
            int[] nums = new int[l.size()];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = l.get(i);

            }
            //System.out.println(Arrays.toString(nums));
            int lm = lcm(nums.clone());

            int num = 0;
            for(int i : nums){
                num += (lm/i);
            }
            //System.out.println("LCM:" + lm);
            for (int i = 2; i < lm; i++) {
                if(num % i == 0 && lm % i == 0){
                    num/=i;
                    lm/=i;
                    i = 1;
                }
            }
            System.out.println(num + "/" + lm);
        }
    }

    public static int lcm(int[] nums) {
        int n = 1;
        int min = nums[0];
        for (int i : nums) {
            if (i > min) {
                min = i;
            }
        }
        for (int i = 2; i <= min; i++) {
            boolean hasmult = false;
            for (int k = 0; k < nums.length; k++){
                if(nums[k]% i == 0){
                    nums[k]/=i;
                    if(!hasmult){
                        n*=i;
                        hasmult=true;
                    }
                }
            }
            if(hasmult){
                i = 2;
            }            
        }
        for(int i : nums){
            n*= i;
        }
        return n;

    }
}
