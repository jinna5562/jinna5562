package javapackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* JAva script alert 
 * navigate to "https://the-internet.herokuapp.com/javascript_alerts"
 * handle first alert 
 * click and accept first alert
 * click and accept and dismiss 2nd alert
 * click and get the text from alert
 * pass value in the alert box
 * accept the alert
 */
public class Alerthandle {
public static void main(String[]args) throws InterruptedException   {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
	Thread.sleep(3000);
	driver.switchTo().alert().accept();
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
	driver.switchTo().alert().dismiss();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
	Alert alertwindow =driver.switchTo().alert();
	Thread.sleep(3000);
	System.out.println("alertwindow text"+alertwindow.getText());
	Thread.sleep(3000);
	alertwindow.sendKeys("hello sending keys");
	alertwindow.accept();
	
	/*Authentication popups
	 * Navigate to "https://the-internet.herokuapp.com/basic_auth"
	 * pass username and passweord in the url to get the authentication popup 
	 * Ex-https://admin:admin@the-internet.herokuapp.com/basic_auth
	 * 
	 * 
	 */
	//below is the code for handling authentication popups
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}
