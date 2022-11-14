package Home_Page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws Exception {
		
		//setup the path
		WebDriverManager.chromedriver().setup();
		
		//launch the browser .. enter the url .	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//click on create new account
		driver.findElement(By.linkText("Create New Account")).click();
		
		//enter first name and last name email
		driver.findElement(By.name("firstname")).sendKeys("Amar");
		driver.findElement(By.name("lastname")).sendKeys("Singh");
		
		driver.findElement(By.name("reg_email__")).sendKeys("amarsingh@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("amarsingh@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Amar@123");
		
				
		//select DOB
		WebElement dayListbox=driver.findElement(By.id("day"));
		Select ds=new Select(dayListbox);
		ds.selectByVisibleText("5");
		
		WebElement monthListbox = driver.findElement(By.id("month"));
		Select ms=new Select(monthListbox);
		ms.selectByVisibleText("Jan");
		
		WebElement yearListbox = driver.findElement(By.id("year"));
		Select ys=new Select(yearListbox);
		ys.selectByVisibleText("1997");
		
		//select gender
		driver.findElement(By.xpath("//label[text()='Male']/../input")).click();
		
		//click on sign up
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}


}
