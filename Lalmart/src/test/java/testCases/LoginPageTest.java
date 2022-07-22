package testCases;

import org.testng.annotations.Test;

public class LoginPageTest {
	
	@Test
	public void loginWithValidCreadintial() {
		System.out.println("user login successfully with valid creadintial");
	}
	
	

	
	@Test
	public void loginWithInvalidUserName() {
		System.out.println("user can not login with wrong username");
	}
	
	@Test
	public void loginWithInvalidPassword() {
		System.out.println("user can not login with wrong Password");
	}
	

}
