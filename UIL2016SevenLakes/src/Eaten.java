import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Eaten {
    
    public static void main(String[] args) throws IOException {
    
    
        Scanner sc = new Scanner(new File("grue.in"));
     
        int x = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<x;i++){
            String land = sc.nextLine();
            System.out.println("Aloha, Mahalo the great state of " + land);
            
        }
        
        
    }
    
}
