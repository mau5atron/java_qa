package demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert.*;

@SuppressWarnings("unused")
public class WebTour {
    private WebDriver driver;
    
  @Test
  public void f() {
      driver.get("http://newtours.demoaut.com/");  
      driver.findElement(By.name("userName")).sendKeys("mau5atron");
      driver.findElement(By.name("password")).sendKeys("1234");
//      AssertTrue();
//      driver.findElement(By.name("login")).click();
      
//      driver.findElement(By.xpath("//input[@value='oneway']")).click();
      AssertTrue(driver.findElement(By.name("locator")).isDisplayed());
      AssertTrue(driver.findElement(By.name("locator")).isEnabled());
      AssertTrue(driver.findElement(By.name("locator")).isSelected());
      
//      Explicit wait
      WebDriverwait wait=new WebDriverWait(driver, 20);
      WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.id("login"));
      
//      Implicit wait
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitywait(10, Timeunits.SECONDS);
      driver.get("http://demoaut.com");
      WebElement myDynamicElement=driver.findElement(By.id("...")); 
      
      
//      verify 
      driver.findElement(By.name("login")).click();
  }
  
 private void AssertTrue(boolean displayed) {
	// TODO Auto-generated method stub	
 }
 
@BeforeMethod
  public void beforeMethod() {
  }
  @AfterMethod
  public void afterMethod() {
  }
  @BeforeTest
  public void beforeTest() {
      System.setProperty("webdriver.chrome.driver", "/Users/mau5atron/Desktop/SELENIUM_STUFF/chromedriver");
      driver=new ChromeDriver();
  }
  
  @AfterTest
  public void afterTest() {
//      driver.close();
  }
}