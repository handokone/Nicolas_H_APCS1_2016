/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.5
 * @since 10/18/2016
 *
 */
public class Calculate {
	//Part 1:Methods, Headers, and Basic Math 
	public static int square(int num){
		//Square an integer
		//Accepts an integer and returns an integer
		return(num * num);
	}
	public static int cube(int num){
		//Cube an integer
		//Accepts an integer and returns an integer
		return(num * num * num);
	}
	public static double average(double num1, double num2){
		//Find the average of two doubles
		//Accepts two doubles and returns a double
		return((num1 + num2) / 2);
	}
	public static double average(double num1, double num2, double num3){
		//Find the average of three doubles 
		//Accepts three doubles and returns a double
		return((num1 + num2 + num3) / 2);
	}
	public static double toDegrees(double radianNum){
		//Convert radians to degree
		//Accepts and returns a double
		double pi = 3.14159;
		return(radianNum * (180 / pi));
	}
	public static double toRadians(double degreeNum){
		//Convert degree to radians
		//Accepts an returns a double
		double pi = 3.14159;
		return(degreeNum * (pi / 180));
	}
	public static double discriminant(double a, double b, double c){
		//Discrimant is equal to b^2 - 4ac 
		//Where a, b, and c are the coefficients of a quadratic equation
		//Accepts three doubles and returns a double
		return((b * b) - (4 * a * c));
	}
	public static String toImproperFrac(int wholeNum, int numerator, int denominator){
		//Converts mixed number into improper fractions
		//Accepts three integers and returns a string
		int newNumer = denominator * wholeNum + numerator;
		
		return newNumer + "/" + denominator;
	}
	public static String toMixedNum(int numerator, int denominator){
		//Converts improper fractions into mixed numbers
		//Accepts two integers and returns a string
		int wholeNum = numerator % denominator;
		int newNumer = numerator / denominator;
		
		return wholeNum + "_" + newNumer + "/" + denominator;
	}
	//Part 2: Methods with Conditionals
	public static boolean isDivisibleBy(int a, int b){
		//Determines whether or not one integer is divisible by another
		//Accepts two integers and returns a boolean
		if(a % b == 0){
			return true;
		}
		else{
			return false;
		}
	}
	public static double absValue(double a){
		//Returns the absolute value of the the number
		//Accepts a double and returns a double
		if(a >= 0){
			return a;
		}
		else{
			return(a * -1);
		}
	}
	public static int max(int a, int b){
		//Returns the larger of the values passed
		//Accepts two integers and returns an integer
		if(a > b){
			return a;
		}
		else{
			return b; 
		}
	}
	public static int max(int a, int b, int c){
		//Overload the max method, returns the largest of the values passed
		//Accepts three doubles and returns an integer
		int maxNum = a;
		if(b > maxNum){
			maxNum = b;
		}
		if(c > b && c > a){
			maxNum = c;
		}
		return maxNum;
	}
	public static int min(int a, int b){
		//Returns the smaller of the values passed
		//Accepts two integers and returns a boolean
		if(a < b){
			return a;
		}
		else{
			return b;
		}
	}
	/*public static double round2(double a){
		//Rounds a double correctly to 2 decimal places
		//Accepts a double and returns a double 
	}*/
	
	//Part 3: Methods that use Loops and Calls to Other Methods
	
	public static double exponent(double baseNum, int powerNum){
		//Raises a double to a postive integer value. Assume the exponent is always positive.
		//Accepts a double and an integer and returns a double
		double totalVal = 1;
		for(int i = 1; i <= absValue(powerNum); i++){
			totalVal *= baseNum;
		}
		return totalVal;
	}
	public static int factorial(int baseNum){
		//Returns the factorial of the value passed. 
		//Accepts an integer and returns an integer.
		int totalNum = 1;
		for(int i = 1; i <= baseNum; i++){
			totalNum *= i;
		}
		return totalNum;
	}
	public static boolean isPrime(int number){
		//Determines whether or not an integer is prime
		//Accepts an integer and returns a boolean
		if (number < 2){
			return false;
		}
		if (number == 2){
			return true;
		}
		if (isDivisibleBy(number,2)){
		//Calling method isDivisibleBy in order to check if 
		//number is divisibe by 2 or not. 
			return false;
		}
		for (int i = 3; i * i <= number; i += 2){
			if (number % i == 0){
				return false;
			}
		}
		return true;
	}

}
