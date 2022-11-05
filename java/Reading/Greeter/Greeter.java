public class Greeter {

    public String greet(String name) {
        return createGreeting(name);
    }
    public String greet(){
        return createGreeting("World");
    }
    public String greet(String firstName, String LastName) {
        System.out.println("We are about to greet " + firstName);
        return createGreeting(firstName + " " + LastName);
    }
    private String createGreeting(String toBeGreeted) {
        return "Greeting" + toBeGreeted + ", welcome to coding dojo";
    } 
}