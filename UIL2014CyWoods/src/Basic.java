import java.util.Scanner;


public class Basic {

	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		for(int k = 0; k < i; k++){
			/*
			int base = sc.nextInt();
			int num = sc.nextInt();
			int remainder;
			char[] digit = new char[10];
			int cName = 0;
			
			while(num != 0){
				remainder = num % base;
				digit[cName] = (char) remainder;
				num = num / base;
				cName++;
			}
			String answer = String.valueOf(digit);
					

			System.out.println(answer);
			*/
			int base = sc.nextInt();
			int inValue = sc.nextInt();
			String answer = "Input Error";
			if(base == 2){
				answer = Integer.toBinaryString(inValue);
			}
			else if(base == 8){
				answer = Integer.toOctalString(inValue);		
			}
			else if(base == 16){
				answer = Integer.toHexString(inValue);		
			}
			
			System.out.println(answer);
		}
		
		
	}

}
