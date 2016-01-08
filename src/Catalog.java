import java.util.*;

public class Catalog{ //stores each item available 
	private final String name;
	private ArrayList<Item> items;
	
	public Catalog (String name) {
		this.name = name;
		this.items = new ArrayList<Item>();
	}
	// add item into Catalog
	public void add(Item item) {
		items.add(item);
	}
	//add item size into Catalog
	public int size() {
		return items.size();
	}
	//get item index
	public Item get(int index) {
		return items.get(index);
	}
	//return name in a String type
	public String getName() {
		return name;
	}
}