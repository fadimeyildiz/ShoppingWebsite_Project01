package entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    ArrayList<CartItem> items=new ArrayList<>();

    double totalCartCost;


    public void addToCart(CartItem item){

        for(CartItem sepet:items){

            if(item.getItem().equals(sepet.getItem())){
                sepet.setQuantity(sepet.getQuantity()+item.getQuantity());
                calculateTotalCartCost();
                return;
            }

        }
        items.add(item);
        calculateTotalCartCost();


    }
    void calculateTotalCartCost(){
        this.totalCartCost=0;
        for(CartItem c:items){
            totalCartCost+=c.getQuantity()*c.getItem().getPrice();
        }
    }

    public void emptyCart(){

        this.items.clear();

    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartItem> items) {
        this.items = items;
    }

    public double getTotalCartCost() {
        return totalCartCost;
    }

    public void setTotalCartCost(double totalCartCost) {
        this.totalCartCost = totalCartCost;
    }
}