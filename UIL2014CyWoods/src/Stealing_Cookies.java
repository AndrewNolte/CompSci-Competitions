import java.util.Scanner;


public class Stealing_Cookies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		for(int i = 0; i < kb.nextInt(); i++){
			
			int m = kb.nextInt();
			int c = kb.nextInt();
			int t = kb.nextInt();
			int occurences = t/5;
			int total = 0;
			boolean atRoom = true;
			
			if(c == 0){
				System.out.println("So hungry!");
				
			}
			else{
				for(int j = 0; j < occurences; j++){
					
					if(atRoom == false){
						atRoom = true;
						c -= m;	
					}
					else if(atRoom == true){
						atRoom = false;
						total += m;
					}
					
					
				}
				if(c == 0){
					System.out.println("All of them!");
				}
				else{
					System.out.println(total);
				}
				
			}
			kb.nextLine();
		}

	}

}
