
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
public class clickbait2 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("click.in"));

        int runs = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < runs; i++) {
            String line = sc.nextLine();
            int sum = 0;
            int t = line.length();
            for (int k = 0; k < t; k++) {
                sum += line.charAt(k);
            }

            System.out.println(sum);
        }

    }

}
