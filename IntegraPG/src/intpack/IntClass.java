package intpack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IntClass {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		URL whichsystem=new URL("http://10.10.10.36:4444/wd/hub");
		DesiredCapabilities whichbrowser=new DesiredCapabilities();
		whichbrowser.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(whichsystem,whichbrowser);
		driver.get("https://www.google.co.in");
	}

}
