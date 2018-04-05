
import static java.lang.System.out;
import java.util.Scanner;

public class multiplicationTableGrid
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        out.println("Welcome to Multiplication Tables \n");

        out.println("How large would you like to see them? (Please enter number less than 20)");
        int size = keyboard.nextInt();

        if(size>20)
        {
            out.println("Error: Your number is too large.");
        }

        else if(size<=20)
        {
            for (int a=1; a <= size; ++a)
            {
                for (int b=0; b <= size; ++b)
                {
                    out.print( a*b+"\t");
                }
                out.println();
            }
        }
    }
}