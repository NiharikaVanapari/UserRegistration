package userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration 
{

    Scanner scanner = new Scanner(System.in);

    public static final String NAMEPATTERN = "[A-Z][A-Za-z]{2,}";

    public static void main(String[] args)
    {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.readInput();
    }
    private void readInput()
    {
        System.out.println("Enter last name ");
        String lastName = scanner.next();
        validateInput(NAMEPATTERN,lastName);
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