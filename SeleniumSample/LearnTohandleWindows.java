package SeleniumSample;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnTohandleWindows {

	public static void main(String[] args) {
		// learn to Handle windows or tabs so to automate it first we need to handle it uniquely
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 /*handle the Windows--> to identify it as a window as URL, page title, window / TAB and it as close, max ,min buttons 
		 //by identifying opening in a different tabs 
		 //Selenium not automatically switch controls so we need to switch the controls by using switchTo();
		  **/
		 
		//To get the current window
			String windowHandle = driver.getWindowHandle(); 
			System.out.println(windowHandle);
			//To identify the current title of the page
			System.out.println(driver.getTitle());
			//Click the open button to open the dashboard window
			driver.findElement(By.xpath("//span[text()='Open']")).click();
		   System.out.println(driver.getTitle());
		   
		  //first we need to use Set inteface to get rid of duplicate to use this Window Handles
		 Set<String> windowHandles = driver.getWindowHandles();
		 //so we not get directly index based window to handle it, so we need to convert to list for handle it and use the get method
		 List<String> childwindow = new ArrayList<String>(windowHandles);
		 //now use the for loop to handle multiple windows 
		 for (int i = 0; i <= childwindow.size(); i++) {
			 String title1 = driver.switchTo().window(childwindow.get(1)).getTitle();
			 System.out.println(title1);
			 //to get back to the parent window 
			 String title2 = driver.switchTo().window(childwindow.get(0)).getTitle();
			 System.out.println(title2);
			 }
		 
		 // other window 
		 //driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		 
		 
		 
		 
			 /*now use the for loop to handle multiple windows 
			 driver.switchTo().window(childwindow.get(1));
				System.out.println(driver.getTitle());
				//switch back the control to the main page 
				driver.switchTo().window(childwindow.get(0));
				System.out.println(driver.getTitle());
				*/
			
			
		}
		 
		 
		 
		
		

	}


