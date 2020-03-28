//this class will cycle thru all open webdriver windows, giving the handle and the URL
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class HandlingMultipleWindows {
	public static void handlingMultipleWindows(WebDriver dr){
		Set<String> windowHandles = dr.getWindowHandles();
		Iterator<String> iWHandles = windowHandles.iterator();

		for(int i = 0; i < windowHandles.size(); i++){
			dr.switchTo().window(iWHandles.next());
			String currentUrl = dr.getCurrentUrl();
			String currentHandle = dr.getWindowHandle();
			System.out.println("Current window URL is " + currentUrl + " and current handle is " + currentHandle);
		}
		dr.switchTo().defaultContent();
	}
}
