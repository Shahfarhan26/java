import java.util.Scanner;

public class IfVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = input.next().charAt(0);
        if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("consonant");
        };
    }
}
