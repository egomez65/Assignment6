
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Acts as the beverage shop class that sells each beverage
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

import java.util.ArrayList;
import java.util.Collections;

public class BevShop extends Object implements BevShopInterface {

	public ArrayList<Order> orders;
	
	public BevShop() {
		orders = new ArrayList<Order>();
		
		
	}
	
	public boolean isValidTime(int time) {
		if ( time >= MIN_TIME && time <= MAX_TIME ) {
			return true;
			
		}
		
		return false;
		
	}
	
	public int getMaxNumOfFruits() {
		return MAX_FRUIT;
		
	}
	
	public int getMinAgeForAlcohol() {
		return MIN_AGE_FOR_ALCOHOL;
		
	}
	
	public boolean isMaxFruit(int numOfFruits) {
		if ( numOfFruits > MAX_FRUIT ) {
			return true;
			
		}
		
		return false;
		
	}
	
	public int getMaxOrderForAlcohol() {
		return MAX_ORDER_FOR_ALCOHOL;
		
	}
	
	public boolean isEligibleForMore() {
		Order currentOrder = getCurrentOrder();
		if ( getNumOfAlcoholDrink() < MAX_ORDER_FOR_ALCOHOL ) {
			return true;
			
		}
		return false;
		
	}
	
	public int getNumOfAlcoholDrink() {
		Order currentOrder = getCurrentOrder();
		int num = 0;
		
		if ( currentOrder != null ) {
			for ( int i = 0; i < currentOrder.getTotalItems(); i++ ) {
				Beverage beverage = currentOrder.getBeverage(i);
				if ( beverage.getType() == Type.ALCOHOL ) {
					num += 1;
					
				}
			}
		}
		
		return num;
		
	}
	
	public boolean isValidAge(int age) {
		if ( age >= MIN_AGE_FOR_ALCOHOL ) {
			return true;
			
		}
		
		return false;
		
	}
	
	public void startNewOrder(int time, Day day, String customerName, int customerAge) {
		Customer customer1 = new Customer (customerName, customerAge);
		Order order1 = new Order (time, day, customer1);
		orders.add(order1);
		order1.generateOrder();
		
	}
	
	public void processCoffeeOrder(String bevName, Size size, boolean extraShot, boolean extraSyrup) {
		Order currentOrder = getCurrentOrder();
		if ( currentOrder != null ) {
			currentOrder.addNewBeverage( bevName, size, extraShot, extraSyrup );
			
		}
		
		
	}
	
	public void processAlcoholOrder(String bevName, Size size) {
		Order currentOrder = getCurrentOrder();
		if ( currentOrder != null ) {
			currentOrder.addNewBeverage( bevName, size );
			
		}
		
		
	}
	
	public void processSmoothieOrder(String bevName, Size size, int numOfFruits, boolean addProtein) {
		Order currentOrder = getCurrentOrder();
		if ( currentOrder != null ) {
			currentOrder.addNewBeverage( bevName, size, numOfFruits, addProtein );
			
		}
		
		
	}
	
	public int findOrder(int orderNo) {
		for ( int i = 0; i < orders.size(); i++ ) {
			if ( orderNo == orders.get(i).getOrderNo()) {
				return i;
			}
		}
		return -1;
		
	}
	
	public double totalOrderPrice(int orderNo) {
		int index = findOrder(orderNo);
		double calcPrice = 0;
		if ( index != -1 ) {
			calcPrice = orders.get(index).calcOrderTotal();
		}
		return calcPrice;
		
	}
	
	public double totalMonthlySale() {
		double total = 0;
		for ( int i = 0; i < orders.size(); i++ ) {
			total += orders.get(i).calcOrderTotal();
	
		}
		return total;
		
	}
	
	public int totalNumOfMonthlyOrders() {
		return orders.size();
		
	}
	
	public Order getCurrentOrder() {
		if ( orders.size() == 0 ) {
			return null;
			
		}
		
		return orders.get(orders.size()-1);
		
	}
	
	public Order getOrderAtIndex(int index) {
		return orders.get(index);
		
	}
	
	public void sortOrders() {
	    int n = orders.size();

	    for (int i = 0; i < n - 1; i++) {
	        int minIndex = i;

	        for (int j = i + 1; j < n; j++) {
	            Order order1 = orders.get(minIndex);
	            Order order2 = orders.get(j);

	            if (order2.getOrderDay().compareTo(order1.getOrderDay()) < 0) {
	                minIndex = j;
	            }
	        }

	        Order temp = orders.get(minIndex);
	        orders.set(minIndex, orders.get(i));
	        orders.set(i, temp);
	    }
	}
	
	public String toString() {
		String string = "orders: ";
		
		for ( Order order: orders) {
			string += order.toString() + "\n";
			
		}
		
		string += "total monthly sale: " + totalMonthlySale();
		
		return string;
		
	}
	
}
