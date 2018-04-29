import static java.lang.System.out;

public class temperatures
{
    public static void main(String[] args)
    {
        out.println("Temperature Calculators \n");

        int grid[][] = {{68, 70, 76, 70, 68, 71, 75},
                        {76, 76, 87, 84, 82, 75, 83},
                        {73, 72, 81, 78, 76, 73, 77},
                        {64, 65, 69, 68, 70, 74, 72}};

        String[] time = {"7 AM", "3 PM", "7 PM", "3 AM"};
        String[] day = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};

        out.println("The data provided are: ");

        for (int row = 0; row < grid.length; row++)
        {
            out.print(time[row] + ": ");
            for (int column = 0; column < 7; column++)
            {
                out.print(grid[row][column] + " ");
            }
            out.println();
        }
        out.println();

        out.println("Based on that data, the following are the average temperatures for the week. \n");

        for (int column = 0; column < 7; column++)
        {
            int sum = 0;
            int averageTemp = 0;

            for (int row = 0; row < grid.length; row++)
            {
                sum += grid[row][column];
            }
            averageTemp = sum/4;
            out.println(day[column] + ": " + averageTemp);
        }out.println();


        for (int row = 0; row <4; row++)
        {
            int sum = 0;
            int averageTemp = 0;

            for (int column = 0; column < 7; column++)
            {
                sum += (grid[row][column]);
            }
            averageTemp = sum/7;
            out.println(time[row] + ": " + averageTemp);
        }out.println();

        out.println("The final average temperature for the week was: ");

        int sumTotal = 0;
        int averageTotal = 0;

        for (int row = 0; row <4; row++)
        {
            for (int column = 0; column < 7; column++)
            {
                sumTotal += (grid[row][column]);
            }
        }
        averageTotal = sumTotal/28;
        out.println("Overall: " + averageTotal);
    }
}
