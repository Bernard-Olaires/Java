import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, Lovely to see you. How are you?";
    }

    // NINJA BONUS
    // see the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

    public String dateAnnouncement() {
        // Date date = new Date();
        // return "It is currently " + date;
        return String.format("It is currently %s", new Date());
    }

    public String respondBeforeAlexis(String phrase) {
        
        if(phrase.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        }

        return "Right. And with that I shall retire.";
    }

    // SENSI BONUS 
    // Write your own AlfredQuote mothod using any of the String methods you have learned

}