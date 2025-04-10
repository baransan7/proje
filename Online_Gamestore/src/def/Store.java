package def;

public class Store {
	private Game root;
	
	//Game insertion 
	public void insert(String title, double price,int id) {
        root = insertRec(root, new Game(title, price,id));
    }

    private Game insertRec(Game current, Game newGame) {
        if (current == null) return newGame;

        if (newGame.getName().compareToIgnoreCase(current.getName()) < 0)
            current.left = insertRec(current.left, newGame);
        else if (newGame.getName().compareToIgnoreCase(current.getName()) > 0)
            current.right = insertRec(current.right, newGame);

        return current;
    }
    //Game Display NORMAL
    public void displayInOrder() {
    	int[] position = {1};
    	displayInOrderRec(root, position);
    }

    private void displayInOrderRec(Game current, int[] position) {
    	if (current != null) {
            displayInOrderRec(current.left,position);
            System.out.println(position[0]+ ". " +current.toString());
            position[0]++;
            displayInOrderRec(current.right,position);
        }
    }
    //Game Display FILTERED
    public void displayInRange(double minPrice, double maxPrice) {
        int[] position = {1};
        displayInRangeRec(root, minPrice, maxPrice, position);
    }

    private void displayInRangeRec(Game current, double min, double max, int[] position) {
        if (current == null) return;

        if (current.getPrice() > min) {
            displayInRangeRec(current.left, min, max, position);
        }

        if (current.getPrice() >= min && current.getPrice() <= max) {
            System.out.println(position[0] + ". " + current.toString());
            position[0]++;
        }

        if (current.getPrice() < max) {
            displayInRangeRec(current.right, min, max, position);
        }
    }

}
