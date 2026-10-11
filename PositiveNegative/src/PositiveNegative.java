import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        //program to find if the product of the two numbers taken from the user is positive or negative.
        Scanner input = new Scanner(System.in);
        String ch =  "yes";
        while(ch.equals("yes")){
            System.out.print("Enter First number: ");
            int a = input.nextInt();
            System.out.print("Enter Second number: ");
            int b = input.nextInt();
            if ( (a > 0 && b > 0 )||(a < 0 && b < 0 )){
                System.out.print("product is positive, and is: " + a * b);
            }else if ((a < 0 && b > 0)||(a > 0 && b < 0 )){
                System.out.print("product is negative, and is: " + a * b );
            }
            System.out.println();
            System.out.print("Do you want to continue? yes or no: ");
            ch = input.next();
            if(!ch.equals("yes") && !ch.equals("no")){
                System.out.print("Invalid choice");
            }
        }

    }
}
