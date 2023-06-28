package SeleniumSample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnAdvancedXPath {

	public static void main(String[] args) {
		// learn Advanced xpath  or Axes Xpath or relationship based Xpath 
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//here sibling based relative xpath 
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("demosalesmanager");
		//here children to parent relative xpath
		driver.findElement(By.xpath("(//form[@id='login']//input)[2] ")).sendKeys("crmsfa");
		//here Parent to Children relative Xpath
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']/parent::p")).click();
		//here the parent xpath
		driver.findElement(By.xpath("//div[@id='label']//a[1]")).click();
		//
		driver.findElement(By.xpath("(//div[@class='x-panel-header']//a)[2]")).click();
		//
		driver.findElement(By.xpath("(//ul[@class='shortcuts']//a)[2]")).click();
		//
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TCS");
		//
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hari");
		//
		driver.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Haran");
		//
		driver.findElement(By.xpath("//span[text()='E-Mail Address']/following::input")).sendKeys("Dinga002@gmail.com");
		//
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
