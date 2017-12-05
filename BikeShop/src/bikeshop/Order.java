package bikeshop;

import java.util.ArrayList;

/**
 * This class is composed from the Product class and extends ArrayList.
 * @author Geoff
 *
 */
public class Order extends ArrayList<Product> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2134763355694794603L;

	private Rental rental;
	private Customer customer;
	
	/**
	 * Default constructor, no parameters.
	 */
	public Order()
	{
		
	}
	
	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}
	
	//Prints receipt That includes customer name, address, phone number, 
	//a listing of each product and deposit amount, plus a total rental amount, and a projected rental duration
	public void printReceipt()
	{
		System.out.println("Customer name: " + customer.getFirstName() + " " + customer.getLastName() + "\n"
			+ customer.getAddress() + "\n"
			+ customer.getPhone() + "\n"
			+ getFullOrderAsString() + "\n"
			+ rental.getRentalTotal() + "\n"
			+ rental.getRentalDuration());
		
	}
	
	public String getFullOrderAsString() {
		
		String s;
		
		if(this.toString().equals("[]")) {
			s = "Customer did not buy any items\n";
			}
		else
			s = "Customer purchased: \n" + this.toString() + "\n";
		
		if(rental != null) {
			s = (s.concat("Rental: \n" + rental.getProductList().toString()));
		}
		
		return s;
	}


	

}
