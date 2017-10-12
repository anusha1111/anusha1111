package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail1 {
	public static void main(String args[]) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
			driver.get("https://accounts.google.com/signin");
	
	    
	    driver.findElement(By.id("identifierId")).clear();
	    driver.findElement(By.id("identifierId")).sendKeys("chinthapatlaanusha@gmail.com");
	    driver.findElement(By.cssSelector("content.CwaK9")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.name("password")).clear();
	    driver.findElement(By.name("password")).sendKeys("anusha1504");
	    driver.findElement(By.cssSelector("content.CwaK9")).click();
	  }
}
