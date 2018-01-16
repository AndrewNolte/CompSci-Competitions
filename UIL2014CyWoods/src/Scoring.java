import java.util.Arrays;
import java.util.Scanner;


public class Scoring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int[] score = new int[total];
		
		for (int i = 0; i < total; i++){
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		
		System.out.println("FIRST PLACE: " + score[total - 1]);
		System.out.println("SECOND PLACE: " + score[total - 2]);
		System.out.println("THIRD PLACE: " + score[total - 3]);
		System.out.println("LAST PLACE: " + score[0]);
		
	}

}
