package bikeshop;

import java.util.ArrayList;

/**
 * This class is composed from the Bike class; it contains a list of Bikes and methods for manipulating the list.
 * @author Geoff
 *
 */
public class Order {
	
	/**
	 * The list representing an order of bikes.
	 */
	private ArrayList<Bike> bikeOrder;
	
	/**
	 * Default constructor, no parameters.
	 */
	public Order()
	{
		bikeOrder = new ArrayList<Bike>();	
	}
	
	/**
	 * Overloaded constructor allowing passing an ArrayList of Bikes directly.
	 * @param bikes ArrayList<Bike> representing order
	 */
	public Order(ArrayList<Bike> bikes)
	{
		this.bikeOrder = bikes;
	}
	
	/**
	 * Gets the list of bikes.
	 * @return ArrayList<Bike> representing order list
	 */
	public ArrayList<Bike> getOrder()
	{
		return this.bikeOrder;
	}
	
	/**
	 * Prints each bike in the list.
	 */
	public void printOrder()
	{
		for(Bike order : bikeOrder)
			System.out.println(order.toString() + "\n");
	}
	

}
