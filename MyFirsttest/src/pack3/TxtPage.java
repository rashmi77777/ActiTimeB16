package pack3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TxtPage {
	private WebElement txtBx1;
	private WebElement txtBx2;
	private WebElement txtBx3;
	private WebElement txtBx4;
	private WebElement txtBx5;
	private WebElement txtBx6;
	private WebElement txtBx7;
	private WebElement txtBx8;
	private WebElement txtBx9;
	private WebElement txtBx10;
public TxtPage(WebDriver driver) {
	txtBx1=driver.findElement(By.id("a1"));
	txtBx2=driver.findElement(By.id("a2"));
	txtBx3=driver.findElement(By.id("a3"));
	txtBx4=driver.findElement(By.id("a4"));
	txtBx5=driver.findElement(By.id("a5"));
	txtBx6=driver.findElement(By.id("a6"));
	
	txtBx7=driver.findElement(By.id("a7"));
	txtBx8=driver.findElement(By.id("a8"));
	txtBx9=driver.findElement(By.id("a9"));
	txtBx10=driver.findElement(By.id("a10"));
	
}
public void SetTxtBx1(String value) {
	txtBx1.sendKeys(value);
}
public void SetTxtBx2(String value) {
	txtBx2.sendKeys(value);
}
public void SetTxtBx3(String value) {
	txtBx3.sendKeys(value);
}
public void SetTxtBx4(String value) {
	txtBx4.sendKeys(value);
}
public void SetTxtBx5(String value) {
	txtBx5.sendKeys(value);
}
public void SetTxtBx6(String value) {
	txtBx6.sendKeys(value);
}
public void SetTxtBx7(String value) {
	txtBx7.sendKeys(value);
}
public void SetTxtBx8(String value) {
	txtBx8.sendKeys(value);
}
public void SetTxtBx9(String value) {
	txtBx9.sendKeys(value);
}
public void SetTxtBx10(String value) {
	txtBx10.sendKeys(value);
}
	
}

