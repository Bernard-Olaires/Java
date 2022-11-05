public class GreeterTest {
    public static void main(String[] args) {
        Greeter g = new Greeter();

        String greeting = g.greet();
        g.greet("Kelvin");
        String greetingWithName = g.createGreeting("Eduardo");
        System.out.println(greetingWithName);
    }
}