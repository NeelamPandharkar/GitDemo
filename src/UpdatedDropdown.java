import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
		
		Thread.sleep(3000);

		//driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		//driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("btnclosepaxoption")).getText());
		
		driver.close();
		
	}

}
