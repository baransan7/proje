package def;

public class Library {
	private Game head;
	
	//Inserts purchased items
	public void add(String name, double price,int id) {
		add(new Game(name,price,id));
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
	
	//Refunds purchased items
	public void refund(String name) {
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
	public boolean isPurchased(String name) {
		boolean cond = false;
		Game current = head;
		while(current!=null && !current.getName().equalsIgnoreCase(name)) {
			current=current.next;
		}
		if(current!=null)
			cond=true;
		return cond;
	}
	public void display() {
		int position = 1;
		if(head==null)
			System.out.println("Library is currently empty.");
		else {
			Game current = head;
			while(current!=null) {
				System.out.println((position++)+". "+current.getName());
				current=current.next;
			}
		}
	}
}
