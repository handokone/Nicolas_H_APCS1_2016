/*
 * @author Nicolas Handoko
 * 
 */

import java.util.*;

public class Ticket {
	private int number;
	public Ticket(int number){
		this.number = number;
	}
	public double getPrice(){
		return 50.0;
	}
	public String toString(int number, double price){
		return "Number: " + number + ", Price: " + getPrice();
	}
}
