import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
public class dropdown {

		public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", "C://work//chromedriver.exe");

		WebDriver driver =new ChromeDriver();

		driver.get("http://spicejet.com"); //URL in the browser

		//  //a[@value='MAA']  - Xpath for chennai

		//  //a[@value='BLR']
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[data-focusvisible-polyfill='true']")).click();

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-utggzx r-atwnbb r-cfp7ip']")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-ov7bg r-1loqt21 r-18u37iz r-1wtj0ep r-b5h31w r-rnv2vh r-5njf8e r-1otgn73']']")).click();

		//driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

	}

}
