import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking Browser
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.upwork.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();// You can also use driver.quit
	}

}
