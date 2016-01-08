import java.text.*;
import java.util.*; 
public class ShoppingCart {
    private ArrayList<ItemOrder> cart;
    private boolean hasDiscount;
    NumberFormat nf = NumberFormat.getCurrencyInstance();
    // creates empty ArrayList
    
    public ShoppingCart(){
        cart = new ArrayList<ItemOrder>();
    }
    
      //Method that adds an ItemOrder to the list
      //if the list contains any previous order of this item, it replaces it with the new order
     //ItemOrder the order to be added
    public void add(ItemOrder itemOrder){
        if(cart.contains(itemOrder.getItem())){
            int index = cart.indexOf(itemOrder.getItem());
            cart.set(index, itemOrder);
        } else cart.add(itemOrder);
    }
 
    //set to get discount
    public boolean setDiscount(boolean value){
        return hasDiscount = value;
    }
 
    //total cost of shopping cart
    public double getTotal(){
        double totalPrice = 0;
        for(int i = 0; i < cart.size(); i++){
            totalPrice += cart.get(i).getPrice();
        }
        if(hasDiscount)
            totalPrice *= 0.9;
        return totalPrice;
    }
    
    public List<ItemOrder> sortCart() {
    	return (cart);
    }
    
    public String toString() {
    	return nf.format(getTotal());
    }
   
}
