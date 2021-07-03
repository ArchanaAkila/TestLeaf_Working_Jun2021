package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redBus {

	public static void main(String[] args) {
		// To Access the URL
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		
		//To enter the From source
		driver.findElement(By.id("src")).sendKeys("Chennai");
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		
		
		//To enter the destination
		driver.findElement(By.id("dest")).sendKeys("Madurai");
		driver.findElement(By.id("dest")).sendKeys(Keys.ENTER);
		
		//To choose the date in calendar
		//driver.findElement(By.id("onward_cal")).sendKeys("03-Jul-2021");
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[3]/td[6]"));
					
		//To search the buses
		driver.findElement(By.id("search_btn")).click();
		
		//To get the total bus count
		//String str = driver.findElement(By.xpath("//div[@id='root']/div/div[2]/div[2]/div[2]/div/span/span")).getText();
		//System.out.println(str);
		
		//driver.close();

	}

}
