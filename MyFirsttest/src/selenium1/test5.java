package selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/user/Desktop/test4.html");
	//List<WebElement> driver.findElement(By.xpath("//input[@type='checkbox']"));
	List<WebElement> driver.findElement(By.xpath("//input[@type='checkbox']"));
	//int  count=allChkBx.Size();
		int count =allChkBx.Size();
		System.out.println("Total number of checkbox="+count);
		//Thread.sleep(2000);
		//allChkBX.get(0).click();
		//Thread.sleep(2000);
		//allChkBX.get(1).click();
		for(int i=0;i<count;i++) {
			Thread.sleep(2000);
			allChkBx.get(i).click();
		Thread.sleep(1000);
	

		}
		
		driver.close();
	}

	private static void findElement(By xpath) {
		// TODO Auto-generated method stub
		
	}
}
