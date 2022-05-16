package userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration 
{

    Scanner scanner = new Scanner(System.in);

    public static final String PASSWORDPATTERN = "^(?=.*[A-Z])(?=.*[0-9])[A-Za-z0-9@$!%*#?&]{6,}$";

    public static void main(String[] args) 
    {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput() //Read An Input From The User.
    {
        System.out.println("Enter the password ");
        String Password = scanner.next();
        validateInput(PASSWORDPATTERN,Password);
    }

    private void validateInput(String pattern, String input)
    {

        if(Pattern.matches(pattern, input))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}