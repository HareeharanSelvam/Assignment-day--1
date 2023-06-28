package SeleniumSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnToHandleDropDown {

	public static void main(String[] args) {
		//launch the browser using Edge
		EdgeDriver driver = new EdgeDriver();
		//get the url 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//now maximize the windows
		driver.manage().window().maximize();
		//use wait statement as implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Find the username element to locate
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//password
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    //submit the login
	    driver.findElement(By.className("decorativeSubmit")).click();
	    //welcome and click the link
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    //crm home page
	    //click leads option
	    driver.findElement(By.linkText("Leads")).click();
	    //click the create leads
	    driver.findElement(By.linkText("Create Lead")).click();
	    //now enter the all mandatory details 
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Deloitee");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hari");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("haran");
	    //Handling drop down 
	    //first find the element present inside the select tag
	    //make it as web element
	    WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    //create object for select class and pass the arguments inside it 
	    Select source = new Select(drop1);
	    //now use the helper method to access the select => in option tag all the option value are avail
	    source.selectByVisibleText("Tradeshow");
	    //submit the page
	    driver.findElement(By.name("submitButton")).click();
	    //get the title of the page
	     String title = driver.getTitle();
	     System.out.println(title);
	}

}
