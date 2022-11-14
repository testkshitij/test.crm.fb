package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_Box {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
	 driver.findElement(By.xpath("//input[@type='text']"));
	 System.out.println("email number text is ok");
	driver.findElement(By.xpath("//input[@type='password']"));
	System.out.println("password check box is present");


	}

}
