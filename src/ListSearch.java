import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sss\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Enter option to search:");
	    Scanner sc=new Scanner(System.in);
	    String eText=sc.next();
	    System.out.println("Searching ......");
	    String txtTest = "found";
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    WebElement listBox = driver.findElement(By.id("dropdown-class-example"));
	    Select s = new Select(listBox);
	    List<WebElement> allOptions = s.getOptions();
	    for(int i = 0;i<allOptions.size();i++) {
	    	if(allOptions.get(i).getText().equals(eText)) {
	    		txtTest = "Found";
	    		break;
	    	}
	    	else {
	    		txtTest = "Not Found";
	    	}
	    }
	    System.out.println(txtTest);
	    
	    ArrayList<String> allText = new ArrayList<String>();
	    for(int i =0;i<allOptions.size();i++) {
	    	String str = allOptions.get(i).getText();
	    	allText.add(str);
	    }
	    Collections.sort(allText);
	    for(String ss:allText) {
	    	System.out.println(ss);
	    }
	    driver.close();
	}

}
