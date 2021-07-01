package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {
	
	 public static WebDriver driver;
	    public static WebDriver initilizeDriver(String driverType){

	        //initilized  browser
	        if(driverType.equalsIgnoreCase("ch")){
	            WebDriverManager.chromedriver().setup();
	            driver=new ChromeDriver();
	        }
	        else if (driverType.equalsIgnoreCase("ff")){
	           WebDriverManager.firefoxdriver().setup();
	            driver=new FirefoxDriver();
	        }
	        else if (driverType.equalsIgnoreCase("edg")){
	           WebDriverManager.edgedriver().setup();
	            driver=new EdgeDriver();

	        }
	        driver.manage().window().maximize();
	        driver.manage().deleteAllCookies();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        return driver;
	    }


}
