import java.util.Scanner;

//Project Complete
public class Pancakeoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		for(int i = 0;i < total;i++){
			
			int lanes = sc.nextInt();
			double sp = (Math.pow(3, lanes/2))*5/3;
			
			double s = sc.nextDouble();
			double v = sc.nextDouble();
			double d = sc.nextDouble();
			
			double sv = s / 10 * 1;
			double vv = v / 10 * 3;
			double dv = d / 10 * 6;
			
			double totalPoints = sv + vv + dv;
			
			if (totalPoints >= sp){
				System.out.println("NOM NOM CUPCAKE");				
			}
			else{
				System.out.println("PANCAKE-O WAS PANCAKE-OED");							
			}
		

		}
	}

}
