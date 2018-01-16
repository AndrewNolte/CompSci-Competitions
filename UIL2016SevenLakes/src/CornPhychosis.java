
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author S542046
 */
public class CornPhychosis {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(new File("corn.in"));

        int n = sc.nextInt();
        for (int k = 1; k <= n; k++) {
            if (k % 5 == 0) {
                System.out.print("AWOI");
            }
            if (k % 7 == 0) {
                System.out.print("OIHO");
            }
            if (k % 3 != 0) {
                System.out.print("HAPPYSHIRE");
            }
            
            if (k % 5 == 0) {
            } else if (k % 7 == 0) {
            } else if (k % 3 != 0) {
            } else {
                System.out.print("I AIN'T NO ALIEN");
            }
            System.out.println();

        }

    }

}
