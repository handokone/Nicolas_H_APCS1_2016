import java.io.*;
import java.util.*;

public class Weather {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner scan = new Scanner(new File("weather.txt"));
		double weather1 = scan.nextDouble();
		double weather2 = scan.nextDouble();
		System.out.println(weather2 - weather1);
	}
}
