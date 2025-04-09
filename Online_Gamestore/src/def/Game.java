package def;

public class Game {
	//Attributes
	private double price;
	private String name;
	
	//Tree Values
	Game left;
	Game right;
	
	//LinkedList Values
	Game prev;
	Game next;
	
	public Game(String name,double price) {
		setPrice(price);
		setName(name);
		this.left = null;
		this.right = null;
		this.prev = null;
		this.next = null;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
