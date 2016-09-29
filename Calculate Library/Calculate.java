/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.1
 * @since 9/29/2016
 *
 */
public class Calculate {
	public static int square(int num){
		return(num * num);
	}
	public static int cube(int num){
		return(num * num * num);
	}
	public static double average(double num1, double num2){
		return((num1 + num2) / 2);
	}
	public static double average(double num1, double num2, double num3){
		return((num1 + num2 + num3) / 2);
	}
	public static double toDegrees(double radianNum){
		double pi = 3.14159;
		return(radianNum * (180 / pi));
	}
	public static double toRadians(double degreeNum){
		double pi = 3.14159;
		return(degreeNum * (pi / 180));
	}

}
