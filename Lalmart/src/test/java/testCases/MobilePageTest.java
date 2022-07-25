package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;

public class MobilePageTest extends BaseClass{
	
	@Test
	public void verificationOfDisplay() {
		System.out.println("Mobile display is okay");
	}
	
	@Test
	public void verificationOfMemory() {
		System.out.println("Mobile Memory is 124");
	}
	
	@Test
	public void verificationOfVersion() {
		System.out.println("IOS 13 system handle the code");
	}
	
	@Test
	public void withInvalidUserName() {
	driver.findElement(By.id("txtUsername")).sendKeys("khan");
	driver.findElement(By.id("txtPassword")).sendKeys("khan");
	driver.findElement(By.id("btnLogin")).click();
	
	Assert.assertEquals(driver.getTitle(), "jan");
	}
}
