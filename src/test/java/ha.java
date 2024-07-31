

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class ha {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://qa.aegishrms.com/sign-in");
		driver.findElement(By.id("email")).sendKeys("sa@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[local-name()='svg' and@data-testid='MenuIcon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[local-name()='svg' and@data-testid='SupervisorAccountIcon']")).click();
		Thread.sleep(2000);
		WebElement first = driver.findElement(By.name("first_name"));
		first.clear();
		first.sendKeys("suchitra");
		Thread.sleep(1000);
		WebElement middle = driver.findElement(By.name("middle_name"));
		middle.clear();
		middle.sendKeys("Ramchandra");
		Thread.sleep(1000);
		WebElement last = driver.findElement(By.name("last_name"));
		last.clear();
		last.sendKeys("gavali");
		Thread.sleep(1000);
		driver.findElement(By.name("date_of_birth")).sendKeys("02/24/2003");
		Thread.sleep(1000);
		driver.findElement(By.name("joining_date")).sendKeys("07/04/2012");
		Thread.sleep(1000);
		 WebElement email = driver.findElement(By.name("email"));
		email.clear();
		email.sendKeys("suchitragavali07@gmail.com");
		Thread.sleep(1000);
		WebElement phone = driver.findElement(By.name("phone_number"));
		phone.clear();
		phone.sendKeys("9322619670");
     	Thread.sleep(1000);
//		driver.findElement(By.xpath("(//div[@class=' css-1qxol0m-control'])[2]")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("(//div[@class=' css-1qxol0m-control'])[2]")).sendKeys("Female"+Keys.ENTER);
//		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Suchitra@07");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Suchitra@07");
		driver.findElement(By.name("citizenship")).sendKeys("Indian");
		driver.findElement(By.name("empId")).sendKeys("09876");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
	}

}
