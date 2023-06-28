package SeleniumSample;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnAlert1 {

	public static void main(String[] args) {
		//Modal Dialog cannot able to inspect into DOM 
		// Targert locators learning Alert 
		/* Alert is the information or warning messages pop up in the apps
		 * 
		 */
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//getting into the TargetLocators
		 driver.findElement(By.xpath("(//i[contains(@class,'pi pi-globe')]) [1]")).click();
		 //getting into the alert
		 driver.findElement(By.xpath("//span[text()='Alert']")).click();
		 //1>)Handling the Alert now Simple Alert 
		 driver.findElement(By.xpath("(//span[text()='Show']) [1]")).click();
		 //now switch the control to handle the Alert 
		 Alert alert = driver.switchTo().alert();
		 //now get the text from the simple alert 
		 String simpleAlert = alert.getText();
		 System.out.println(simpleAlert);
		 //now to handle the alert that to accept it  use accept method
		 alert.accept();
		 //2>) Handling the confirmation Alert
		 driver.findElement(By.xpath("(//span[text()='Show']) [2]")).click();
		 //now switch to control the confirmation alert 
		 Alert alert1 = driver.switchTo().alert();
		 //now get the text from the confirmation Alert
		 String confirmationAlert = alert1.getText();
		 System.out.println(confirmationAlert);
		 //now to handle the alert accept it or reject it 
		  alert1.accept();
		  //3>) Handling the prompt alert 
		  driver.findElement(By.xpath("(//span[text()='Show']) [5]")).click();
		  //now switch to the prompt alert 
		  Alert alert2 = driver.switchTo().alert();
		  //get the text from the alert 
		  String promptAlert = alert2.getText();
		  System.out.println(promptAlert);
		  //now send the keywords inside the prompt box 
		  alert2.sendKeys("Hareeharan");
		  //now accept it or not reject it 
		  alert2.accept();
		  System.out.println(driver.findElement(By.id("confirm_result")).getText());
    /*
     * Non Modal Dialog sweet alert this can be able to inspect
     * */
     
		  //handling the SWEET ALERT
		  driver.findElement(By.xpath("(//span[text()='Show']) [3]")).click();
		  //now get the text from the sweet alert 
		  String sweetSimple = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content']/p) [1]")).getText();
		  System.out.println(sweetSimple);
		  //now handle the sweet simple dialog to dismiss the alert 
		  driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		  //alert cannot able to take screenshot because we cannot access other screens if we not handle the alert 
		  
	}

}
