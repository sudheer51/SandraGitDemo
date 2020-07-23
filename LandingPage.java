package com.rm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LandingPage {

	FirefoxDriver driver;
	
	public LandingPage(FirefoxDriver driver2) {
		driver = driver2;
	}

	public void navigatetoSchoolDeals()
	{
		driver.findElement(By.xpath("(.//*[text()='Back to School'])[2]")).click();
	}
	
	public void navigatetoDepartments()
	{
		driver.findElement(By.xpath("(.//*[text()='Back to School'])[2]")).click();
	}
}
