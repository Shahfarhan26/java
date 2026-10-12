import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int no = sc.nextInt();
        for (int row = 0; row < no; row++)
        {
            // This loop prints out the spaces.
            // Check out this pattern:
            // ROW      #SPACES      #STARS
            // 0        4            1
            // 1        3            3
            // 2        2            5
            // 3        1            7
            // 4        0            9
            // n        no.of lines - n - 1    n * 2 + 1

            // Prints out the correct number of spaces
            for (int space = 0; space < no - row - 1; space++)
            {
                System.out.print(" ");
            }

            // Prints out the correct number of stars.
            for (int star = 0; star < row * 2 + 1; star++)
            {
                System.out.print("*");
            }

            // Print this out to move down a line.
            System.out.println();
        }
    }
}
