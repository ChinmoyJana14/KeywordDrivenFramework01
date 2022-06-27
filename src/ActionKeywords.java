import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActionKeywords {
	
	static WebDriver driver;
	
	public static void openBrower() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	public static void navigate() {
		driver.navigate().to("http://www.way2testing.com/p/blog-page.html");
	}
	
	public static void click_df() {
		driver.findElement(By.xpath("//*[@id=\"post-body-751561208295527719\"]/div[1]/table/tbody/tr[1]/td[2]/a"));
	}
}
