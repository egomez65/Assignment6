
/*
 * Class: CMSC203
 * Instructor: Grigoriy Grinberg
 * Description: Runs and demonstrates the methods from other classes
 * Due: 12/04/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming
 * assignment independently. I have not copied the code
 * from a student or any source. I have not given my code
 * to any student.
 Print your Name here: Ema Gomez
*/

import java.util.Scanner;

public class BevShopDriverApp
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    BevShop bevshop = new BevShop();
	    int i = 0;
		while (true){
	    double total=0;
	    String yon = "";
		System.out.println("Please start a new order");
		System.out.println("Would you like to start a new order?"); 
		yon = s.next();
		if(yon.equals("no") || yon.equals("No") || yon.equals("NO")){
		    System.out.println("Order Finished");
		    System.out.println("Total amount for all orders: " + bevshop.totalMonthlySale());
		    return;
		}else{

		    System.out.println("Enter time in 24 hour format");
            int time = s.nextInt();
            System.out.println("Enter day of week (1 for Monday, 2 for Tuesday, etc.");
            int day = s.nextInt();
            
            Day day1;
            
            if ( day == 1 ) {
            	day1 = Day.MONDAY;
            }
            else if ( day == 2 ) {
            	day1 = Day.TUESDAY;
            }
            else if ( day == 3 ) {
            	day1 = Day.WEDNESDAY;
            }
            else if ( day == 4 ) {
            	day1 = Day.THURSDAY;
            }
            else if ( day == 5 ) {
            	day1 = Day.FRIDAY;
            }
            else if ( day == 6 ) {
            	day1 = Day.SATURDAY;
            }
            else {
            	day1 = Day.SUNDAY;
            }
            
            
            System.out.println("Enter your name");
            String name = s.next();
            System.out.println("Enter your age");
            int age = s.nextInt();
            
		    bevshop.startNewOrder(time, day1, name, age);
		    
            System.out.println("Total price on order: " + bevshop.totalOrderPrice(bevshop.getCurrentOrder().getOrderNo()));
            boolean cont = true;
            while(cont){
            System.out.println("Would you please add a beverage to your order? (Coffee/Alcohol/Smoothie) or no to stop");
            String bevType = s.next();
                if(bevType.equals("Alcohol") && age >20){
                    System.out.println("Enter beverage name");
                    String bName = s.next();
                    System.out.println("Please enter the beverage size (Small,Medium, or Large):");
                    String size = s.next();
                    Size s1 = null;
                    if(size.equals("Small")){
                        s1 = Size.SMALL;
                    }
                    else if(size.equals("Medium")){
                        s1 = Size.MEDIUM;
                    }
                    else if(size.equals("Large")){
                        s1 = Size.LARGE;
                    }
                    else {
                    	s1 = Size.SMALL;
                    }
                    bevshop.processAlcoholOrder(bName, s1);
                }

                    else if(bevType.equals("Coffee")){
                    System.out.println("Enter beverage name");
                    String bName = s.next();
                    System.out.println("Please enter the beverage size (Small,Medium, or Large):");
                    String size = s.next();
                    System.out.println("Extra shot?(y/n): ");
                    String shot = s.next();
                    boolean hasShot;
                    if(shot.equals("y")){
                        hasShot = true;
                    }else{
                        hasShot = false;
                    }
                    System.out.println("Extra syrup?(y/n): ");
                    String syrup = s.next();
                    boolean hasSyrup;
                    if(syrup.equals("y")){
                        hasSyrup = true;
                    }else{
                        hasSyrup = false;
                    }

                    Size s1;
                    if(size.equals("Small")){
                        s1 = Size.SMALL;
                    }
                    else if(size.equals("Medium")){
                        s1 = Size.MEDIUM;
                    }
                    else if(size.equals("Large")){
                        s1 = Size.LARGE;
                    }
                    else {
                    	s1 = Size.SMALL;
                    }
                    bevshop.processCoffeeOrder(bName, s1, hasShot, hasSyrup );

                }else if(bevType.equals("Smoothie")){
                    System.out.println("Enter beverage name");
                    String bName = s.next();
                    System.out.println("Please enter the beverage size (Small,Medium, or Large):");
                    String size = s.next();
                    System.out.println("Num of fruits, maximum of 5: ");
                    int fruits = s.nextInt();
                    System.out.println("Extra protein?(y/n): ");
                    String protein = s.next();
                    boolean hasProtein;
                    if(protein.equals("y")){
                        hasProtein = true;
                    }else{
                        hasProtein = false;
                    }

                    Size s1;
                    if(size.equals("Small")){
                        s1 = Size.SMALL;
                    }
                    else if(size.equals("Medium")){
                        s1 = Size.MEDIUM;
                    }
                    else if(size.equals("Large")){
                        s1 = Size.LARGE;
                    }
                    else {
                    	s1 = Size.SMALL;
                    }
                    bevshop.processSmoothieOrder(bName, s1, fruits, hasProtein );

                }else if(bevType.equals("no")){
                    cont = false;
                }
           }
            

            

		}
		}
		
        
	}
}
