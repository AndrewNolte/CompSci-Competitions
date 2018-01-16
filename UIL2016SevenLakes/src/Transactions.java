import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Transactions {

public static void main(String[] args) throws IOException {
    
    
        Scanner sc = new Scanner(new File("trans.in"));
    
        int x = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i<x;i++){
            
            double cash = sc.nextDouble();
            
            if(cash<5000){
            
                System.out.println("approved");
                
            }
            else if(5000 <= cash && cash < 50000){
                
                System.out.println("maybe not");
                
            }
            else if(cash >= 50000){
                
                System.out.println("uh-oh");
            }
        }


}       
}
    

