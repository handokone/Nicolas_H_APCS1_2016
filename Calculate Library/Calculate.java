/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.1
 * @since 9/29/2016
 *
 */
public class Calculate {
	public static int square(int num){
		//Square an integer
		return(num * num);
	}
	public static int cube(int num){
		//Cube an integer
		return(num * num * num);
	}
	public static double average(double num1, double num2){
		//Find the average of two doubles
		return((num1 + num2) / 2);
	}
	public static double average(double num1, double num2, double num3){
		//Find the average of thee doubles 
		return((num1 + num2 + num3) / 2);
	}
	public static double toDegrees(double radianNum){
		//Convert radians to degree
		double pi = 3.14159;
		return(radianNum * (180 / pi));
	}
	public static double toRadians(double degreeNum){
		//Convert degree to radians
		double pi = 3.14159;
		return(degreeNum * (pi / 180));
	}
	public static double discriminant(double a, double b, double c){
		//Discrimant is equal to b^2 - 4ac 
		//Where a, b, and c are the coefficients of a quadratic equation
		return((b * b) - (4 * a * c));
	}
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		//Converts mixed number in improper fractions
		int newNumer = denominator * wholeNum + numerator;
		
		return newNumer + "/" + denominator;
	}

}
