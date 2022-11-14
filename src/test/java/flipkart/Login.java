package flipkart;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");
		
		
		//for escaping the unwanted window alert we use actions class
		Actions action=new Actions(driver);
		
		action.sendKeys(Keys.ESCAPE).perform();
		
		
}
}
