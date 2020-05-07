package com.human.ex;

class VipCustomer extends Customer{
	public double sale=0.1;
	@Override
	public double getRate() {
		return rate-sale;
	}
}

class GoldCustomer extends Customer{
	public double sale=0.2;
	@Override
	public double getRate() {
		return rate-sale;
	}
}

class TV extends Product{
	public double tax=0.1;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}
}

class cellPhone extends Product{
	public double tax=0.11;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}
}

class radio extends Product{
	public double tax=0.12;
	@Override
	public double getPrice() {
		return price*(1+tax);
	}
}

public class Calculator {
	public static double productCalculator(Customer c,Product[] p) {
		double totalPrice=0;
		double totalRate=0;
		
		totalRate=c.getRate();
		if(p!=null) {
			for(Product pr:p) {
				if(pr!=null) {
					totalPrice=pr.getPrice();
				}
			}
		}
		
		return totalPrice*totalRate;//√— ±∏∏≈ π∞«∞ ±›æ◊ * ∞Ì∞¥ «“¿Œ¿≤
	}
	
	public static void main(String[] args) {
		Customer c=new Customer();
		Customer vip=new VipCustomer();
		Customer gold=new GoldCustomer();

		Product [] pr=new Product[5];
		pr[0]=new TV();
		pr[1]=new radio();
		pr[2]=new cellPhone();
		
		System.out.println("¿œπ›∞Ì∞¥ : "+
		Calculator.productCalculator(c, pr));
		
		System.out.println("vip∞Ì∞¥ : "+
				Calculator.productCalculator(vip, pr));
		
		System.out.println("gold∞Ì∞¥ : "+
				Calculator.productCalculator(gold, pr));
		
	}

}
