package classes;
import java.lang.*;
import interfaces.*;

public abstract class FoodItem implements IQuantity
{
	protected String fid;
	protected String name;
	protected int availableQuantity;
	protected double price;
	
	public void setFid(String fid){this.fid = fid;}
	public void setName(String name){this.name = name;}
	public void setAvailableQuantity(int availableQuantity){this.availableQuantity = availableQuantity;}
	public void setPrice(double price){this.price = price;}
	
	public String getFid(){return fid;}
	public String getName(){return name;}
	public int getAvailableQuantity(){return availableQuantity;}
	public double getPrice(){return price;}
	
	public abstract void showInfo();
	
	public void addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Food ID: "+fid);
			System.out.println("Food Name: "+name);
			System.out.println("Price: "+price);
			System.out.println("Previous Quantity: "+availableQuantity);
			System.out.println("New Added Amount: "+amount);
			availableQuantity += amount;
			System.out.println("Current Quantity: "+availableQuantity);
			
		}
		else
		{
			System.out.println("FoodItem Can not be added..");
		}
	}
	public void sellQuantity(int amount)
	{
		if(amount>0 && amount<=availableQuantity)
		{
			System.out.println("Food ID: "+fid);
			System.out.println("Food Name: "+name);
			System.out.println("Price:	"+price);
			System.out.println("Previous Quantity: "+availableQuantity);
			System.out.println("Number of Amount Sold:	"+amount);
			
			availableQuantity -= amount;
			System.out.println("Current Quantity: "+availableQuantity);
			
			
		}
		else
		{
			System.out.println("Sorry,Out Of Stock..");
		}
	}
	
	
}