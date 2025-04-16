package appiumtest;

import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumTest {
	@Test
    public static void main(String[] args) {
        try {
            //DesiredCapabilities capabilities = new DesiredCapabilities();
//            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Aswin's Galaxy A80");
//            capabilities.setCapability(MobileCapabilityType.UDID, "RZ8N22EFFDJ");
//            capabilities.setCapability("appPackage", "air.com.adobe.connectpro");
//            capabilities.setCapability("appActivity", "air.com.adobe.connectpro.AppEntry");
//            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
        	
        	UiAutomator2Options uiopt = new UiAutomator2Options();
        	uiopt.setDeviceName("Medium Phone API 35");
        	uiopt.setApp("")
        	

            // Make sure this URL is correct
            AndroidDriver driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);

            // Your test code here

            driver.quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}