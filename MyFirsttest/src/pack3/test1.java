package pack3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/user/Desktop/test4.html");
       TxtPage page=new TxtPage(driver);
       page.SetTxtBx1("sel1");
       page.SetTxtBx2("sel2");
       page.SetTxtBx3("sel3");
       page.SetTxtBx4("sel4");
       page.SetTxtBx5("sel5");
       page.SetTxtBx6("sel6");
       page.SetTxtBx7("sel7");
       page.SetTxtBx8("sel812");
       page.SetTxtBx9("sel9");
       page.SetTxtBx10("sel11");
       
}
}