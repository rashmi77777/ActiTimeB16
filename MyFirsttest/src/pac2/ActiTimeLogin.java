package pac2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActiTimeLogin {
public WebDriver driver;
private WebElement unTxtBx;
public ActiTimeLogin(WebDriver driver)
{
	unTxtBx=driver.findElement(By.xpath(xpathExpression));
	pwTxtBx=driver.findElement(By.xpath(xpathExpression));
	loginBtn=driver.findElement(By.xpath(xpathExpression));
}
public void setUsername(String un) {
	unTxtBx.sendKeys(un);
	
}

 


}
