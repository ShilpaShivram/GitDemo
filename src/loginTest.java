import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sss\\cromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.nextgenerationautomation.com/");
		WebElement login = driver.findElement(By.xpath("//div[@data-testid='mesh-container-content']/div[3]/button")); 
		waitForVisibility(driver,login);	
		login.click();
		WebElement mem =driver.findElement(By.xpath("//*[text()='Log In']"));
		waitForVisibility(driver,mem);
		mem.click();
		
		driver.findElement(By.xpath("//div[@data-testid='switchToEmailLink']")).click();
		driver.findElement(By.id("input_input_emailInput_SM_ROOT_COMP12")).sendKeys("superuser");
		driver.findElement(By.id("input_input_passwordInput_SM_ROOT_COMP12")).sendKeys("welcome");
		driver.findElement(By.xpath("//button[@data-testid='buttonElement']")).click();
		
	}

	static void waitForVisibility(WebDriver driver,WebElement element) {
		try {
			Thread.sleep(2000);
			System.out.println("Waiting for the element visibility");
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(element));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
