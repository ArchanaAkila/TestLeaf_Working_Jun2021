package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		//Initiate the URL
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("gopi");
		
		driver.findElementByXPath("//div/div[2]/div/input").sendKeys("gopi");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(.,'Find Leads')]")).click();
		
		/*driver.findElement(By.xpath("xpath=//a[contains(text(),'12401')]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Login Success");
		}
	
		driver.findElement(By.linkText("Edit")).click();
		
		//or
		//driver.findElement(By.xpath=//a[contains(text(),'Edit')]);
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Nokia");
		driver.findElement(By.xpath("//input[@value='update']"));
		String CN = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(CN);
		driver.close();	*/
	}

}
