package seleniumAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAndDuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Steps to login
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Get and Verify the title
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Leaftaps - TestLeaf Automation Platform"))
		{
			System.out.println("Login Success");
		}
		
		String text = driver.findElementByTagName("h2").getText();
		System.out.println(text);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
	//Create Lead Form Fill
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Alcatel");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Archana");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Akila");
		
		WebElement webEleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd1 = new Select(webEleSource);
		dd1.selectByValue("LEAD_DIRECTMAIL");
		
		WebElement webEleSource2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dd2 = new Select(webEleSource2);
		dd2.selectByIndex(3);
	
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Archana");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Akila");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("tester");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("2/06/21");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Testing");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElementByClassName("smallSubmit").click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Nokia");
		driver.findElementByClassName("smallSubmit").click();
		
		
		String CN= driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println("My Company Name is " +CN);
		driver.close();
		
		
		
		
		
		
	}

}
