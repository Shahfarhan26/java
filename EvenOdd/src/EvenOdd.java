import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = 'y';
        while (ch == 'y') {
            System.out.print("Enter a number: ");
            int n = input.nextInt();
            if(n % 2 == 0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
            System.out.print("Do you want to continue?(y/n): ");
            ch = input.next().charAt(0);
            if(ch != 'y' && ch != 'n'){
                System.out.println("Invalid input");
            }
        }
    }
}
