/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.0
 * @since 10/3/16
 *
 */
import java.util.Scanner;
public class ProcessingNumbers {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		int totalOfEven = 0;
		int Lowest = Integer.MAX_VALUE;
		int Highest = Integer.MIN_VALUE;
		int largestEven = 0;
		System.out.println("Enter the number of integers you have ");
		int totalInts = userInput.nextInt();
		//Asks and allow the user to input the number of integers they want
		System.out.println("Enter the integers you want to process ");
	for(int i = 1; i <= totalInts; i++){
		int nextNum = userInput.nextInt();
		//Asks and allow the user to input the integers they want to process
			if(nextNum > Highest){
				Highest = nextNum;
			}
			if(nextNum < Lowest){
				Lowest = nextNum;
			}
			if(nextNum % 2 == 0){
				totalOfEven += nextNum;
				if(nextNum > largestEven){
					largestEven = nextNum;
					//Finds the sum of all the even integers. 
				}
			}
	}
	System.out.println("Highest: " + Highest);
	//Prints the largest integer
	System.out.println("Lowest: " + Lowest);
	//Prints the smallest integer
	System.out.println("total of even: " + totalOfEven);
	//Prints the total sum of the even numbers
	System.out.println("Largest even: " + largestEven );
	//Prints the largest value of even number
	}
}
