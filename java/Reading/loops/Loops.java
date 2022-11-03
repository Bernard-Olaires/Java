import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {

        // Desired ouptut: 01234

        // System.out.println(0);
        // System.out.println(1);
        // System.out.println(2);       // super tedious to do this 
        // System.out.println(3);       // we can instead create a for loop 
        // System.out.println(4);

        // For loop (increased by 1)
        // for (int i = 0; i<5; i++) {
        //     System.out.println(i);
        // }

        // For loop (increased by 2)
        // for (int i = 0; i<5; i+=2) {
        //     System.out.println(i);
        // }

        // For loop (decreased by 1)
        // for(int i = 5; i>0; i--) {
        //     System.out.println(i);
        // }

        // For loop (Bar)
        // for(int i = 0; i < 7; i++) {
        //     System.out.println("bar");
        // }

        // For Loop over ArraysList

        ArrayList<String> dynamicArray = new ArrayList<String>();
        dynamicArray.add("hello");
        dynamicArray.add("world");
        dynamicArray.add("etc");
        for(int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }


        // for(int i = 0; i < dynamicArray.size(); i++) {
        //     String name = dynamicArray.get(i);
        //     System.out.println("Hello " + name);
        // }

         // Enhanced For Loop
        for(String name: dynamicArray){
            System.out.println("hello " + name);
        }

    }
}