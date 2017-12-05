package bikeshop;

/**
 * This class allows instantiation of any miscellaneous accessory
 * the bike shop might sell. It holds the item's name (what it is) and price.
 * @author Geoff
 *
 */
public class Accessory extends Product {

	
	private double price;
	private String itemName;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
