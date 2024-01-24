import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//driver.manage().window().maximize();
	    driver.findElement(By.xpath("//form//input[@name='name']")).sendKeys("John");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("neelampandharkar1996@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Neelam@1996");
		
		driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();

		WebElement staticdropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(staticdropdown);
		dropdown.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.close();

	}

}
