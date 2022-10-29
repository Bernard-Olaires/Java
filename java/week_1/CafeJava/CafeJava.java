public class CafeJava {
    public static void main(String[] args) {

        // APP VARIABLES 
        // lines of text that will apear in the app
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        // Menu variables 
        double mochaPrce = 3.5;
        double dripCoffeePrice = 3.2;
        int latte = 3;
        int cappucino = 4;

        // Customer name variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order Completions
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;

        // App Interaction Simulation 
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + readyMessage);

        // Noah's Order
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }

        // Sams Order
        System.out.println(mochaPrce + cappucino);

        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmys Order

        System.out.println(dripCoffeePrice - latte);
    }
}