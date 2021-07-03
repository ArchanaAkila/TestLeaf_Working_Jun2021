package seleniumAssignments;

import java.util.concurrent.TimeUnit;

import org.apache.xalan.templates.ElemElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BondWithButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Click button to travel home page
		driver.findElement(By.id("home")).click();
		
		
		//Find position of button (x,y)
		
		//Find button color
		System.out.println(driver.findElement(By.id("color")).getCssValue("color"));
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
        
        

		//Find the height and width of button
		System.out.println(driver.findElement(By.id("size")).getSize().getHeight());
		System.out.println(driver.findElement(By.id("size")).getSize().getWidth());
     
	}

}
