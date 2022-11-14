public class Driver extends Car {

    public void drive() {
        System.out.println("You are now driving the car.");
        gas--;
        gasTank();
    }

    public void booster() {
        System.out.println("You have used a booster!");
        gas-= 3;
        gasTank();
    }

    public void refuel() {
        System.out.println("You have refueled!.");
        gas += 2;
        gasTank();
    }
}