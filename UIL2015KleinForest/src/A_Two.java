
import java.util.*;
import java.io.*;

public class A_Two {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("a_two.dat"));
        while (scan.hasNextLine()) {
            int num = scan.nextInt();
            boolean test = true;
            int prime1 = 0;
            int i1 = num - 1;
            int thing = 2;
            while (test) {
                if (i1 % thing == 0) {
                    test = false;
                }
                if (thing == i1) {

                }
                thing++;
            }
        }
    }
}
