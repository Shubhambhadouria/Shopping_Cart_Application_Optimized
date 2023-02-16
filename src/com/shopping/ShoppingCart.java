package com.shopping;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ShoppingCart {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		Scanner sc = new Scanner(System.in);
		Methods methods =new Methods();
		Boolean flag = true;
		while(flag) {
			System.out.println();
			System.out.println("********** SHOPPING CART ***********");
			System.out.println();
			System.out.println("Press 1 to Add Items to Cart");
			System.out.println("Press 2 to Show All Items in Cart");
			System.out.println("Press 3 to Remove Item from Cart");
			System.out.println("Press 4 to Sort Items in Cart based on Price");
			System.out.println("Press 5 to Change Item Quantity");
			System.out.println("Press 6 to List All Items in the Cart");
			System.out.println("Press 7 to Filter items based on Properties");
			System.out.println("Press 8 to Delete all items from the Cart");
			System.out.println("Press 9 to Exit from Application");
			System.out.println();
			System.out.print("Enter your Choice : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
				// Adding Product in cart
				case 1:      
					methods.addProduct();
					continue;
					
				// Showing all products from cart
				case 2:
					methods.showAllItems();
					continue;
					
				// Removing item from cart
				case 3:
					methods.removeItem();
					continue;
					
				// Sorting All items in cart	
				case 4:
					methods.sortOnPrice();
					continue;
		
				// Changing Item Quantity in cart	
				case 5:
					methods.changingQuantity();
					continue;
					
				// Listing All Items in the cart
				case 6:
					methods.showAllItems();
					continue;
					
				// Filtering based on properties
				case 7:
					methods.filterByProperties();
					continue;
					
				// Deleting all items in the cart	
				case 8:
					methods.deleteAllProduct();
					continue;
					
				// Exiting the Application	
				case 9:
					methods.exit();
					break;
				default:
					System.out.println("Invalid Response Please try again");
					continue;
			}
			break;
		}
		sc.close();
	}
}
