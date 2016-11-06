/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.1
 * @since 9/29/16
 *
 */
public class DoMath {
	public static void main(String[] args){
		//Part 1
		System.out.println(Calculate.square(-2));
		//Calculate the square of 12
		System.out.println(Calculate.cube(3));
		//Calculate the cube of 12
		System.out.println(Calculate.average(4, 9));
		//Calculate the average of 4 and 9
		System.out.println(Calculate.average(3, 2, 12));
		//Calculate the average of 3, 2, and 12
		System.out.println(Calculate.toDegrees(1));
		//Calculate what 1 radians is in degrees
		System.out.println(Calculate.toRadians(180));
		//Calculate what 180 degrees is in radians
		System.out.println(Calculate.discriminant(2, 4, 3));
		//Calculate the discriminant where a = 2, b = 4, and c = 3
		System.out.println(Calculate.toImproperFrac(2, 4, 5));
		//Converts Mixed Number into Improper fractions
		System.out.println(Calculate.toMixedNum(4,3));
		//Converts Improper fractions into Mixed Number
		
		//Part 2
		System.out.println(Calculate.isDivisibleBy(4, 3));
		//Determines whether or not one integer is divisible by another
		System.out.println(Calculate.absValue(-9));
		//Returns the absolute value of the the number
		System.out.println(Calculate.max(1,-9));
		//Returns the larger of the values passed
		System.out.println(Calculate.max(54, 5, -50));
		//Overload the max method, returns the largest of the values passed
		System.out.println(Calculate.min(3, 7));
		//Returns the smaller of the values passed
		System.out.println(Calculate.round2(5.5));
		
		
		//Part 3
		System.out.println(Calculate.exponent(1.5, 5));
		//Returns a value from a base number raised to a positive 
		//integer power. Assume exponent is negative.
		System.out.println(Calculate.factorial(5));
		//Returns the factorial of the value passed.
		System.out.println(Calculate.isPrime(97));
		//Determines whether or not a integer is prime. 
		System.out.println(Calculate.gcf(15, 12));
		//Finds the greatest common factor between two integers. 
		System.out.println(Calculate.sqrt(56));
		//Finds the square root of a number. 
		System.out.println(Calculate.quadForm(1, -3, -10));
		//Find the real roots using the quadratic formula for a quadratic equation in standard form. 
	}

}
