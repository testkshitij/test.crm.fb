package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Logo{
 
	public static void main(String[] args)
	{
      WebDriverManager.chromedriver().setup();
      
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://www.facebook.com/");
      
   boolean ft = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
      
    
      if(ft==true)
      {
    	  System.out.println("logo is displayed");
      }
      else
      {
    	  System.out.println("not displayed");
      }
      
      
      
	}

}
