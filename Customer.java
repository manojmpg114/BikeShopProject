
public class Customer extends Person {

	String email;
	int phone;
	String address;
	// if orders class returns a list of orders be able to take this data in / provide or push orders
	
	
	public Customer()
	{
		
	}
	
	public Customer(String email, String address, int phone)
	{
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
