package com.nagarro.project_first.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.nagarro.project_first.domain.Item;

public class Main {


	static void takingInput() {

		Scanner scanner =new Scanner(System.in);
		
		try {
			System.out.println("Enter Item name");
			String itemName =scanner.next();

			System.out.println("Enter Item Price");
			double price =scanner.nextDouble();

			System.out.println("Enter Item quantity");
			int quantity =scanner.nextInt();

			System.out.println("Enter Item type (Raw,Manufactured and Imported)");
			String itemType =scanner.next();

			Item item=new Item(itemName, itemType, price, quantity);
			double cost=item.getCost();
			
			System.out.println("Do you want to enter details of any other item (y/n):");
			char choice =scanner.next().charAt(0);
			if(choice=='y')
				takingInput();
			
			System.out.println("Item Name : "+itemName+", Price: "+price+", Tax: "+(cost-price*quantity)/quantity+", Final Price:"+cost);

		} catch (InputMismatchException e) {
			System.out.println(" enter Valid values!");
		}
		scanner.close();
	}

	public static void main(String[] args) {
		takingInput();

	}
}
