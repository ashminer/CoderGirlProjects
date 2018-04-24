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

        for (int row = 0; row < 4; row++)
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

        //sum of the columns? I know there must me a more logical way of doing this
        // but I'm having trouble identifying what that is exactly...
        // so I am just going to make it work probably the wrong way.

        int gridByWeekdays[][] = {{68, 76, 73, 64},
                                  {70, 76, 72, 65},
                                  {76, 87, 81, 69},
                                  {70, 84, 78, 68},
                                  {68, 82, 76, 70},
                                  {71, 75, 73, 74},
                                  {75, 83, 77, 72}};

        for (int row = 0; row <7; row++)
        {
            int sum = 0;
            int averageTemp = 0;

            for (int column = 0; column < 4; column++)
            {
                sum = sum + (gridByWeekdays[row][column]);
                averageTemp = sum/4;
            }out.println(day[row] + ": " + averageTemp);
        }out.println();



        //sum of the rows
        for (int row = 0; row <4; row++)
        {
            int sum = 0;
            int averageTemp = 0;

            for (int column = 0; column < 7; column++)
            {
                sum = sum + (grid[row][column]);
                averageTemp = sum/7;
            }out.println(time[row] + ": " + averageTemp);
        }
    }
}
