package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Log_in_Facebook {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		String username = "kumar.kshitij.00";
		String pwd="Kshitij@1409162";

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);

		if(pwd.equalsIgnoreCase("Kshitij@1409162"))
		{
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		}
		else
		{
			System.out.println("password is wrong");
		}

		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
