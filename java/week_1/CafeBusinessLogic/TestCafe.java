import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCafe {
    public static void main(String[] args) {

        /*
        You will need to create an instance of the CafeUtil Class
        in order to use the methods. Hint: it will need to correspond 
        with the varriable name used below...
        */

        CafeUtil appTest = new CafeUtil();

        // app test cases

        System.out.println("\n----- Streak Goal Test -----");
        System.out.println("Purchases needed by week 10: %s \n\n", appTest.getStreakGoal());


        System.out.println("----- Order Total Test -----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n\n", appTest.getOrderTotal(lineItems));

        System.out.println("----- Display Menu Test -----");

        List<String> loadMenu = Arrays.asList(
            "drip coffe",
            "cappucino",
            "latte",
            "mocha"
        );
        ArrayList<String> menu = new ArrayList<Strings>();
        menu.addAll(loadMenu);
        appTest.displayMenu(menu);
    }
}