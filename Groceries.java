import static java.lang.System.out;
import java.util.Scanner;

public class Groceries {
    public static void main(String[] args)
    {
        out.println("Please list three items on your grocery shopping list.");

        Scanner keyboard = new Scanner(System.in);

        String itemOne;
        out.print("Item 1? ");
        itemOne = keyboard.nextLine();

        String itemTwo;
        out.print("Item 2? ");
        itemTwo = keyboard.nextLine();

        String itemThree;
        out.print("Item 3? ");
        itemThree = keyboard.nextLine();

        out.println("Now please enter the quantity of each item.");

        int countItemOne;
        out.print("How many " + itemOne + "? ");
        countItemOne = keyboard.nextInt();

        int countItemTwo;
        out.print("How many " + itemTwo + "? ");
        countItemTwo = keyboard.nextInt();

        int countItemThree;
        out.print("How many " + itemThree + "? ");
        countItemThree = keyboard.nextInt();

        out.println("Now, please enter the price of each item. ");

        float costItemOne;
        out.print("How much does one " + itemOne + " cost ? ");
        costItemOne = keyboard.nextFloat();

        float costItemTwo;
        out.print("How much does one " + itemTwo + " cost ? ");
        costItemTwo = keyboard.nextFloat();

        float costItemThree;
        out.print("How much does one " + itemThree + " cost ? ");
        costItemThree = keyboard.nextFloat();

        float totalItemOne = countItemOne * costItemOne;

        float totalItemTwo = countItemTwo * costItemTwo;

        float totalItemThree = countItemThree * costItemThree;

        out.print("Calculating your grocery bill. \n" +
                "Your total cost is " + (totalItemOne + totalItemTwo + totalItemThree));
    }
}
