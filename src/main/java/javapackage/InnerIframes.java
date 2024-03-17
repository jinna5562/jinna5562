package javapackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*navigate to "https://demo.automationtesting.in/Frames.html"
 * click on outer frame
 * click on inner frame
 * click on text box and pass value*/
 

public class InnerIframes {
public static void main (String[]args) throws Exception {
	WebDriver driver= new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Frames.html");
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	 WebElement outerframe=driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']/following::iframe[2]"));
driver.switchTo().frame(outerframe);
Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/section/div/div/iframe")).click();
    WebElement innerframe=       driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
    driver.switchTo().frame(innerframe);
    driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("website");
    


}
}
