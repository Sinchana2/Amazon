package com.sample.Amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


/**
 * Hello world!
 *
 */
public class App 
{
	//WebDriver driver = null;
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
     System.setProperty("webdriver.gecko.driver","D:/geckodriver.exe");
     WebDriver driver = new FirefoxDriver();
       
     //Thread.sleep(4000);
        /*System.setProperty("webdriver.chrome.driver","D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     */
     driver.navigate().to("https://www.amazon.com");
     Thread.sleep(3000);
     /*WebElement element = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
     String S = element.getAttribute(arg0)
     if(S.equals("amazon"))
     {
    	 System.out.println("You are in the right Page! Welcome !");
     }*/
     /*WebElement element = driver.findElement(By.id("nav-cover"));
     Actions action = new Actions(driver);
     action.moveToElement(element).build().perform();
       */   
     driver.findElement(By.className("a-button-input")).click();
     Thread.sleep(2000);
      WebElement web = driver.findElement(By.className("nav-search-scope nav-sprite"));
     Select drop = new Select(web);
     drop.selectByIndex(3);
     /*
     Actions action = new Actions(driver);
     WebElement element1 = driver.findElement(By.className("nav-search-scope nav-sprite"));
     action.moveToElement(element1).build().perform();
   */
     driver.findElement(By.linkText("Baby")).click();
     Thread.sleep(3000);
     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Baby care products");
     driver.findElement(By.xpath("//*[@class='nav-input']")).click();
     
     //Test Case1
     /*WebElement element1 = driver.findElement(By.xpath("//*[@class='nav-line-2']"));
     Actions action = new Actions(driver);
     action.moveToElement(element1).build().perform();
   
     driver.findElement(By.linkText("Kindle Store")).click();
     Thread.sleep(3000);
     driver.findElement(By.linkText("The Silent Patient")).click();
     */
     
     
     
     driver.quit();  
    }
}