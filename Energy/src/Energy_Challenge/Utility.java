package Energy_Challenge;
import java.awt.Point;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utility {
	public static WebDriver driver;
	public static WebDriverWait wait ;
	public static Actions actions ;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
public Utility launchBrowser(String BrowserName) {
	
	if(BrowserName == "Chrome") {
			
		System.setProperty("webdriver.chrome.driver", "D:\\\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		else {
			System.setProperty("webdriver.geko.driver","");
			driver = new ChromeDriver();
			
		}
	return this;
			
}
public Utility navigateToURL(String URL) {
	driver.get(URL);
	return this;
	
}

public void forward() {
	driver.navigate().forward();
}
public void backward() {
	driver.navigate().back();
}

public void windowMaximize() {
	driver.manage().window().fullscreen();
}
public void setScreen() {
	driver.manage().window().setSize(new Dimension (1920,1480));
}
public void closeTab() {
	driver.close();
}

}

