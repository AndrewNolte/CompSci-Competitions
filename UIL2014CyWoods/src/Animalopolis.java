import java.util.Scanner;


public class Animalopolis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int o = sc.nextInt();
		
		for(int j = 0;j < o;j++){
			
			String name = sc.next();
			char fl = name.charAt(0);
			
			if(fl=='A'||fl=='B'||fl=='C'||fl=='D'||fl=='E'||fl=='F'||
				fl=='G'||fl=='H'||fl=='I'||fl=='J'||fl=='K'||fl=='L'||fl=='M'||
				fl=='a'||fl=='b'||fl=='c'||fl=='d'||fl=='e'||fl=='f'||
				fl=='g'||fl=='h'||fl=='i'||fl=='j'||fl=='k'||fl=='l'||fl=='m'){
				System.out.println("Cat");
				
			}
			else{
				System.out.println("Dog");	
				
			}
			
		}
		
	}

}
