package com.nagarro.project_first.domain;

public class Item {

	String name;
	String type;
	double price;
	int quantity;
	
	
	public Item(String name, String type, double price, int quantity) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public double getCost() {
		double cost=price;
		double tax=0;
		if(type.equalsIgnoreCase("raw")) {
			tax=(price*12.5)/100;
			cost=cost+tax;
		}
		else if(type.equalsIgnoreCase("Manufactured")) {
			tax=((price*12.5)/100)+(((price*12.5)/100)+price)*2/100;
			cost=cost+tax;
		}else {
			tax=price*10/100;
			cost=cost+tax;
			if(cost<=100)
				cost=cost+5;
			else if(cost<=200)
				cost=cost=10;
			else
				cost=cost+cost*5/100;
		}
		cost=cost*quantity;
		return cost;
	}
	
}
