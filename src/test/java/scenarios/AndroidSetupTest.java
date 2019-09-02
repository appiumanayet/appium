package scenarios;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.app.test.BaseTest;

import io.appium.java_client.android.AndroidDriver;

public class AndroidSetupTest extends BaseTest
{
	@Test
	public void login() throws MalformedURLException
	{
	driver.findElement(By.id("username")).sendKeys("anayet@gmail.com");
        driver.findElement(By.id("password")).sendKeys("1234passmim");
        driver.findElement(By.id("login")). click();
	}
	
}
