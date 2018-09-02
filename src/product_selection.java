package basicsreview;
import java.util.*;

public class product_selection {
    public static void main(String[] args) {

        int user_OPTION;
        Scanner user_INPUT = new Scanner(System.in);

        do {

            System.out.println("Select what pet(s) you have");
            System.out.println("_________________________________________");
            System.out.println("1. Dog");
            System.out.println("2. Cat");
            System.out.println("3. Dogs and Cats");
            System.out.println("4. Fish or Other Pets");
            System.out.println("5. No Pets");
            System.out.println("\nEnter Selection: ");
            user_OPTION = user_INPUT.nextInt();
        }

//      while (user_OPTION != 1 && user_OPTION != 2 && user_OPTION != 3 && user_OPTION != 4 && user_OPTION != 5);
   while (user_OPTION < 1 && user_OPTION > 5);
        switch (user_OPTION) {
            case 1:
                System.out.println("You Chose Dogs.  Dogs are pretty much the best thing ever");
                break;
            case 2:
                System.out.println("You Chose Cats.  Cats are evil.");
                break;
            case 3:
                System.out.println("You Chose Dogs and Cats. Your house must be crazy");
                break;
            case 4:
                System.out.println("You Chose Fish or other pets, That's cool.");
                break;
            case 5:
                System.out.println("You Chose no pets, you must be very busy.");
                break;
            default:
                System.out.println("ERROR, You did not enter a valid number.");
                break;

        }
    }
}