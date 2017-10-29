import java.util.ArrayList;

public class Rentals {
	
	private double rentalDeposit, dailyCharge, rentalTotal;
	private int rentalDuration;

	private ArrayList<Product> productList;
	
	//Default Constructor
	public Rentals()
	{
		productList = new ArrayList<Product>();
	}
	
	//Prints receipt That includes customer name, address, phone number, a listing of each product and deposit amount, plus a total rental amount, and a projected rental duration
	public void printReceipt()
	{
		
	}
	
	
	
	
	//Setters and Getters
	public double getRentaDeposit() {
		return rentalDeposit;
	}

	public void setRentaDeposit(double rentaDeposit) {
		this.rentalDeposit = rentaDeposit;
	}

	public double getRentalTotal() {
		return rentalTotal;
	}


	public void setRentalTotal(double rentalTotal) {
		this.rentalTotal = rentalTotal;
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

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public void addProduct(Product product)
	{
		productList.add(product);
	}
	
	public int getRentalDuration() {
		return rentalDuration;
	}

	public void setRentalDuration(int rentalDuration) {
		this.rentalDuration = rentalDuration;
	}
}
