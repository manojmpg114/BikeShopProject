import java.util.ArrayList;

public class Rentals {
	
	private double deposit, dailyCharge;
	private int duration;
	private boolean isLate;
	private Customer renter;

	private ArrayList<Product> rental;
	
	//Default Constructor
	public Rentals()
	{
		rental = new ArrayList<Product>();
	}
	
	//Setters and Getters
	public Customer getRenter()
	{
		return customer;
	}
	
	public void setRenter(Customer renter)
	{
		this.renter = renter;
	}
	
	public double getRentaDeposit() {
		return deposit;
	}

	public void setRentaDeposit(double deposit) {
		this.deposit = deposit;
	}

	public double getDailyCharge() {
		return dailyCharge;
	}

	public void setDailyCharge(double dailyCharge) {
		this.dailyCharge = dailyCharge;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> rental) {
		this.rental = rental;
	}

	public void addProduct(Product product)
	{
		rental.add(product);
	}
	
	public int getRentalDuration() {
		return duration;
	}

	public void setRentalDuration(int duration) {
		this.duration = duration;
	}
}
