package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnListLeafGroundDropDown {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//find the element
		driver.findElement(By.xpath("(//li[@class='ui-menuitem-submenu active-menuitem']//a) [1]"));
		

	}

}
