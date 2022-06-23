package userregistration;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ValidateTest 
{
	private ValidateTest v ;
	private String f_name;
	private String l_name;
	private String number;
	private String password;
	private String email;
	
	@Before
	public void setUp()
	{
		v = new ValidateTest();
		f_name = "Niharika";
		l_name = "Velagaleti";
		number = "9703020505";
		password= "Niha@2311";
		email= "abc111@gmail.com";
		
		
	}
	
	@Test
	public boolean nameValidation()
	{
		//Happy case for first name
		boolean ans1 = v.nameValidation();
		Assert.assertEquals(true, ans1);
		//Sad case for first Name
		f_name = "Av";
		boolean ans2 = v.nameValidation();
		Assert.assertEquals(false, ans2);
		//Happy case for last name
		l_name = "Trivedi";
		boolean ans3 = v.nameValidation();
		Assert.assertEquals(true, ans3);
		//Sad case for last name
		l_name = "Tr";
		boolean ans4 = v.nameValidation();
		Assert.assertEquals(false, ans4);
		return ans1;
	}
	
	
}
