import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("please enter an space separated equation:(for example: 5 + 5");
            String eq = scan.nextLine();
            String[] parts = eq.split(" ");
            Double a = Double.parseDouble(parts[0]);
            String op = parts[1];
            Double b = Double.parseDouble(parts[2]);
            switch(op){
                case "+":
                    System.out.println(a + " + " + b + " = " + (a + b));
                    break;
                case "-":
                    System.out.println(a + " - " + b + " = " + (a - b));
                    break;
                case "*":
                    System.out.println(a + " * " + b + " = " + (a * b));
                    break;
                case "/":
                    System.out.println(a + " / " + b + " = " + (a / b));
                    break;
                case "^":
                    System.out.println(a + " ^ " + b + " = " + (Math.pow(a, b)));
                    break;
                case "%":
                    System.out.println(a + " % " + b + " = " + (a % b));
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println();
            System.out.println("press any key + enter to continue or 'exit' to leave the program:");
            String choice = scan.nextLine();
            if (choice.equals("exit")) {
                exit = true;
            }
        }
    }
}
