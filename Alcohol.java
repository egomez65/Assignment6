
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Calculates cost of alcohol, toString, and constructors.
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

public class Alcohol extends Beverage {

	private boolean isWeekend;
	private final double ENDCOST = 0.60;
	
	public Alcohol(String bevName, Size size, boolean isWeekend) {
		super( bevName, Type.ALCOHOL, size );
		this.isWeekend = isWeekend;
		
	}
	
	public double calcPrice() {
		
		double price = this.getBasePrice();
		
		if ( this.getSize() == Size.SMALL ) {
			price = this.getBasePrice();
			
		}
		
		else if ( this.getSize() == Size.MEDIUM ) {
			price += this.addSizePrice();
			
		}
		
		else if ( this.getSize() == Size.LARGE ) {
			price += (2 * this.addSizePrice());
			
		}
		
		if ( this.isWeekend == true ) {
			price += ENDCOST;
			
		}
		
		return price;
		
	}
	
	public String toString() {
		return "name: " + this.getBevName() + ", size: " + 
				this.getSize() + ", weekend?: " + this.isWeekend;
		
	}
	
	public boolean equals(Object anotherBev) {
		
		Alcohol bev = (Alcohol) anotherBev;
		
		if ( this.getBevName() == bev.getBevName() && this.getType() == bev.getType() && this.getSize() == bev.getSize() 
			 && this.isWeekend == bev.isWeekend && this.calcPrice() == bev.calcPrice() ) {
			return true;
			
		}
		
		else {
			return false;
			
		}
		
	}
	
	public boolean isWeekend() {
		return isWeekend;
		
	}
	
}
