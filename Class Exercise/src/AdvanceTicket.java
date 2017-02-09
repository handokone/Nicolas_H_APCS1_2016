
public class AdvanceTicket extends Ticket{
	private int numberDays;
	private double price;
	public AdvanceTicket(int number, int numberDays){
		super(number);
		this.numberDays = numberDays;
	}
	public double getPrice(){
		if(numberDays > 10){
			price = 30.0;
		} else{
			price = 40.0;
		}
		return price;
	}
	public void setPrice(double price){
		this.price = price;
	}
}
