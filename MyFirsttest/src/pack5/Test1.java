package pack5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Desktop/Link8.html");

		Link8PO link=new Link8PO(driver);
		//link.chkBx1().click();
		//link.chkBx2().click();

		//link.chkBx3().click();

		//link.chkBx4().click();

		//link.chkBx5().click();
		System.out.println(link.allChkBxSize());
		//for(int i=0;i<link.allchkBxSize();i++) {
			link.getAllChkBx3(0).click();
			link.getAllChkBx3(1).click();
			link.getAllChkBx3(2).click();
		}
}

