/**
 * 
 * @author APCS1_Nicolas_Handoko
 * @version 1.1
 * @since 9/29/16
 *
 */
public class DoMath {
	public static void main(String[] args){
		System.out.println(Calculate.square(12));
		//Calculate the square of 12
		System.out.println(Calculate.cube(12));
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
	}

}
