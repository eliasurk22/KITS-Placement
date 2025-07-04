import java.util.Scanner;

public class Charcheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isUpperCase(ch)) {
            System.out.println("'" + ch + "' is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println("'" + ch + "' is a lowercase letter.");
        } else {
            System.out.println("'" + ch + "' is not a letter.");
        }
        
        scanner.close();
    }
}