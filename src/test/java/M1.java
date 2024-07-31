

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class M1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://qa.aegishrms.com/sign-in");
		driver.findElement(By.id("email")).sendKeys("saurabh@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@aria-label='open drawer']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//h1[text()='Machine Punching']")).click();
		driver.findElement(By.xpath("//h1[text()='Missed Justify']")).click();
		
		
		driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("i am taken leave for today");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("i am taken leave for today");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
//		driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("i was forgotten to check out");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("i am taken leave for today");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("i was forgotten to checkin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("i was forgotten to checkin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("(//button[@tabindex='0'])[4]")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("i was forgotten to checkin");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		Thread.sleep(3000);
//		
		driver.navigate().back();
		
		driver.findElement(By.id("basic-button")).click();
		driver.findElement(By.xpath("//div[@class='flex  w-full h-full items-center !text-sm  hover:!bg-red-500 !text-red-500 !py-3 hover:!text-white transition-all gap-4  px-4']")).click();
		driver.findElement(By.id("email")).sendKeys("ma@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//*[local-name()='svg' and @data-testid='MenuIcon']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[local-name()='svg' and@data-testid='NotificationsIcon']")).click();
		driver.findElement(By.xpath("//h1[text()='Missed Punch Notification']")).click();
		driver.findElement(By.xpath("//h1[text()='saurabh@gmail.com']")).click();
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
//		driver.findElement(By.xpath("//button[text()='Reject']")).click();
//		
//		driver.findElement(By.xpath("//button[text()='Approved as leave']")).click();
//		
//		
		
		
		
		
		
		
		

	}

}