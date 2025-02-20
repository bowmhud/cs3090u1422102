import java.util.Scanner;

public class passwordChecker {
    
public static void main(String[] args) {
    String password;

    if(args.length == 0) {
        System.out.println("Please enter the password you wish to check, or run the program with the password as the first argument");
        System.out.print("Password: ");
        Scanner scanner = new Scanner(System.in);
        password = scanner.nextLine();
        scanner.close();
    } else
        password = args[0];

    System.out.println("Entered password: " + password);
}

}
