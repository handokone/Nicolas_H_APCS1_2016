/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.0
 * @since 9/25/2016
 *
 */
import java.util.Scanner;
public class Calculate {
	public static int square(int num){
		return(num * num);
	}
	public static int cube(int num){
		return(num * num * num);
	}
	public static double average(double num){
		double num1;
		double num2;
		Scanner userInput = new Scanner(System.in);
		num1 = userInput.nextDouble();
		Scanner userInput2 = new Scanner(System.in);
		num2 = userInput2.nextDouble();
		return((num1 + num2) % 2);
	}

}
