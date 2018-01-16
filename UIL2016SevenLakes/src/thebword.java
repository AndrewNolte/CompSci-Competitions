
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
public class thebword {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("bword.in"));

        while (sc.hasNext()) {

            String why = sc.next();
            if (why.charAt(0) == 'b') {
                if (why.equals("bankruptcy")) {
                    System.out.println("YOU'RE FIRED");
                } else {
                    System.out.println("uh-oh");
                }

            } else {
                System.out.println("ok");
            }

        }

    }

}
