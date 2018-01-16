
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class brickwall2 {
    
public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("brick2.in"));
        
        int i = sc.nextInt();
            for (; i > 0; i--) {
                System.out.println(sc.nextInt() * sc.nextInt());
            
            
            }

}

}