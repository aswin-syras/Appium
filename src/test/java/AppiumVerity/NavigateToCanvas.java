package AppiumVerity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidDriver;

public class NavigateToCanvas{
	static AndroidDriver driver;
	public static void main(String[] args) {
        try {
            LaunchChrome launcher = new LaunchChrome();  // ✅ instantiate the class
            launcher.testApp(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	public static void CanvasLaunch(String URL, String userName, String password){
		   try {
			   String newURl = URL;
			   String uname = userName;
			   String nepwdwURl = password;
			   System.out.println(newURl + " " + uname + " " + password);
	            WebElement inputField = driver.findElement(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/search_box_text']"));
	            inputField.sendKeys(URL);
	            System.out.println("Typed URL into Chrome search box.");
	        } catch (Exception e) {
	        	System.out.println("Driver ------" + driver);
	            System.out.println("------Error typing URL: " + e.getMessage());
	        }
	    }
	}
