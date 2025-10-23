import java.awt.Color;
import java.util.*;
public class Pet{

    public static void main (String []args) {
        //ask the user for input( name, season, and color)
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favorite color");
        String color = input.nextLine().toLowerCase().trim();
        if (!(color.equals("red") || color.equals("blue") || color.equals("green")))
        {
            System.out.print("Please pick red, blue, or green");
        }


    }
}






//make sure the input is valid

// make a decision
// tell the user what they get