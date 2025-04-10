package def;

public class Wishlist {
	private Game head;
	
	//Inserts items 
	public void add(String name, double price,int id) {
		if(!isAdded(name))
			add(new Game(name,price,id));
		else
			System.out.println(">\n"+name+" is already in the wishlist.");
	}
	public void add(Game game) {
		if(head==null) {
			head=game;
		}
		else {
			Game current = head;
			while(current.next!=null){
				current=current.next;
			}
			current.next = game;
			game.prev=current;
		}
	}
	//Deletes items
	public void drop(String name) {
	    Game current = head;

	    while (current != null && !current.getName().equalsIgnoreCase(name)) {
	        current = current.next;
	    }

	    if (current == head) {
	        head = current.next;
	        if (head != null) {
	            head.prev = null;
	        }
	    } else {
	        current.prev.next = current.next;
	        if (current.next != null) {
	            current.next.prev = current.prev;
	        }
	    }
	}
	public boolean isAdded(String name) {
		boolean isAdded = false;
		Game current = head;
	    
		while (current != null && !current.getName().equalsIgnoreCase(name)) {
	        current = current.next;
	    }
		if(current!=null) {
			isAdded = true;
		}
		return isAdded;
	}
	public void display() {
		int position = 1;
		if(head==null)
			System.out.println("Wishlist is currently empty.");
		else {
			Game current = head;
			while(current!=null) {
				System.out.println((position++)+". "+current.getName()+" -$"+current.getPrice());
				current=current.next;
			}
		}
	}
}
