package seleniumTest;



import java.awt.AWTException;
import java.awt.Robot;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Upload {



   public static void main(String[] args) throws AWTException, InterruptedException {
    
	   WebDriverManager.edgedriver().setup();
        
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.ilovepdf.com/jpg_to_pdf");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.xpath("//div[@id='html5_1gicpm1o0a17135r15tgc9r8i04_container']"));
        //Robot rb = new Robot();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        
        js.executeScript("arguments[0].click();",button);
       
    }



}