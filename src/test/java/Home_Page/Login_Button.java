package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_Button {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		boolean button = driver.findElement(By.xpath("//button")).isEnabled();
		
		if(button==true)
			System.out.println("Yes Login button is enabled");
		else
			System.out.println("No Login button is not enabled");
	}

}
