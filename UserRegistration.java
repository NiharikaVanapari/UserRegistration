package userregistration;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class UserRegistration
{

    public static final String EMAILPATTERN = "([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

    public static void main(String[] args)
    {

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.emailpatternTest();
    }
	private void emailpatternTest() // Email samples
	{
        String sampleEmail1 = "abc@yahoo.com";
        String sampleEmail2 = "abc-100@yahoo.com";
        String sampleEmail3 = "abc.100@yahoo.com";
        String sampleEmail4 = "abc111@abc.com";
        String sampleEmail5 = "abc-100@abc.net";
        String sampleEmail6 = "abc.100@abc.com.au";
        String sampleEmail7 = "abc@1.com";
        String sampleEmail8 = "abc@gmail.com.com";
        String sampleEmail9 = "abc+100@gmail.com";


        ArrayList<String> emailIdList = new ArrayList<String>();
        emailIdList.add(sampleEmail1);
        emailIdList.add(sampleEmail2);
        emailIdList.add(sampleEmail3);
        emailIdList.add(sampleEmail4);
        emailIdList.add(sampleEmail5);
        emailIdList.add(sampleEmail6);
        emailIdList.add(sampleEmail7);
        emailIdList.add(sampleEmail8);
        emailIdList.add(sampleEmail9);

        for (String emailId : emailIdList)
        {
            if (Pattern.matches(EMAILPATTERN, emailId)) 
            {
                System.out.println(emailId + " - valid ");
            }
            else
            {
                System.out.println(emailId + " - Invalid ");
            }
        }
    }
}