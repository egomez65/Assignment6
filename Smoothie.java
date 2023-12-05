
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Creates a smoothie object
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

public class Smoothie extends Beverage {

	private int numOfFruits;
	private boolean addProtein;
	private final double PROTEINCOST = 1.50;
	private final double FRUITCOST = 0.50;
	
	
	public Smoothie(String bevName, Size size, int numOfFruits, boolean addProtein) {
		super( bevName, Type.SMOOTHIE, size );
		this.numOfFruits = numOfFruits;
		this.addProtein = addProtein;
		
	}
	
	public int getNumOfFruits() {
		return this.numOfFruits;
		
	}
	
	public boolean getAddProtein() {
		return this.addProtein;
		
	}
	
	public String toString() {
		return "name: " + this.getBevName() + ", size: " + 
				this.getSize() + ", protein?: " + this.addProtein + ", number of fruits: " + this.numOfFruits;
		
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
		
		if ( this.addProtein == true ) {
			price += PROTEINCOST;
			
		}
		
		if ( this.numOfFruits > 0 ) {
			price += ( numOfFruits * FRUITCOST );
			
		}
		
		return price;
		
	}
	
	public boolean equals(Object anotherBev) {
		
		Smoothie bev = (Smoothie) anotherBev;
		
		if ( this.getBevName() == bev.getBevName() && this.getType() == bev.getType() && this.getSize() == bev.getSize() 
			 && this.addProtein == bev.addProtein && this.numOfFruits == bev.numOfFruits && this.calcPrice() == bev.calcPrice() ) {
			return true;
			
		}
		
		else {
			return false;
			
		}
		
	}
	
}
