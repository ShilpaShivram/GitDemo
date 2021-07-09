import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TiltleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sss\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String str = driver.getTitle();
		if(str.contentEquals("Google")) {
			System.out.println("Correct Page");
		}
		else {
			System.out.println("Wrong Page");
		}
		
		String curUrl = driver.getCurrentUrl();
		System.out.println(curUrl);
		driver.close();
		browserTest();
	}

	public static void browserTest() {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter browser?GC/FF/IE");
	    String browser=sc.next();
	    WebDriver driver;
	    if(browser.equals("GC")) {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sss\\cromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
	    }
	    else {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sss\\cromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
	    }
	    
	    driver.get("https://www.google.com/");
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	    }
	
}
