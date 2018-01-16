import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Creditcard {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
			int totalValids = 0;
			int totalOccurences = 0;
			double percentage;
			boolean isDone = false;
			
			Scanner sc = new Scanner(new File("some.file.idk"));
			while(isDone == false){
				
				if (sc.hasNextLine() == true){
					
					//scan the next line into a string
					String originalLine = sc.nextLine();
					//reverse the String
					String line = new StringBuilder(originalLine).reverse().toString();
					//make a char array and convert the char array into the int array
					char[] charLine = line.toCharArray();
					int[] intLine = new int[line.length()];
					
					for(int i = 0;i < line.length();i++){
						intLine[i] = Character.getNumericValue(charLine[i]);	
					}
					
					//solve for Sum1
					int Sum1 = 0;
					
					for(int j = 0; j < line.length(); j += 2){
						Sum1 += intLine[j];
					}
					
					//solve for Sum2
					int Sum2 = 0;
					
					for(int k = 1; k < line.length(); k += 2){
						if(intLine[k] < 5){
							Sum2 += intLine[k] * 2;
						}
						else{
							Sum2 += intLine[k] * 2 - 9;
						}
					}
					
					//solve for FinalSum and record data
					int FinalSum = Sum1 + Sum2;
					
					if(FinalSum % 10 == 0){
						System.out.println(originalLine);
						totalValids++;
						System.out.println(totalValids + ".0");

					}
					totalOccurences++;
					
					
				}
				else{
					isDone = true;
				}
			}  
			percentage = totalValids/totalOccurences;
			System.out.println(percentage + '%');

	}
}
