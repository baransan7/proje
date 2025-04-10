package def;
import java.util.*;

public class ShoppingCart {
	Stack<Game> st = new Stack<>();
	
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
	
}
