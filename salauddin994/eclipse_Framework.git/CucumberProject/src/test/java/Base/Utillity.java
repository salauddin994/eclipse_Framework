package Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utillity extends Config{
	
	public static void mouseHoverOver(WebElement element,WebElement clickElement) {
		
		WebElement hover=element;
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		clickElement.click();
	}
	
	public static void dropdownByVisibleText(WebElement element, String value) {
        Select se = new Select(element);
        se.selectByVisibleText(value);
    }
	public static void dropdownByIndex(WebElement element, int indexNum) {
        Select se = new Select(element);
        se.selectByIndex(indexNum);
    }
	public static void dropdownByValue(WebElement element, String value) {
        Select se = new Select(element);
        se.selectByValue(value);
    }
}
