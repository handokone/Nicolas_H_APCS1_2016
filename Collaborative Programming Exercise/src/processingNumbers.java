/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.0
 * @since 10/3/16
 *
 */
import java.util.Scanner;
public class processingNumbers {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		int total = 0;
		int Lowest = 0;
		int Highest = 0;
		System.out.println("Enter the number of integers you have");
		int totalInts = userInput.nextInt();
	for(int i = 1; i <= totalInts; i++){
		System.out.println("Enter the numbers you want to process");
		int nextNum = userInput.nextInt();
			if(nextNum > Highest){
				Highest = nextNum;
			}
			if(nextNum < Lowest){
				Lowest = nextNum;
			}
			if(nextNum % 2 == 0){
				total += nextNum;
				System.out.println(nextNum);
			}
	}
	System.out.println("Highest: " + Highest);
	System.out.println("Lowest: " + Lowest);
	System.out.println("total: " + total);
	}
}
