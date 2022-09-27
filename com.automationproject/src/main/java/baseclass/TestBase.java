package baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
    	
	public static WebDriver webDriver;
	public Properties prop;
	
	public TestBase() {
	prop = new Properties();
	FileInputStream file;
			
	try {
		
	file = new FileInputStream("C:\\Abirami online class\\Sample\\com.automationproject\\src\\main\\java\\congiuration\\config.properties");
	try {
		prop.load(file);
	} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}

	public void intialization() {
			
	// Manages the driver for the browser on which testing is performed

			String browserName = prop.getProperty("browser");

			switch (browserName) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "C:\\Abirami online class\\Onine Class\\chromedriver.exe");
			webDriver =	 new ChromeDriver();
			break;
			//webDriver=new ChromeDriver();
				
			case "firefox":
			webDriver = new FirefoxDriver();
			break;
			
			
			default:
			System.out.println(("Verify you have passed the correct browser name"));
			break;
			}

			webDriver.manage().window().maximize();
			webDriver.get(prop.getProperty("base_url"));
			//webDriver.manage().deleteAllCookies();
			
		}


		public void quitBrowser() {
			webDriver.quit();
		}
	
}
