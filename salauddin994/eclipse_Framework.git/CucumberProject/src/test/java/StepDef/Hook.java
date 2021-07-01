package StepDef;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.util.Strings;

import Base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hook extends Config{
	
	//Main setup
    public static String url;
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");

    //defult setup
    public static String defultBrowser = "ch";
    public static String defultEnvironment = "qa";


    @Before
    public void OpenBrowser() {
        //default setup
        if (Strings.isNullOrEmpty(browserType)) {
            browserType = defultBrowser;
        }
        if (Strings.isNullOrEmpty(baseURL)) {
            baseURL = defultEnvironment;
        }

        //main setup
        driver = initilizeDriver(browserType);
        switch (baseURL) {
            case "qa":
                url = "https://www.saksfifthavenue.com/";
                break;
            case "stage":
                url = "https://www.saksfifthavenue.com/";
                break;
            case "prod":
                url = "https://www.saksfifthavenue.com/";
                break;
        }
        driver.get(url);


    }

    @After
    public void tearDown(Scenario scenario){

            try {
                if (scenario.isFailed()) {
                    final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                    scenario.attach(screenshot, "image/png", scenario.getName());
                }

            } catch (Exception e) {
                System.out.println(e);
            }

//            driver.quit();
        }





}
