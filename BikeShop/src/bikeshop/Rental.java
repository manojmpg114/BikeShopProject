package bikeshop;

import java.util.ArrayList;

public class Rental {
	
	private double rentalDeposit, dailyCharge, rentalTotal;
	private int rentalDuration;

	private ArrayList<Product> productList;
	
	//**Default Constructor
	public Rental()
	{
		productList = new ArrayList<Product>();
	}
	
	// MOVED PRINTRECEIPT TO ORDER
	
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
