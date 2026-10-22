import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature: ");
        double temp = input.nextDouble();
        if(temp < 0){
            System.out.println("Temperature is freezing");
        } else if (temp > 0 && temp < 10) {
            System.out.println("Temperature is  low");
        }else if (temp > 10 && temp < 30){
            System.out.println("Temperature is  moderate");
        }else if (temp > 30 && temp < 40){
            System.out.println("Temperature is  hot");
        }else if (temp >= 40 ){
            System.out.println("Temperature is very hot");
        }
    }
}
