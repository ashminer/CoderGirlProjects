import static java.lang.System.out;
import java.util.Scanner;

public class multiplicationTables
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Welcome to Multiplication Tables \n");

        out.println("How large would you like to see them?");
        int size = keyboard.nextInt();

        for (int a=0; a <= size; a++)
        {
            for (int b = 0; b <= size; b++)
            {
                int total = a * b;
                System.out.println( a + " * " + b + " = " + total);
            }
        }
    }
}
