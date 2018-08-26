package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test7 {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/test4.html");
		List<WebElement> allLinks=driver.findElement(By.xpath("//a"));
		int count=allLinks.size();
		for(int i=0;i<count;i++) {
			Thread.sleep(1000);
			driver.navigate().back();
			//allChkBx.get(i).click();
		Thread.sleep(1000);
}

	}
}