package AppiumVerity;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.SessionNotCreatedException;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class LaunchChrome{
	public AppiumDriverLocalService service;
	@Test
    public AndroidDriver testApp() {
        AndroidDriver driver = null;
        try {
            // Set UiAutomator2 Options
        	service = new AppiumServiceBuilder()
                    .withAppiumJS(new File("C:\\Users\\aswin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")) // Correct path to Appium JS
                    .withIPAddress("127.0.0.1") // Set the IP address
                    .usingPort(4723) // Set the port
                    .build();
        	service.start();
            System.out.println("Appium Service started at: " + service.getUrl());
            UiAutomator2Options uiopt = new UiAutomator2Options();
            uiopt.setDeviceName("Pixel 4a");
            uiopt.setCapability("browserName", "Chrome");
            uiopt.setCapability("chromedriverExecutable", System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe");
            // Initialize AndroidDriver
            driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), uiopt);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//            LaunchChrome obj = new LaunchChrome();
//            obj.CanvasLaunch("panotesting.instructure.com", "aswintest", "Aswinsyras@123");
            // Add your test code here
            System.out.println("App is launched successfully.");
            Thread.sleep(3000);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (SessionNotCreatedException e) {
                System.out.println("⚠️ Session could not be created. Possible version mismatch between Chrome and ChromeDriver.");
                System.out.println("Error message: " + e.getMessage());
                // Optionally log it or take other actions like alerting, retrying, etc.
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
		return driver;
    }
}