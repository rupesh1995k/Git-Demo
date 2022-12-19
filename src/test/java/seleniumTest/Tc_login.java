package seleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Tc_login {
	
	@Test
	public void login_Test() throws InterruptedException {
		
	WebDriverManager.edgedriver().setup();	
	
	EdgeDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//	
//	wait.until(ExpectedConditions.)
	
	driver.get("https://demo.automationtesting.in/Frames.html");
	
	driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
	
	WebElement frame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	
	WebElement frame2 = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	
	driver.switchTo().frame(frame);
	
	Thread.sleep(1000);
	driver.switchTo().frame(frame2);
	
	   driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Rupesh");
	
	 
//	WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
//	
//	
//	Actions action = new Actions(driver);
//	
//	action.dragAndDrop(highTatras, trash).perform();
//	
//	Thread.sleep(2000);
	
		
	}

}
