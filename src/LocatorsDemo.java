import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsDemo {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

     	driver.get("https://rahulshettyacademy.com/locatorspractice");
		//driver.close();
	}
}
