import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class winHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sss\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.timesofindia.indiatimes.com//");
		
		Set<String> allWinHdls = driver.getWindowHandles();
		System.out.println(allWinHdls.size());
		for(String wh:allWinHdls) {
			driver.switchTo().window(wh);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}

}
