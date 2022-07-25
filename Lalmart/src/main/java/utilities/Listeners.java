package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class Listeners extends BaseClass implements ITestListener{
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed");
	}
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This test failed "+result.getName());
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("C:\\Users\\naimt\\OneDrive\\Desktop\\Lalmart\\Lalmart\\screenshot\\screen.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
