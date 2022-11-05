import java.util.ArrayList;

public class TestOrders {

    public static void main(String[] args) {

        // Menu Items
        Item item1 = new Item("Cappucino", 5.5);
        Item item2 = new Item("Mocha", 6.5);
        Item item3 = new Item("Latte", 4.5);
        Item item4 = new Item("Drip Coffee", 5.0);

        // Create 2 orders for unspecified guests (without specifying a name);
        Order order1 = new Order();
        Order order2 = new Order();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Order order3 = new Order("Bernard");
        Order order4 = new Order("Jordan");
        Order order5 = new Order("Lukas");

        // Add at least 2 items to each of the orders using the addItem method you wrote, for example, to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);
        order1.addItem(item3);
        order2.addItem(item2);

        // Test the results and the display method by calling the display method on all of your orders, like so: order3.display();
        order3.display();

        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order. For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());

        // Implement the getOrderTotal method within the Order class
        System.out.println(order1.getOrderTotal());

        // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println(order1.getOrderTotal());
        
        // Implement the display method within the Order class
        order3.display();


    }

}
