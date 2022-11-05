class CarTest {
    public static void main(String[] args) {

        // create a new car, add assing some calues
        Car client1Car = new Car();
        client1Car.year = 2001;
        client1Car.make = "Honda";
        client1Car.model = "Civic";
        client1Car.color = "white";

        // create a second car, and assign it some values
        Car client2Car = new Car();
        client2Car.year = 2018;
        client2Car.make = "Mazda";
        client2Car.model = "CX-3";
        client2Car.color = "navy";

        // now they have thier own individual data stored together
        System.out.println("Car 1 make: " + client1Car.make);
        System.out.println("Car 1 model: " + client1Car.model);

        System.out.println("Car 2 make: " + client2Car.make);
        System.out.println("Car 1 model: " + client2Car.model);

    } // public static void main() end bracket
} // class CarTest end brackets