
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Creates order object
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

import java.util.ArrayList;
import java.util.Random;

public class Order extends Object implements OrderInterface, Comparable <Order> {

	private int orderNo;
	private int orderTime;
	private Day orderDay;
	private Customer customer;
	private ArrayList < Beverage > beverages;
	private String name;
	private int age;
	
	public Order(int orderTime, Day orderDay, Customer cust) {
		this.orderTime = orderTime;
		this.orderDay = orderDay;
		this.customer = cust;
		this.name = cust.getName();
		this.age = cust.getAge();
		beverages = new ArrayList < Beverage >();
		
	}
	
	public int generateOrder() {
		Random randomNo = new Random();
		int randomNumber = randomNo.nextInt(90000 - 10000 + 1) + 10000;
		this.orderNo = randomNumber;
		return orderNo;
		
	}
	
	public int getOrderNo() {
		return this.orderNo;
		
	}
	
	public int getOrderTime() {
		return this.orderTime;
		
	}
	
	public Day getOrderDay() {
		return this.orderDay;
		
	}
	
	public Customer getCustomer() {
		Customer copyCustomer = new Customer(customer);
        return copyCustomer;
		
	}
	
	public Day getDay() {
		return this.orderDay;
		
	}
	
	public boolean isWeekend() {
		if ( this.orderDay == Day.SUNDAY || this.orderDay == Day.SATURDAY ) {
			return true;
		}
		return false;
		
	}
	
	public Beverage getBeverage(int itemNo) {
		Beverage beverage = beverages.get(itemNo) ;
		return beverage;
		
	}
	
	public int getTotalItems() {
		int totalItems = beverages.size();
		return totalItems;
		
	}
	
	public void addNewBeverage(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		Coffee coffee = new Coffee( bevName, size, extraShot, extraSyrup );
		beverages.add(coffee);
		
	}
	
	public void addNewBeverage(String bevName, Size size) {
		Alcohol alcohol = new Alcohol ( bevName, size, isWeekend() );
		beverages.add(alcohol);
		
	}
	
	public void addNewBeverage(String bevName, Size size, int numOfFruits, boolean addProtein) {
		Smoothie smoothie = new Smoothie( bevName, size, numOfFruits, addProtein );
		beverages.add( smoothie );
		
	}
	
	public double calcOrderTotal() {
		double orderTotal = 0.0;
		for ( int i = 0; i < beverages.size(); i++ ) {
			orderTotal += beverages.get(i).calcPrice();
			
		}
		
		return orderTotal;
		
	}
	
	public int findNumOfBeveType(Type type) {
		int numOfBeveType = 0;
		for ( int i = 0; i < beverages.size(); i++ ) {
			if (beverages.get(i).getType() == type) {
				numOfBeveType++;
				
			}
		}
		return numOfBeveType;
		
	}
	
	public String toString() {
		String bev = "";
		for ( int i = 0; i < beverages.size(); i++ ) {
			bev += beverages.get(i).toString() + "\n";
			
		}
		
		return "order number: " + this.orderNo + ", time: " + this.orderTime + ", day: " + this.orderDay +
				", customer: " + this.getCustomer() + ", beverages: " + bev;
		
	}
	
	@Override
	public int compareTo(Order anotherOrder) {
		int compare;
		
		if ( this.orderNo == anotherOrder.orderNo ) {
			compare = 0;

		}
		
		else if ( this.orderNo > anotherOrder.orderNo ) {
			compare = 1;
			
		}
		
		else {
			compare = -1;
			
		}
		
		return compare;
		
	}


}
