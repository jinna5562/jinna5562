package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookLogin {
	public static void main(String args[]) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/*driver.findElement(By.xpath("//input[@id='email']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login'][@type='submit']")).click();*/
		driver.get("https://www.facebook.com/reg/");
		List<WebElement> day=driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(day.size());
		day.get(6).click();
		List <WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
		radio.get(2).click();
		System.out.println(radio.size());
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select j=new Select(month);
		j.selectByIndex(6);
		
		
	}

}
