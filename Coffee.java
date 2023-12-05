
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Acts as the coffee class which specifies characteristics of the coffee object
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

public class Coffee extends Beverage {

	private boolean extraShot;
	private final double SHOTCOST = 0.5;
	private boolean extraSyrup;
	private final double SYRUPCOST = 0.5;
	
	public Coffee ( String bevName, Size size, boolean extraShot, boolean extraSyrup ) {
		super( bevName, Type.COFFEE, size );
		this.extraShot = extraShot;
		this.extraSyrup = extraSyrup;
		
	}
	
	public boolean getExtraShot() {
		return this.extraShot;
		
	}
	
	public boolean getExtraSyrup() {
		return this.extraSyrup;
		
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
		
		if ( this.extraShot == true ) {
			price += SHOTCOST;
			
		}
		
		if ( this.extraSyrup == true ) {
			price += SYRUPCOST;
			
		}
		
		return price;
		
	}
	
	public String toString() {
		return "name: " + this.getBevName() + ", size: " + this.getSize() + 
				", extra shot?: " + this.extraShot + ", extra syrup?: " + this.extraSyrup;
		
	}
	
	@Override
	public boolean equals(Object anotherBev) {
		
		Coffee bev = (Coffee) anotherBev;
		
		if ( this.getBevName() == bev.getBevName() && this.getType() == bev.getType() && this.getSize() == bev.getSize() 
			 && this.extraShot == bev.extraShot && this.extraSyrup == bev.extraSyrup && this.calcPrice() == bev.calcPrice() ) {
			return true;
			
		}
		
		else {
			return false;
			
		}
	}
	}
