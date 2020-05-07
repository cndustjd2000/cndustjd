package com.human.ex;

public class Product {
	public double price=1000;
	public double tax=1;
	public double getPrice() {
		return price*(1-tax);
	}
}
