package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/test4.html");
		 WebElement txtBx1 = driver.findElement(By.id("a2"));
		String t = txtBx2.getAttribute("value");
		if(t.length()==0)
		{
		System.out.println("txt Box 2 is empty"); 
		
		}
		else {
			
			System.out.println("txt Box 2 is not empty");
			
		}
		}
}
