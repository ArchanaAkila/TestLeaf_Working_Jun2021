package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		// Access the URL

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		//To Enter the Email Address
		driver.findElement(By.id("email")).sendKeys("archu.akila@gmail.com");
		
		//To Append the text
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("More");
		
		//To get the test and print it
		String str = driver.findElement(By.xpath("//input[@name='username']")).getText();
		System.out.println(str);
		
		//To clear the field
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//To check whether the field is enabled/disabled
		boolean br = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(br);
		
	}

}
