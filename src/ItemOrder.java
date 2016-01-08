public class ItemOrder { //stores a particular item and quantity
	private final Item item;
	private final int quantity;
	
	public ItemOrder (Item item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	//getting price of item
	public double getPrice () {
		return item.priceFor(quantity);
	}
	// get list of items from Item ArrayList
	public Item getItem () {
	return item;
	}
	//tranform to the String 
	public String toString () { //string formatting for the US dollar 
		return String.format("(<%s>,<%d>)", item, quantity);
	}
	
}