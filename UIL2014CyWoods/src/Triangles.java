import java.util.Scanner;

//Project complete
public class Triangles {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		
		for(int i = 0;i < total;i++){
			
			int size = sc.nextInt();
			
			int last = size * 2 - 1;
			int first = 0;
			
			char[] line = new char[size * 2];
						
			for(int j = 0; j < size * 2; j++){
				line[j] = '.';		
			}
			
			for(int k = 0; k < size; k++){
				
				System.out.println(line);
				
				line[last] = ' ';
				line[first] = ' ';
				
				last--;
				first++;

			}		
			
		}
		
	}

}
