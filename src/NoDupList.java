import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NoDupList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sss\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement listBox = driver.findElement(By.id("dropdown-class-example"));
	    Select s = new Select(listBox);
	    List<WebElement> allOptions = s.getOptions();
	    HashSet<String> allList = new HashSet<String>();
	    for(int i=0;i<allOptions.size();i++ )
	    {
	    	allList.add(allOptions.get(i).getText());
	    }
	    
	    for(String o:allList) {
	    	System.out.println(o);
	    }
	}

}
