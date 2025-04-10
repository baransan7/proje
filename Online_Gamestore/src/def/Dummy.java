package def;
//import java.util.*;

public class Dummy {

	public static void main(String[] args) {
		/*Store st = new Store();
        st.insert("Elden Ring", 39.99);
        st.insert("Cyberpunk 2077", 29.99);
        st.insert("Sekiro", 59.99);
        st.insert("CS2", 15.99);
        st.insert("Valheim", 9.99);
        st.insert("Ark", 24.99);
        st.displayInRange(0, 25);
        //st.displayInOrder();*/
		ShoppingCart cart = new ShoppingCart();	
		cart.insert("Elden Ring", 39.99,1);
		cart.insert("Elden Ring", 39.99,1);
		cart.insert("Cyberpunk 2077", 29.99,2);
		cart.insert("Sekiro", 59.99,3);
        cart.insert("CS2", 15.99,4);
        cart.insert("Valheim", 9.99,5);
        cart.insert("Ark", 24.99,6);
        cart.display();
        /*cart.delete("Sekiro");
        cart.display();*/
	}

}
