package bikeshop;

public class Driver {

	public static void main(String[] args) {

		Order o = new Order();
		Bike one = new Bike(), two = new Bike(), three = new Bike(), four = new Bike();
		Rental t = new Rental();
		
		one.setModel("Test");
		two.setModel("Test2");
		three.setModel("RentedTest3");
		four.setModel("RentedTest4");
		
		o.add(one);
		o.add(two);

		t.addProduct(three);
		t.addProduct(four);
		
		o.setRental(t);
		
		System.out.println(o.getFullOrderAsString());
		
		
	}

}
