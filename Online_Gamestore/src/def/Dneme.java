package def;
import java.util.*;

public class Dneme {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---------------------------\nWelcome to the Online Gamestore!\n---------------------------");
		menuSelection(sc);
		sc.close();
	}
	
	//--------------------MENU----------------------------
	
	public static String toStringMenu() {
		return ">\n----------/ MENU \\----------\n1. View Market\n2. View Wishlist\n3. View Shopping Cart\n4. View Library\n5. Exit\nChoose an option: ";
	}
	public static void menuSelection(Scanner sc) {
		int option = 0;
		while(option!=5) {
			System.out.println(toStringMenu());
			option =sc.nextInt();
			switch(option) {
			case 1:
				marketSelection(sc);
				break;
			case 2:
				wishlistSelection(sc);
				break;
			case 3:
				cartSelection(sc);
				break;
			case 4:
				librarySelection(sc);
				break;
			default:
				break;
			}
		}
	}
	
	//--------------------MARKET----------------------------
	
	public static String toStringMarket() {
		return ">\n----------/ MARKET \\----------\n 1. gameName\n 2. gameName\n 3. gameName\n 4. gameName\n 5. Back\nChoose an option: ";
	}
	public static void marketSelection(Scanner sc) {
		int option = 0;
		while(option!=5) {
			System.out.println(toStringMarket());
			option= sc.nextInt();
			switch(option) {
			case 1:
				gamePurchaseSelection(sc);
				break;
			case 2:
				gamePurchaseSelection(sc);
				break;
			case 3:
				gamePurchaseSelection(sc);
				break;
			case 4:
				gamePurchaseSelection(sc);
				break;
			default:
				break;
			}
		}
	}
	
	//---------------------MARKET/GAME---------------------------
	
	public static String toStringPurchaseGame() {
		return ">\n------------------------------\ngameName            price  \n\n 1. Add to Shopping Cart\n 2. Add to Wishlist\n 3. Back \n------------------------------\nChoose an option: ";
	}
	public static void gamePurchaseSelection(Scanner sc) {
		int option = 0;
		System.out.println(toStringPurchaseGame());
		option= sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Successfully added to the cart.");
			break;
		case 2:
			System.out.println("Successfully added to the wishlist.");
			break;
		default:
			break;
			}
		
	}
	
	//--------------------WISHLIST----------------------------
	
	public static String toStringWishlist() {
		return">\n----------/ WISHLIST \\----------\n 1. gameName\n 2. gameName\n 3. gameName\n 4. Back\nChoose an option: ";
	}
	public static void wishlistSelection(Scanner sc) {
		int option = 0;
		while(option!=4) {
			System.out.println(toStringWishlist());
			option=sc.nextInt();
			switch(option) {
			case 1:
				gameWishlistSelection(sc);
				break;
			case 2:
				gameWishlistSelection(sc);
				break;
			case 3:
				gameWishlistSelection(sc);
				break;
			default:
				break;
			}
		}
	}
	
	//--------------------WISHLIST/GAME----------------------------

	public static String toStringWishlistGame() {
		return ">\n------------------------------\ngameName            price  \n\n 1. Add to Shopping Cart\n 2. Remove from Wishlist\n 3. Back \n------------------------------\nChoose an option: ";
	}
	public static void gameWishlistSelection(Scanner sc) {
		int option = 0; 
		System.out.println(toStringWishlistGame());
		option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Successfully added to the cart.");
			break;
		case 2:
			System.out.println("Successfully removed from the wishlist.");
			break;
		default:
			break;
			}
		
	}
	
	//--------------------SHOPPING CART----------------------------
	
	public static String toStringCart() {
		return ">\n----------/ SHOPPING CART \\----------\n 1. gameName\n 2. gameName\n 3. gameName\n 4. Proceed to Purchase\n 5. Back\nChoose an option: ";
	}
	public static void cartSelection(Scanner sc) {
		int option = 0;
		while(option<4) {
			System.out.println(toStringCart());
			option=sc.nextInt();
			switch(option) {
			case 1:
				gameShoppingCartSelection(sc);
				break;
			case 2:
				gameShoppingCartSelection(sc);
				break;
			case 3:
				gameShoppingCartSelection(sc);
				break;
			case 4:
				System.out.println("Thank you for the purchase!");
			default:
				break;
			}
		}
	}
	
	//--------------------SHOPPING CART/GAME----------------------------
	
	public static String toStringShoppingCartGame() {
		return">\n------------------------------\ngameName            price  \n\n 1. Remove from Shopping Cart\n 2. Back \n------------------------------\nChoose an option: ";
	}
	public static void gameShoppingCartSelection(Scanner sc) {
		int option =0;
		System.out.println(toStringShoppingCartGame());
		option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("Successfully removed from shopping cart.");
			break;
		default:
			break;
		}
	}
	
	//--------------------LIBRARY----------------------------
	
	public static String toStringLibrary() {
		return ">\n----------/ LIBRARY \\----------\n 1. gameName\n 2. gameName\n 3. gameName\n 4. gameName\n 5. Back\nChoose an option: ";
	}
	public static void librarySelection(Scanner sc) {
		int option = 0;
		while(option!=5) {
			System.out.println(toStringLibrary());
			option = sc.nextInt();
			switch(option) {
			case 1:
				gameLibrarySelection(sc);
				break;
			case 2:
				gameLibrarySelection(sc);
				break;
			case 3:
				gameLibrarySelection(sc);
				break;
			case 4:
				gameLibrarySelection(sc);
				break;
			default:
				break;
			}
		}
	}
	
	//--------------------LIBRARY/GAME----------------------------
	
	public static String toStringLibraryGame() {
		return ">\n------------------------------\ngameName                   \n\n 1. Refund the game \n 2. Back \n------------------------------\nChoose an option: ";
	}
	public static void gameLibrarySelection(Scanner sc) {
		int option = 0;
		System.out.println(toStringLibraryGame());
		option=sc.nextInt();
		switch(option) {
		case 1:
			System.out.println("gameName is successfully refunded.");
			break;
		default:
			break;
		}
	}
}
