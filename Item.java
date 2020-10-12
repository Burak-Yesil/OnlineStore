//This class defines each item.

public class Item {
	
	public Item(String name, double price, ItemList ListName) {
		this.name = name;
		this.price = price;
		ListName.addItem(this);
	}
	
	public String returnName() {
		return name;
	}
	
	public void returnAllInfo() {
		System.out.println("Name: "+ name);
		System.out.println("Price: " + price);
		LineBreak.printDoubleSpace();
	}
	
	public double returnPrice() {
		return price;
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void percentIncrease(double percentNumber ) {
		double decimalValue = percentNumber/100;
		double multiplyFactor = 1 + decimalValue;
		
		price *= multiplyFactor;
	}
	
	public void PercentOff(double percentNumber) {
		double decimalValue = percentNumber/100;
		double multiplyFactor = 1 - decimalValue;
		
		price *= multiplyFactor;
	}
	
	private String name;
	private double price;
}
