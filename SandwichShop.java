import static java.lang.System.out;
import java.util.Scanner;

public class SandwichShop
{
    public static void main (String[] args)

    {
        int veggieSandwichSales;
        int burgerSales;
        int subSales;
        int soupSales;

        Scanner keyboard = new Scanner(System.in);

        out.println("Checking sales goals.");

        out.println("How many veggie sandwiches were sold? ");
        veggieSandwichSales = keyboard.nextInt();
        keyboard.skip("\n");

        if (veggieSandwichSales >= 50)
        {
            out.println("Made goal for veggies.");
        }
        else
        {
            out.println("You did not make the veggie goal.");
        }

        out.print("How many burgers were sold today? ");
        burgerSales = keyboard.nextInt();
        keyboard.skip("\n");

        if (burgerSales >= 250)
        {
            out.println("You made your burger goal. ");
        }
        else
        {
            out.println("You need to see more burgers! ");
        }

        out.println("How many subs did you sell? ");
        subSales = keyboard.nextInt();
        keyboard.skip("\n");

        if (subSales >= 180)
        {
            out.println("Made goal for subs.");
        }
        else
        {
            out.println("Sell more subs!");
        }

        out.println("How many soups were sold today? ");
        soupSales = keyboard.nextInt();
        keyboard.skip("\n");

        if (soupSales >= 70)
        {
            out.println("Made goal for soup.");
        }
        else
        {
            out.println("That's not enough!");
        }

        if (veggieSandwichSales >= 50 && burgerSales >= 250 && subSales >= 180 && soupSales >= 70)
        {
            out.println("Great! You've made goal for everything!");
        }
        else
        {
            out.println("Looks like you need to sell harder.");
        }
    }
}
