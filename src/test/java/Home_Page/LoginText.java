package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginText {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		String text=driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).getText();
		System.out.println(text);
	}

}
