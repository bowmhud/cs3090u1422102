import java.util.Scanner;

public class passwordChecker {

    public static void main(String[] args) {
        // create variable to store the password very securely
        String password;

        // if the user did not add a string in the args, prompt them for a password to
        // check
        if (args.length == 0) {
            System.out.println(
                    "Please enter the password you wish to check, or run the program with the password as the first argument");
            System.out.print("Password: ");
            // standard java stuff
            Scanner scanner = new Scanner(System.in);
            password = scanner.nextLine();
            scanner.close();
        } else
            // if there is an argument, use it as the password
            password = args[0];

        // System.out.println("Entered password: " + password);

        /*
         * strong password will be
         * > 8 chars
         * > 12 chars gets 2 points to encourage longer passwords
         * include 1 or more numbers
         * have a capital
         * Have a special char (&, *, ^, etc)
         *
         * For each of these that the password has, give it 1 point
         * Then the password will be given this score 0-5 for security
         */

        int securityRating = 0;

        // 8 chars
        if (password.length() >= 8)
            securityRating++;

        // if it is >= 12 then it gets 2 points
        if (password.length() >= 12)
            securityRating++;

        // include 1 or more numbers
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c <= '9' && c >= '0') {
                // if the character is num, up the rating and break out of the loop so that it
                // doesnt get a point for each num
                securityRating++;
                break;
            }
        }

        // has a capital
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c <= 'Z' && c >= 'A') {
                // if the character is capital, up the rating and break out of the loop so that
                // it doesnt get a point for each capital
                securityRating++;
                break;
            }
        }

        // checks that the string contains a special character somewhere
        // if you run from the command line, be careful of using & or $ as it can mess
        // it up. It works fine when running it normally
        String pattern = ".*[!@#$%^&*(),.?\":{}|<>].*";
        if (password.matches(pattern))
            securityRating++;

        // print out the final rating for the user
        System.out.println(
                "Password rating (on scale 0 - 5, 0 is very bad and 5 is very secure) you scored: " + securityRating);

        if (securityRating == 5)
            System.out.println("Wow! your password is very secure!");
        else if (securityRating == 4)
            System.out.println("Your password is good, try changing it slightly to make it stronger!");
        else if (securityRating == 3)
            System.out.println("Your password is ok, add more to make it more secure");
        else if (securityRating == 2)
            System.out.println("Your password can use some work, check the specifications to make it stronger");
        else if (securityRating == 1)
            System.out.println("You might want to consider a completely new password, this one is too easy to guess");
        else if (securityRating == 0)
            System.out.println("Did you even enter in a password?");

    }

}
