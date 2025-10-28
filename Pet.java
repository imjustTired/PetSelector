import java.util.*;

public class Pet {

    public static void main(String[] args) {
        // ask the user for input (name, season, and color)
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite color (red, blue, or green)");
        String color = input.nextLine().toLowerCase().trim();
        if (!(color.equals("red") || color.equals("blue") || color.equals("green"))) {
            System.out.println("Please pick red, blue, or green");
            return;
        }

        System.out.println("Enter your favorite season");
        String season = input.nextLine().toLowerCase().trim();
        if (!(season.equals("spring") || season.equals("summer") || season.equals("fall") || season.equals("winter"))) {
            System.out.println("Please pick spring, summer, fall, or winter");
            return;
        }

        System.out.println("Enter your name");
        String name = input.nextLine().toLowerCase().trim();

        // make sure the first character is a letter
        char firstLetter = name.charAt(0);
        if (!Character.isLetter(firstLetter)) {
            System.out.println("Please put a valid name");
            return;
        }

        String pet = "";

        // blue + fall = Alligator
        if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
        }

        // blue + spring = Ostrich
        else if (color.equals("blue") && season.equals("spring")) {
            pet = "Ostrich";
        }

        // green + consonant-starting name + winter = Giraffe
        else if (color.equals("green") && season.equals("winter") &&
                !("aeiou".equals(name.substring(0, 1)))) {
            pet = "Giraffe";
        }

        // green + season != fall = Dog (unless already Giraffe)
        else if (color.equals("green") && !season.equals("fall") && !pet.equals("Giraffe")) {
            pet = "Dog";
        }

        // red = Panda unless name starts with vowel = Porcupine
        else if (color.equals("red")) {
            if ("aeiou".contains(name.substring(0, 1))) {
                pet = "Porcupine";
            } else {
                pet = "Panda";
            }
        }

        // summer = Pony unless Dog, Panda, or Porcupine already assigned
        else if (season.equals("summer")) {
            if (!(pet.equals("Dog") || pet.equals("Panda") || pet.equals("Porcupine"))) {
                pet = "Pony";
            }
        }

        // blue + consonant-starting name + not summer/fall = Axolotl (unless Ostrich)
        else if (!("aeiou".contains(name.substring(0, 1))) && color.equals("blue") && !season.equals("summer") && !season.equals("fall")) {
            if (!pet.equals("Ostrich")) {
                pet = "Axolotl";
            }
        }

        
        else {
            pet = "Pet Rock";
        }

        System.out.println("Your pet is " + pet);
    }
}