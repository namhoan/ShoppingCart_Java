public class Item { //stores pricing information for a particular item
	private final int bulkQuantity; 
	private final double regPrice, bulkPrice;
	private final String name; 
	
	public Item (String name, double price) {
		this(name, price, 1, price); //price doesn't change with higher quantity
	}
	//set the parameters 
	public Item (String name, double price, int bulkQuantity, double bulkPrice) {
		validatePos((int)price & (int)bulkPrice & bulkQuantity);
		this.name = name;
		this.regPrice = price;
		this.bulkPrice = bulkPrice;
		this.bulkQuantity = bulkQuantity;
	}
	//returns the total price
	public double priceFor (int quantity) {
		validatePos(quantity);
		if (quantity >= bulkQuantity) {
			return (double)(quantity - bulkQuantity)*regPrice + bulkPrice; 
		}
		else return (double)quantity*regPrice;
	}
	//transform into String
	public String toString () { //string formatting for the US dollar 
		return name + String.format(", $%04.2f", regPrice) + (
			(regPrice != bulkPrice)? String.format(" (%d for $%04.2f)", bulkQuantity, bulkPrice): ""
		);
	}
	public String getName() {
		return name;
	}
	//numbers in this program should  not be negative
	private static void validatePos (double numb) {
		if (numb< 0) {
			throw new IllegalArgumentException("Prices cannot be negative");
		}
	}
}