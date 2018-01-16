import java.util.Scanner;


public class Codecranker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		for(int i = 0;i < total;i++){
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			int z = sc.nextInt();
			int minutes = (int)(Math.pow((630 -2*x -2*y -2*z -40)/4, 2));
			int f = 630 -2 * (x+y+z);
			System.out.print((int)f + " ");
			
			if(f <= 100){
				System.out.print(minutes);
			}
			else if(f > 100 && f < 110){
				System.out.println("TIME TO BEG FOR BONUS");
			}
			else if(f >= 110){
				System.out.println("SHOULD HAVE CRANKED HARDER IN CLASS");
			}			
		}
	}

}
