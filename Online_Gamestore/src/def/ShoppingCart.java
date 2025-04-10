package def;
import java.util.*;

public class ShoppingCart {
	Stack<Game> st = new Stack<>();
	Library lib;
	Wishlist wish;
	public ShoppingCart(Library lib,Wishlist wish) {
		this.wish=wish;
		this.lib=lib;
	}
	
	//Push
	public void insert(String name, double price,int id) {
		if(!isAdded(name))
			st.push(new Game(name,price,id));
		else
			System.out.println(">\n"+name+" is already in the cart.");
	}
	//Display 
	public void display() {
		Stack<Game> temp = new Stack<>();
		int position = 1;
		double price = 0;
		while(!st.isEmpty()) {
			System.out.println((position++)+". "+st.peek().getName()+" -$"+st.peek().getPrice());
			price+=st.peek().getPrice();
			temp.push(st.pop());
		}
		System.out.println((position++)+". Proceed to Purchase (Total: $"+String.format("%.2f", price)+")");
		while(!temp.isEmpty()) {
			st.push(temp.pop());
		}
	}
	//Pop
	public void delete(String name) {
		Stack<Game> temp = new Stack<>();
		while(!st.isEmpty() && !st.peek().getName().equalsIgnoreCase(name)) {
			temp.push(st.pop());
		}
			st.pop();
		while(!temp.isEmpty()) {
			st.push(temp.pop());
		}
	}
	//Checks to avoid duplicates
	public boolean isAdded(String name) {
		Stack<Game> temp = new Stack<>();
		boolean isAdded = false;
		while(!st.isEmpty() && !st.peek().getName().equalsIgnoreCase(name)) {
			temp.push(st.pop());
		}
			if(!st.isEmpty()){
				isAdded = true;
			}
		while(!temp.isEmpty()) {
			st.push(temp.pop());
		}
		return isAdded;
	}
	//Completes the purchasement 
	public void purchase() {
		Game temp=null;
		double paid=0;
		while(!st.isEmpty()) {
			temp=st.pop();
			if(!lib.isPurchased(temp.getName())) {
				if(wish.isAdded(temp.getName())) {
					wish.drop(temp.getName());
				}
				lib.add(temp);
				paid+=temp.getPrice();
			}
			else {
				System.out.println(">\n"+temp.getName()+" is already in the library.");
			}
		}
		System.out.println(">\n $"+String.format("%.2f", paid)+" has been paid.");
	}
}
