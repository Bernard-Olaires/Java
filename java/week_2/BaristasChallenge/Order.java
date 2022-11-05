import java.util.ArrayList;

class Order {
    // memeber variables
    private String name; // default value is null
    private boolean ready; // default value false 
    private ArrayList<Item> items = new ArrayList<Item>();

    // ORDER METHODS


    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "guest";
        this.ready = false;
    }
    
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.ready = false;
    }

    // GETTERS 

    public String getName() {
        return this.name;
    }

    public boolean getReady(){
        return this.ready;
    }

    public ArrayList<Item> getItems(){
        return items;
    }

    // SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void setItem(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    // OTHER CLASS METHODS 

    public String getStatusMessage() {
        if(this.ready == true) {
            return "Your order is ready";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for(Item i: this.items) {
            total += i.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.printf("Customer Name: %s", this.name);
        for(Item i: this.items) {
            System.out.println(i.getName() + " -$" + i.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }
}