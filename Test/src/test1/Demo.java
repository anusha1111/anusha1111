package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo{
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
				driver.get("http://talentify.in");
				
				  driver.findElement(By.xpath("//div[@id='navbar-collapse-1']/ul/li[7]/a")).click();
				    driver.findElement(By.name("email")).clear();
				    driver.findElement(By.name("email")).sendKeys("chinthapatlaanusha@gmail.com");
				    driver.findElement(By.name("password")).clear();
				    driver.findElement(By.name("password")).sendKeys("test123");
				    driver.findElement(By.xpath("//button[@type='submit']")).click();

		
}
	
	
}
