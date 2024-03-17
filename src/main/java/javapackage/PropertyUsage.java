package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyUsage {
public static void main(String args[]) throws Exception {
	File a=new File("C:\\Users\\shilp\\eclipse-workspace\\Maven21project\\Folder properties\\Elements.Properties");
	FileInputStream b= new FileInputStream(a);
	Properties c=new Properties();
	c.load(b);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath(c.getProperty("Email"))).sendKeys("jinna123");
	Thread.sleep(3000);
	driver.findElement(By.xpath(c.getProperty("Password"))).sendKeys("jinna12");
	Thread.sleep(2000);
	driver.findElement(By.xpath(c.getProperty("Login"))).click();
	
}
}
