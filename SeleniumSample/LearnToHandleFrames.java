package SeleniumSample;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnToHandleFrames {

	public static void main(String[] args) throws IOException {
		// Learn how to handle frames 
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		/*
	     frames--> are like another Dom into Dom frames used to divide a web page into multiple independent sub windows 
	      or sections where each frame contains its own HTML docs..
		 */
		
		//switching frames is important to handle the frames
	     driver.switchTo().frame(0);
		//now we have to handle the first frame 
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		//verification for the frame 
		WebElement insideframe = driver.findElement(By.xpath("//button[contains(text(),'Hurray! You Clicked Me')]"));
		String text1 = insideframe.getText();
		System.out.println(text1);
		//To interact with other frame first we nned to switch back the control to the Parental frame or Default content 
		driver.switchTo().defaultContent();
		//handle the nested frame --> inline frame so switch the frame 
		driver.switchTo().frame(2);
		//
		driver.switchTo().frame("frame2");
		//getting the text from the frame
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		//switch back to the parent frame
		driver.switchTo().parentFrame();
		//handle third frame frame count switch to the frame 
		driver.switchTo().frame(1);
		//to handle the frame text
		driver.findElement(By.xpath("//button[contains(text(),'Count Frames')]")).getText();
		//switch back to the main frame 
		driver.switchTo().parentFrame();
		
		//For verification we get a screenshot AS
		//step:1 Take snpashot and 
		File source = driver.getScreenshotAs(OutputType.FILE);
		//step:2 create af folder to save the img file
		File dest = new File ("./Snap/img1.png");
		//step:3 Merge Source and Destination
		FileUtils.copyFile(source, dest); // this throws Exception IO to handle the error like file damage 
		
		
	   

	}

}
