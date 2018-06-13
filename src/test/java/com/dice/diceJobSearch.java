package com.dice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class diceJobSearch {
	
	public static void main(String[] args) {
		//Set up chrome driver path
		WebDriverManager.chromedriver().setup();
		//invoke selenium webdriver
		WebDriver driver = new ChromeDriver();
		//fullscreen
		driver.manage().window().maximize();
		//set universal wait time in case web page is slow
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Launch brower
		String url = "https://dice.com";
	    driver.get(url);
	    //test title
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Job Search for Technology Professionals | Dice.com";
	    
	    if(actualTitle.equals(expectedTitle)) {
	    	System.out.println("Step Pass. dice homepage successfully loaded");
	    }else {
	    	System.out.println("Step fall dice homepage not successfully loaded");
	    	throw new RuntimeException("step Fail. dice homepage did not load successfully");
	    }
	    String keyword ="java developer";
	    driver.findElement(By.id("search-field-keyword")).sendKeys(keyword);
	    
	    String location ="20871";
	    driver.findElement(By.id("search-field-location")).clear();
	    
	    driver.findElement(By.id("search-field-location")).sendKeys(location);
	   
	    driver.findElement(By.id("findTechJobs")).click();
	    
	    String count = driver.findElement(By.id("posiCountId")).getText();
	    System.out.println(count);
	    //check if count is less then o
	    int countResult = Integer.parseInt(count.replaceAll(",", ""));
	    
	    if(countResult > 0) {
	    	System.out.println("Keyword : "+ keyword + " search returned "+ countResult 
	    			+ " results in "+ location);
	    }else {
	    	System.out.println( "Step Fail: keyword : "+ keyword + "search return"
	    			+ " results in "+ location);
	    	
	    			}
	    }
	    
	    
		
	}


