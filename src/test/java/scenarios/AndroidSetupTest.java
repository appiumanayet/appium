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
	//public AndroidDriver driver;

	@Test
	public void login() throws MalformedURLException 
	{
		/*//Java
        File appDir = new File("/Users/mdhossain/eclipse-workspace/AppiumDemo/apps");
        File app = new File(appDir, "app-debug.apk");
        
        //Selenium
        DesiredCapabilities capabilities = new DesiredCapabilities();

        //mandatory capabilities
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformName","Android");

        //other caps
        capabilities.setCapability("app", app.getAbsolutePath());
        
        //Appium
        driver =  new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
*/        
		// Locators on the login screen
		driver.findElement(By.id("username")).sendKeys("asad@gmail.com");
        driver.findElement(By.id("password")).sendKeys("1234passmim");
        driver.findElement(By.id("login")). click();;
       
	}
	
	
	
}
