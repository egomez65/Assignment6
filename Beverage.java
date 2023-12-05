
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Detrmines types, size, price, etc. of beverages.
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

public abstract class Beverage extends Object{

	private String bevName;
	private Type type;
	private Size size;
	private final double basePrice = 2.0;
	private final double sizePrice = 1.0;
	
	public Beverage(String bevName, Type type, Size size) {
		this.bevName = bevName;
		this.type = type;
		this.size = size;
		
	}
	
	public double getBasePrice() {
		return this.basePrice;
		
	}
	
	public Type getType() {
		return this.type;
		
	}
	
	public String getBevName() {
		return this.bevName;
		
	}
	
	public Size getSize() {
		return this.size;
		
	}
	
	public double addSizePrice() {
		return sizePrice;
		
	}
	
	public String toString() {
		return this.bevName + "," + this.size;
		
	}
	
	public boolean equals(Object anotherBev) {
		Beverage bev = (Beverage) anotherBev;
		
		if ( bevName == bev.bevName && type == bev.type && size == bev.size ) {
			return true;
			
		}
		
		else {
			return false;
			
		}
		
	}
	
	public abstract double calcPrice();
	
}
